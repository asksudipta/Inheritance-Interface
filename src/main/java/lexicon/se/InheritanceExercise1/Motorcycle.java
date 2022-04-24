package lexicon.se.InheritanceExercise1;

public class Motorcycle extends Vehicle {

    String motorcycleType;

    public Motorcycle(int vehicleId, String registrationNumber, String brand, String motorcycleType) {
        super(vehicleId, registrationNumber, brand);
        this.motorcycleType = motorcycleType;
    }

    public String getMotorcycleType() {
        return motorcycleType;
    }

    public void setMotorcycleType(String motorcycleType) {
        this.motorcycleType = motorcycleType;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "motorcycleType='" + motorcycleType + '\'' +
                ", vehicleId=" + vehicleId +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }

    @Override
    public void drive() {
        System.out.println("Motorcycle is driving");
    }
}
