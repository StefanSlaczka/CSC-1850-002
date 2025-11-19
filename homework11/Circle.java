public class Circle extends Shape implements AreaCalculable {
    private double radius;
    
    public Circle(String name, double x, double y, double radius) {
        super(name, x, y);
        this.radius = radius;
    }
    
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Circle: " + name + 
                         ", Center: (" + x + ", " + y + ")" +
                         ", Radius: " + radius +
                         ", Area: " + String.format("%.2f", getArea()));
    }
    
    // Getters and setters
    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }
}