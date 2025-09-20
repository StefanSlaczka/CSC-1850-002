public class Holiday {

	// making varibales for the object
	private String name;
	private int day;
	private String mouth;

	// constucter
	public Holiday(String name, int day, String mouth){
		this.name = name;
		this.day = day;
		this.mouth = mouth;
	}

	// constucter
	public Holiday() {
		this.name = "";
		this.day = 0;
		this.mouth = "";
	}

	// get name
	public String getName(){
		return name;
	}

	// set name
	public void setName(String name) {
		this.name = name;
	}

	// get day
	public int getDay(){
		return day;	
	}

	// set day
	public void setDay(int day){
		this.day = day;
	}
	
	// get mouth
	public String getMouth() {
		return mouth;
	}

	// set mouth
	public void setMouth(String mouth){
		this.mouth = mouth;
	}
	
	// comparesing 2 different mouths
	public boolean isSameMouth(Holiday hd) {
		return this.mouth.equalsIgnoreCase(hd.mouth);
	}
	
}