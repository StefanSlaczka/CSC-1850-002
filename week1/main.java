class Point {
	double x;
	double y;

	public void move(double x, double y){
		this.x = x; this.y = y;
	}

	public int move(char dir, double dist){
		if(dir == 'N' || dir == 'n'){
			y+=dist;
		}
		else if(dir == 'S' || dir == 's'){
			y-=dist;
		}
		else if(dir == 'E' || dir == 'e'){
			x+=dist;
		}
		else if (dir == 'W' || dir == 'w'){
			x-=dist;
		}
		else{
			return -1;
		}
		return 0;
	}

	/* Constructor
	Point(double x, double y){

	}*/
}

public class main{
	public static void main(String[] arr){
		Point p1 = new Point();
		System.err.println(p1.x);
	}
}