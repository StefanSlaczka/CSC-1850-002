public class hello_world{
	public static void main(String[] arr){
		System.out.println("Hello World");

		Circle c = new Circle();
		System.err.println(c.x + " " + c.y + " " + c.r);
		c.x = 123; c.y = 321; c.r = 222;
		System.err.println(c.x + " " + c.y + " " + c.r);

	}
}