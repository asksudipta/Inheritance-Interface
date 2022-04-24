package lexicon.se.InheritanceExercise1;

public class MainTest {

    public static void main(String[] args) {
        Car car=new Car(1,"ABC213","Volvo",4,4);
        System.out.println(car);
        car.drive();

        Motorcycle motorcycle=new Motorcycle(2,"WBS635","Royal Enfild","Bike");
        System.out.println(motorcycle);
        motorcycle.drive();

        Truck truck=new Truck(3,"BXG98","Mercides",120,3000);
        System.out.println(truck);
        truck.drive();
    }
}
