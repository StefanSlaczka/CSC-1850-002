class Student extends Person{
	int studentID;
	public Student(String name, int age, int id){
		super(name, age);
		studentID = id;
	}

	public String toString(){
		System.out.println("String " + name + " is " + age + " id " + studentID);
		return "";
	}

	public String toString(int x){
		toString();
		return "";
	}
}