public class Test {
    public static void main(String[] args) {
        // Create shape objects
        Shape circle = new Circle("My Circle", 1.0, 2.0, 3.0);
        Shape triangle = new Triangle("My Triangle", 0.0, 0.0, 4.0, 0.0, 2.0, 3.0);
        Shape eqTriangle = new EquilateralTriangle("My Eq Triangle", 5.0, 5.0, 4.0);
        
        // Test polymorphism - same type (Shape) but different behaviors
        System.out.println("=== Testing Polymorphism ===");
        circle.displayInfo();
        triangle.displayInfo();
        eqTriangle.displayInfo();
        
        // Test interface implementation
        System.out.println("\n=== Testing Area Interface ===");
        System.out.println("Circle area: " + ((Circle)circle).getArea());
        System.out.println("Equilateral Triangle area: " + ((EquilateralTriangle)eqTriangle).getArea());
        
        // Test abstract class - cannot instantiate
        System.out.println("\n=== Testing Abstract Class ===");
        System.out.println("Shape is abstract - cannot create: new Shape(\"test\", 0, 0)");
    }
}