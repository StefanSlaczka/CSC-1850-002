class Test {
	public static void main(String[] args){
		System.out.println(" instance of example");
		Person p = new Student("John", 19, 1234);
		System.out.println(p instanceof Person);
		System.out.println(p instanceof Student);
		// Student s = new Person("Jane", 19); // Error
		System.out.println("casting");
		// Student t = p; // Error
		System.out.println(p);
		Student t = (Student) p;
		System.out.println(t);
	}
}