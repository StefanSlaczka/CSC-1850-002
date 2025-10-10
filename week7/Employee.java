class Employee extends Person{
	public Employee(){
		this("(2) Invoke EMployee's overloading constuctor");
		System.out.println("(3) Emloyee's no-arg constructor is involed");
	}
	public Employee(String s){
		System.out.println(s);
	}
}