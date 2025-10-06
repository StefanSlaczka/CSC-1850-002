class Test{
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(4.0, 40.0);
		Rectangle r2 = new Rectangle(3.5, 35.9);

		System.out.println(r1.width + r1.hight);
		System.out.println(r1.getAera());
		System.out.println(r1.getPerimeter());
		System.out.println(r2.width + r2.hight);
		System.out.println(r2.getAera());
		System.out.println(r2.getPerimeter());
	}
}