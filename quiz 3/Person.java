class Person {
	String name;
	int age;
	public Person(String name, int age){
		this.name = name; this.age = age;
	}

	public String toString(){
		System.out.println("name " + name + "age " + age);
		return "";
	}
}