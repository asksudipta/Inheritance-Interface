package lexicon.se.InheritanceExercise1;

public class Car extends Vehicle{
    int numberOfDoors;
    int numberOfPassengers;

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    public void drive() {
        System.out.println("Car is driving");
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfDoors=" + numberOfDoors +
                ", numberOfPassengers=" + numberOfPassengers +
                ", vehicleId=" + vehicleId +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }

    public Car(int vehicleId, String registrationNumber, String brand, int numberOfDoors, int numberOfPassengers) {
        super(vehicleId, registrationNumber, brand);
        this.numberOfDoors = numberOfDoors;
        this.numberOfPassengers = numberOfPassengers;
    }
}
