

public class CSCS1850_HW2_Stefan_Slaczka {
	static class Circle{
		public double  x = 0;
		public double  y = 0;
		public double  r = 0;
		
		// Constucter
		public Circle(double x, double y, double r) {
			this.x = x; this.y = y; this.r = r;
		}

		// retruns the circumference
		public double getCircumference(){
			return 2 * Math.PI * r;
		}

		// retruns the area
		public double getArea(){
			return Math.PI * r * r;
		}

		// Prints the cericls x,y,r and with out this it will print the memory address instead
		// Override is not needed but it gets ride of the warning
		@Override
		public String toString() {
			return "Circle(center=(" + x + "," + y + "), radius=" + r + ")";
		}
	}

	public static void main(String[] args) {
		// Starts with the basic vaules into the class
		Circle cOne = new Circle(0,10,5);
		Circle cTwo = new Circle(7,7,8);

		System.err.println("First Circle: " + cOne);
		System.err.println("Seconed Circle: " + cTwo);

		// Gets the data from the method for circrufence
		double cOneCirc = cOne.getCircumference();
		double cTwoCirc = cTwo.getCircumference();

		if (cOneCirc > cTwoCirc){
			System.err.println("Cricle one is larger in the circrufence");
		}else if(cOneCirc < cTwoCirc){
			System.err.println("Cricle two is larger in the circrufence");
		}else {
			System.err.println("Cricle one and Cricle two are the same circrufence");
		}

		// Gets the data from the method for area
		double cOneArea = cOne.getArea();
		double cTwoArea = cTwo.getArea();

		if (cOneArea > cTwoArea){
			System.err.println("Cricle one is larger in the area");
		}else if(cOneArea < cTwoArea){
			System.err.println("Cricle two is larger in the area");
		}else {
			System.err.println("Cricle one and Cricle two are the same area");
		}
	}

}