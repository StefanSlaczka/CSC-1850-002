// abstract class hape
public abstract class Shape{
    protected String name;
    protected double x;
    protected double y;

    //Constructor
    public Shape(String name, double x, double y){
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public abstract void displayInfo();

    // Concrete method
    public void displayLocation(){
        System.out.println(name + " is located at (" + x + ", " + y + ")");
    }

    // Getters and setters
    public String getName(){return name;}
    public double getX(){return x;}
    public double getY(){return y;}

    public void setName(String name){
        this.name = name;
    }
    public void setLocation(double x, double y){
        this.x = x;
        this.y = y;
    }
}