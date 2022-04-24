package lexicon.se.InheritanceExercise1;

public class Truck extends Vehicle{
    int maxSpeed;
    int maxWeight;


    public Truck(int vehicleId, String registrationNumber, String brand, int maxSpeed, int maxWeight) {
        super(vehicleId, registrationNumber, brand);
        this.maxSpeed = maxSpeed;
        this.maxWeight = maxWeight;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "maxSpeed=" + maxSpeed +
                ", maxWeight=" + maxWeight +
                ", vehicleId=" + vehicleId +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }

    @Override
    public void drive() {
        System.out.println("Truck is driving");
    }
}
