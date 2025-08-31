import java.util.Scanner;

public class IsCirclesOverLap {
    static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args){
        String choice;
        do {
            Reading();
            System.out.println("Would you like to check another pair of circles? (y:Yes/n:No): ");
            choice = scanner.next();
        } while (choice.equalsIgnoreCase("y"));
        scanner.close();
	}

	public static void Reading(){

		// reading the first circle
		System.out.println("Enter the details of the first circle: ");
		System.out.println("Enter x-coordenante of the center: ");
		double x1 = scanner.nextDouble();
		System.out.println("Enter y-coordenante of the center: ");
		double y1 = scanner.nextDouble();
		System.out.println("Enter the radius: ");
		double r1 = scanner.nextDouble();

		// reading the seconed circle
		System.out.println("Enter the details of the seconed circle: ");
		System.out.println("Enter x-coordenante of the center: ");
		double x2 = scanner.nextDouble();
		System.out.println("Enter y-coordenante of the center: ");
		double y2 = scanner.nextDouble();
		System.out.println("Enter the radius: ");
		double r2 = scanner.nextDouble();
	
		IsOverLaping(x1, y1, r1, x2, y2, r2);

	}
	
	public static void IsOverLaping(double x1,double y1,double r1,double x2,double y2,double r2){
		// Calculate distance between centers
        	double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

		String relationship;
		if (distance == 0 && r1 == r2) {
                	relationship = "Perfect overlap";
            	} else if (distance <= Math.abs(r1 - r2)) {
                	relationship = "One circle is inside the other";
            	} else if (distance < r1 + r2) {
                	relationship = "Partially overlapping";
            	} else {
                	relationship = "Disjoint";
            	}

		System.out.println("the circles are : " + relationship);
	}
}