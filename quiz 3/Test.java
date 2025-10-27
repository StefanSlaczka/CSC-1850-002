public class Test{
	public static void main(String[] args){
		Person p = new Person("John", 20);
		Student s = new Student("Jane",21, 1234);
		System.out.println(p.name);
		System.out.println(p.age);
		p.toString();
		System.out.println(p);
		System.out.println(s.name);
		;
		;
		;
		;
		;
		
		System.out.println(s.age);
		System.out.println(s.studentID);
		s.toString();
		s.toString(123);
		System.out.println(s);
	}

}