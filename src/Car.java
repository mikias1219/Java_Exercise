public class Car {
    private String model;
    private String color;
    private static int count = 0; // static variable to keep track of the number of cars

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
        count++; // increment the count each time a new Car object is created
    }

    public void drive() {
        System.out.println(color + " " + model + " is driving."); // instance method
    }

    public static int getCount() {
        return count; // static method to get the count of cars
    }

    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Blue");
        Car car2 = new Car("Honda", "Red");

        car1.drive(); // instance method call
        car2.drive();

        System.out.println("Total number of cars: " + Car.getCount()); // static method call
    }
}
