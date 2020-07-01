package javaleads.lesson2;

public abstract class Vehicle{
    private String type;
    private int capacity;
    abstract  void runVehical();
    public void printVehicleDetails(){
        System.out.println(String.format("Type: %s. Capacity: %s", type, capacity));

    };

}
