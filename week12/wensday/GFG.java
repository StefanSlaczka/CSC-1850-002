class GFG {
	public static void main(String[] args){
		MyClass obj = new MyClass();
		obj.getAge();
	}
}

interface Age{
	int x = 21;
	void getAge();
}

class MyClass implements Age {
	public void getAge() {
		System.out.println("Age is " + x);
	}
}