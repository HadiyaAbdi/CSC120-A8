/* This is a stub for the Library class */

import java.util.Hashtable;
import java.util.ArrayList;

class Library extends Building {
  private Hashtable<String, Boolean> collection;

  //private boolean hasElevator;
  public Library(String name, String address, int nFloors, boolean hasElevator) {
      super(name, address, nFloors, hasElevator);
      this.collection = new Hashtable<String, Boolean>();
      System.out.println("You have built a library: 📖");
    }

    @Override
    public void showOptions(){
      super.showOptions(); //shows the options for the building
      System.out.println("More options for Library:\n + checkOut(title) \n + returnBook(title)");
    }

    @Override
    public void goToFloor(int floorNum) { // Used copilot to solve an issue
      if (!hasElevator) {
         if (Math.abs(floorNum - activeFloor) != 1) {
            throw new RuntimeException("You can only move one floor at a time in this building.");
        }
    }
      if (floorNum < 1 || floorNum > this.nFloors) {
        throw new RuntimeException("Invalid floor number.");
    }
        System.out.println("You are now on floor #" + floorNum + " of the library.");
        this.activeFloor = floorNum;
  }
    
    // add books // overloaded
    public void addTitle(String[] titles){
        for(String title: titles){
        collection.put(title, true);
        System.out.println(title + " was added");
      }

    }
    // remove books
    public String removeTitle(String title){
      return collection.remove(title) != null ? title + " has been removed, and isnt in the collection": null;
    }
// check out books //overloaded
    public void checkOut(String titlesString){
      String[] titles = titlesString.split(", ");
      for(String title: titles){
        if(Boolean.TRUE.equals(collection.get(title))){
          collection.replace(title, false);
          System.out.println(title + " has been checked out");
        }else{
          System.out.println(title + " is not available");
        }
      }
    }
    //String[] titles = null;
      //for(String title: titles){
      //  if(Boolean.TRUE.equals(collection.get(title))){
      //  collection.replace(title, false);
      //  System.out.println(title + " has been checked");
    //  }else{
      //  System.out.println(title + "Not available");
     // }}
   // }
//return books
    public void returnBook(String title){
      if(collection.containsKey(title)){
        collection.replace(title, true);
        System.out.println(title + "returned");

      }else{
        System.out.println(title + "Not in the collection");
      }
    }
    
  
    public static void main(String[] args) {
     Library Gabiley = new Library("Gabiley", "21 Laagbarako  st", 2, hasElevator);
      Gabiley.addTitle(new String[]{"The Maktabad", "Java floor2"});
    }
  
  }