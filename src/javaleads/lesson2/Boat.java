package javaleads.lesson2;

public class Boat extends Vehicle{
    private int engineCount;

    @Override
    void runVehical() {
        System.out.println("Boat is Running");
    }
    @Override
    public void printVehicleDetails(){
        super.printVehicleDetails();
    }

}
