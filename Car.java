public class Car {

    int numDoors;
    boolean isElectric;

    public Car(){
        numDoors = 4;
        isElectric = false;
    }

    public Car(int numDoors, boolean isElectric) {}

    public void print(){
        System.out.println("Number of Doors: " + numDoors);
        System.out.println("Is Electric: " + isElectric);
    }
}