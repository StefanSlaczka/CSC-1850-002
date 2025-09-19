public class main{
	public static void main(String[] arr){
	System.out.println(Student.getTotalNumberOfStudent());
	
	Student alice = new Student("alice");
	Student bob = new Student("bob");
	Student cindy = new Student("cindy");

	System.out.println(Student.getTotalNumberOfStudent());
	System.out.println(bob.getID() + "is bob's id");
	System.out.println("Cindy's gpa is " + cindy.getGpa());

	cindy.setGpa(4.0, 4321);
	System.out.println("Cindy's gpa is " + cindy.getGpa());

	cindy.setGpa(4.0, 1234);
	System.out.println("Cindy's gpa is " + cindy.getGpa());

	}
}