public class Building {

    protected String name;
    protected String address;
    protected int nFloors;
    protected int activeFloor = -1; // Default value indicating we are not inside this building
    protected static boolean hasElevator = false; // indicates no elevator
     /* Default constructor */
        public Building() {
            this("<Name Unknown>", "<Address Unknown>", 1, false);
        }
    
        /* Overloaded constructor with address only */
        public Building(String address) {
            this(); // Call default constructor
            this.address = address; // Override address
        }

        /* Overloaded constructor with name, address, and floors */
        public Building(String name, String address, int nFloors, int activeFloor) {
            this(name, address, nFloors, false); // Call full constructor with default hasElevator value
            if(activeFloor >= 1 && activeFloor <= nFloors){
                this.activeFloor = activeFloor;
            } else{
                System.out.println("Invalid floor. Should be between 1 and " + nFloors + ".");
                this.activeFloor = 1; // Default to ground floor
            }
        }
    
        /* Full constructor */
        public Building(String name, String address, int nFloors, boolean hasElevator) {
            if (name != null) { this.name = name; }
            if (address != null) { this.address = address; } 
            if (nFloors < 1) {
                throw new RuntimeException("Cannot construct a building with fewer than 1 floor.");
            }
            this.nFloors = nFloors;
            this.hasElevator = hasElevator;
        }
    
        /* Accessors */
        public String getName() {
            return this.name;
        }
    
        public String getAddress() {
            return this.address;
        }
    
        public int getFloors() {
            return this.nFloors;
        }
    
        /* Navigation methods */
        public Building enter() {
            if (activeFloor != -1) {
                throw new RuntimeException("You are already inside this Building.");
            }
            this.activeFloor = 1;
            System.out.println("You are now inside " + this.name + " on the ground floor.");
            return this; // Return a pointer to the current building
        }
    
        public Building exit() {
            if (this.activeFloor == -1) {
                throw new RuntimeException("You are not inside this Building. Must call enter() before exit().");
            }
            if (this.activeFloor > 1) {
                throw new RuntimeException("You have fallen out a window from floor #" +this.activeFloor + "!");
            }
            System.out.println("You have left " + this.name + ".");
            this.activeFloor = -1; // We're leaving the building, so we no longer have a valid active floor
            return null; // We're outside now, so the building is null
        }
        
        public void goToFloor(int floorNum) {
            if (this.activeFloor == -1) {
                throw new RuntimeException("You are not inside this Building. Must call enter() before navigating between floors.");
            }
            if(!this.hasElevator && Math.abs(this.activeFloor - floorNum) > 1) {
                throw new RuntimeException("This building has no elevator");
            }
            if (floorNum < 1 || floorNum > this.nFloors) {
                throw new RuntimeException("Invalid floor number. Valid range for this Building is 1-" + this.nFloors +".");
            }
            System.out.println("You are now on floor #" + floorNum + " of " + this.name);
            this.activeFloor = floorNum;
        }
    
        public void goUp() {
            this.goToFloor(this.activeFloor + nFloors);
        }
    
        public void goDown() {
            this.goToFloor(this.activeFloor - nFloors);
        }
        public void showOptions() {
            System.out.println("Available options at " + this.name + ":\n + enter() \n + exit() \n + goUp() \n + goDown()\n + goToFloor(n)");
        }
    
        public String toString() {
            return this.name + " is a " + this.nFloors + "-story building located at " + this.address + ".";
        }
    
        public static void main(String[] args) {
            System.out.println("------------------------------------");
            System.out.println("Test of Building constructor/methods");
            System.out.println("------------------------------------");
            
            Building fordHall = new Building("Ford Hall", "100 Green Street Northampton, MA 01063", 4, hasElevator);
        System.out.println(fordHall);
        fordHall.showOptions();

        System.out.println("-----------------------------------");
        System.out.println("Demonstrating enter/exit/navigation");
        System.out.println("-----------------------------------");
        fordHall.enter();
        fordHall.goUp();
        fordHall.goDown();
        fordHall.exit();
    }

}