// Define the Car class
class Car {
    // Attributes (fields)
    String make;
    String model;
    int year;

    // Constructor to initialize the Car object
    Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Method to display car details
    void displayDetails() {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
        System.out.println("------------------------");
    }
}

// Main class to create and use Car objects
public class CarDemo {
    public static void main(String[] args) {
        // Create Car objects
        Car car1 = new Car("Toyota", "Camry", 2020);
        Car car2 = new Car("Honda", "Civic", 2018);

        // Call the displayDetails method on each object
        car1.displayDetails();
        car2.displayDetails();
    }
}
