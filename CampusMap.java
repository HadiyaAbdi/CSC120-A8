import java.util.ArrayList;

public class CampusMap {

    ArrayList<Building> buildings;

    /* Default constructor, initializes empty ArrayList */
    public CampusMap() {
        buildings = new ArrayList<Building>();
    }

    /**
     * Adds a Building to the map
     * @param b the Building to add
     */
    public void addBuilding(Building b) {
        System.out.println("Adding building...");
        buildings.add(b);
        System.out.println("-->Successfully added " + b.getName() + " to the map.");
    }

    /**
     * Removes a Building from the map
     * @param b the Building to remove
     * @return the removed Building
     */
    public Building removeBuilding(Building b) {
        System.out.println("Removing building...");
        buildings.remove(b);
        System.out.println("-->Successfully removed " + b.getName() + " to the map.");
        return b;
    }

    public String toString() {
        String mapString = "DIRECTORY of BUILDINGS";

        for (int i = 0; i < this.buildings.size(); i ++) {
            mapString += "\n  " + (i+1) + ". "+ this.buildings.get(i).getName() + " (" + this.buildings.get(i).getAddress() + ")";
        }
        return mapString;
    }

    public static void main(String[] args) {
        CampusMap myMap = new CampusMap();
        myMap.addBuilding(new Building("Ford Hall", "100 Green Street Northampton, MA 01063", 4, true));
        myMap.addBuilding(new Building("Bass Hall", "4 Tyler Court Northampton, MA 01063", 4, false));

        //House
        House Ziskind = new House("Ziskind House", "10 Elms street", 4, true);
        myMap.addBuilding(Ziskind);
        Student Abdule = new Student("Abdule", "4463 Laagbarako st", 01);
        Ziskind.moveIn(Abdule);

        House washburn = new House("Washburn house", "10 Green street", 0, false);
        myMap.addBuilding(washburn);
        Student Hibaaq = new Student("Hibaaq", "4463 Laagbarako st", 01);
        washburn.moveOut(Hibaaq);
        
        //Library
        Library hillyer = new Library("Hillyer Library", "22 Elm St", 2, true);
        myMap.addBuilding(hillyer);

        hillyer.addTitle(new String[] {"Long walk to water", "To Kill a Mockingbird"});
        hillyer.checkOut("Long walk to water, To Kill a Mockingbird");
        hillyer.returnBook("Long walk to water");
            hillyer.removeTitle("To Kill a Mockingbird");
    
            // Cafee
            Cafe cc = new Cafe("Compass Center", "Cafe", 1, 10, 1, 0, 25);
            myMap.addBuilding(cc);

            cc.sellCoffee(4, 0, 1, "Espresso");
            cc.restock(10, 1, 0, 5);

            // adding builidng 
            myMap.addBuilding(new Building("Musuem of Art", "100 Green Street Northampton, MA 01063", 4,true));
            myMap.addBuilding(new Building("McConnel Hall", "10 green street", 4, true));
            myMap.addBuilding(new Building("Gillet House", "10 Green street", 2, false));
            myMap.addBuilding(new Building("Lamont House", "10 Green street", 0, false));
            myMap.addBuilding(new Building("Albright House", "10 Green street", 3, true));

            System.out.println(myMap);
        }



    }


    

