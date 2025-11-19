public class EquilateralTriangle extends Triangle implements AreaCalculable {
    private double sideLength;
    
    public EquilateralTriangle(String name, double x, double y, double sideLength) {
        // For equilateral triangle, we calculate the other two vertices
        super(name, x, y, 
              x + sideLength, y,  // second vertex
              x + sideLength/2, y + (Math.sqrt(3)/2 * sideLength)); // third vertex
        this.sideLength = sideLength;
    }
    
    @Override
    public double getArea() {
        return (Math.sqrt(3) / 4) * sideLength * sideLength;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Equilateral Triangle: " + name + 
                         ", Vertex A: (" + x + ", " + y + ")" +
                         ", Side Length: " + sideLength +
                         ", Area: " + String.format("%.2f", getArea()));
    }
    
    // Getters and setters
    public double getSideLength() { return sideLength; }
    public void setSideLength(double sideLength) { this.sideLength = sideLength; }
}