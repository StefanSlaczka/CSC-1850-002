class Person{
	String name;
	int age;
	Person(String n, int a){
		name = n; age = a;
	}
}

class Student extends Person{
	int sID;
	Student(String n, int a, int id){
		super(n,a);
		sID = id;
	}
}