class Student {
	private int id;
	private String name;
	private static int totalNumOfStudnet;
	// static means its alread there even though there is no class
	private double gpa;

	public Student(String name){
		totalNumOfStudnet++;
		this.id = totalNumOfStudnet;
		this.name = name;
	}

	public static int getTotalNumberOfStudent() {
		return totalNumOfStudnet;
	}

	public int getID() {
		return  id;	
	}

	public String getName(){
		return name;
	}

	public double getGpa(){
		return gpa;
	}

	public void setGpa(double newGpa, int passCode) {
		if(passCode == 1234) {gpa=newGpa; }
		else {System.out.println("Wrong passcode");}
	}
}