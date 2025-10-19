public class Test {
    public static void main(String[] args) {
        // Create a Car object
        Car car = new Car("Honda Civic ", 2018);
        System.out.println("Car: " + car);

        // Create a Minivan object
        Minivan minivan = new Minivan("Toyota Sienna", 7);
        System.out.println("Minivan: " + minivan);

        // Create a Truck object
        Truck truck = new Truck("Ford F-150", 3);
        System.out.println("Truck: " + truck);

        // Test setters and getters
        minivan.setMaxPassengers(8);
        System.out.println("Updated Minivan: " + minivan);

        truck.setCargo(5);
        System.out.println("Updated Truck: " + truck);
    }
}
