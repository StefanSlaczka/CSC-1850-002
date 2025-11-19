public class Triangle extends Shape {
    protected double x1, y1, x2, y2;
    
    public Triangle(String name, double x, double y, double x1, double y1, double x2, double y2) {
        super(name, x, y);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Triangle: " + name + 
                         ", Vertex A: (" + x + ", " + y + ")" +
                         ", Vertex B: (" + x1 + ", " + y1 + ")" +
                         ", Vertex C: (" + x2 + ", " + y2 + ")");
    }
    
    // Method to calculate distance between two points
    protected double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    
    // Getters and setters
    public double getX1() { return x1; }
    public double getY1() { return y1; }
    public double getX2() { return x2; }
    public double getY2() { return y2; }
}