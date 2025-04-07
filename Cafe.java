/* This is a stub for the Cafe class */
public class Cafe extends Building {
    private int nCoffeeOunces; // the number of ounces of coffee in the cafe
    private int nSugarPackets; // the number of sugar packets in the cafe
    private int nCreams; // the number of creams in the cafe
    private int nCups; // the number of cups in the cafe
    // Constructor
    public Cafe(String name, String address, int nFloors, int coffee, int sugar, int cream, int cups) {
       super(name, address, nFloors, hasElevator);
         this.nCoffeeOunces = coffee;
            this.nSugarPackets = sugar;
            this.nCreams = cream;
            this.nCups = cups;
            this.address = address;
            this.nFloors = nFloors;
            this.name = name;
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
    if(!this.hasElevator && Math.abs(this.activeFloor - floorNum) > 1) {
      throw new RuntimeException("This building has no elevator");
    }
    if (floorNum < 1 || floorNum > this.nFloors) {
      throw new RuntimeException("Invalid floor number." + " choose between those floor numbers" + this.nFloors +".");
    }
    System.out.println("The floor you are in now is" + floorNum + " of " + this.name);
    this.activeFloor = floorNum;}
    // Method to sell coffee // overloaded
    public void sellCoffee(int size, int sugar, int cream, String coffeeType){
        System.out.println("selling coffee" + coffeeType);
        this.sellCoffee(size, sugar, cream, coffeeType);
       // if(nCoffeeOunces < size || nSugarPackets < sugar || nCreams < cream || nCups < 1){
           // restock();     
        
        nCoffeeOunces -= size;
        this.nSugarPackets -= sugar;
        this.nCreams -= cream;
        this.nCups -= 1;
}
    // Method to restock the cafe // overloaded
    public void restock(int coffee, int sugar, int cream, int cups){
        this.nCoffeeOunces += coffee;
        this.nSugarPackets += sugar;
        this.nCreams += cream;
        this.nCups += cups;
        System.out.println("Restocked" + sugar + "sugar bags" + cream + "cream, &" + cups + "cups" + coffee + "coffee");
    }
    public static void main(String[] args) {
        Cafe LaasGeel = new Cafe("Hargeysa", "100ka jir", 2, 100, 10, 100, 20);
        LaasGeel.sellCoffee(10, 2, 3, "Espresso");
        System.out.println("coffee is sold!");
    }
    
}
