class Main {
	public static void main(String[] args){
		System.out.println("Hello World");
		Person p = new Student();
	}
}

abstract class Person{
	String name;
	public abstract void methodExample();
}

class Student extends Person{
	int studentID;
	public void methodExample(){
		System.out.println("must impelemtn abstract method");
	}
}