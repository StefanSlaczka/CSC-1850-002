class Circle {
	double x;
	double y;
	double r;

    Circle() {
    }

	Circle(double x, double y, double r){
		this.x=x;
		this.y=y;
		this.r=r;
	}

	double getArea(){
		return 3.1415926*r*r;
	}

}