/* This is a stub for the Cafe class */
public class Cafe extends Building {
    private int nCoffeeOunces; // the number of ounces of coffee in the cafe
    private int nSugarPackets; // the number of sugar packets in the cafe
    private int nCreams; // the number of creams in the cafe
    private int nCups; // the number of cups in the cafe
    // Constructor
    public Cafe(String name, String address, int nFloors, int coffee, int sugar, int cream, int cups) {
       super(name, address, nFloors, true); //assume cafe doesnt have elaveator
         this.nCoffeeOunces = coffee;
            this.nSugarPackets = sugar;
            this.nCreams = cream;
            this.nCups = cups;
            
        System.out.println("You have built a cafe: ☕");
    }

    @Override
    public void showOptions(){
      super.showOptions(); //shows the options for the building
      System.out.println(" + sellCoffee(size, sugar, cream) \n + restock()");
    }

  @Override
  public void goToFloor(int floorNum){
    if (this.activeFloor == -1) {
      throw new RuntimeException("You are not inside this Building. Must call enter() before navigating between floors.");
    }
    if (floorNum < 1 || floorNum > this.nFloors) {
      throw new RuntimeException("Invalid floor number." + " choose between those floor numbers" + this.nFloors +" . ");
    }
    System.out.println("The floor you are in now is" + floorNum + " of " + this.name);
    this.activeFloor = floorNum;}

    // Method to sell coffee // overloaded
    public void sellCoffee(int size, int sugar, int cream, String coffeeType){
        System.out.println("selling coffee " + coffeeType); 
        //this.sellCoffee(size, sugar, cream, coffeeType);
        if(nCoffeeOunces < size || nSugarPackets < sugar || nCreams < cream || nCups < 1){
          System.out.println("Not enough ingredients to sell coffee.");
           restock(50,10,5,5);    }
        
        nCoffeeOunces -= size;
        nSugarPackets -= sugar;
        nCreams -= cream;
        nCups -= 1;
        System.out.println("Sold a " + coffeeType + " coffee with " + size + " ounces of coffee, " + sugar + " sugar packets, and " + cream + " creams.");
}
    // Method to restock the cafe // overloaded
    public void restock(int coffee, int sugar, int cream, int cups){
        this.nCoffeeOunces += coffee;
        this.nSugarPackets += sugar;
        this.nCreams += cream;
        this.nCups += cups;
        System.out.println("Restocked, " + coffee + "coffee " + sugar + "sugar bags, " + cream + "cream, and " + cups + "cups.");
    }
    public static void main(String[] args) {
        Cafe LaasGeel = new Cafe("Hargeysa", "100ka jir", 2, 100, 10, 100, 20);
        LaasGeel.enter();
        LaasGeel.sellCoffee(10, 2, 3, "Espresso");
        LaasGeel.sellCoffee(90,10,100, "Large coffee");
        LaasGeel.exit();
        System.out.println("coffee is sold!");
    }
    
}
