package javaleads.lesson1;

public class Vehicle {
    private String type;
    private  int cap;
    public void printVehicalDetails(){
        System.out.println(String.format("Type: %s. Capacity: %s", type, cap));
    }
    public void runVehiclel(){
        System.out.println("Car is running");
    }
}
