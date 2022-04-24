package lexicon.se.InheritanceExercise1;

public abstract class Vehicle {
    int vehicleId ;
    String registrationNumber ;
    String brand ;

    public Vehicle() {

    }

    public abstract void drive();

    public Vehicle(int vehicleId, String registrationNumber, String brand) {
        this.vehicleId = vehicleId;
        this.registrationNumber = registrationNumber;
        this.brand = brand;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
