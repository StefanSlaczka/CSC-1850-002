class Rectangle{
	double hight = 1;
	double width = 1;

	public Rectangle(){}
	public Rectangle(double hight, double width){
		this.hight = hight;
		this.width = width;
	}

	public double getAera(){
		return (width * hight);
	}

	public double getPerimeter(){
		return (2* width) + (2 * hight);
	}
}