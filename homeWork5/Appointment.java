class Appointment {
	private String docName;
	private String patientName;
	private String dayName;
	private double howLongItTakes;

	public Appointment() {}
	public Appointment(String docName, String patientName, String dayName, double howLongItTakes) {
		this.docName = docName;
		this.patientName = patientName;
		this.dayName = dayName;
		this.howLongItTakes = howLongItTakes;
	}

	// Accessors
	public String getDocName(){
		return docName;
	}

	public String getPatientName(){
		return  patientName;
	}

	public String getDayName(){
		return dayName;
	}

	public double getHowLongItTakes(){
		return howLongItTakes;
	}

	// modifirs
	public void setDocName(String newDocName){
		this.docName = newDocName;
	}

	public void setPatientName(String newPatientName){
		this.patientName = newPatientName;
	}

	public void setDayName(String newDayName){
		this.dayName = newDayName;
	}

	public void setHowLongItTakes(double newHowLongItTakes){
		this.howLongItTakes = newHowLongItTakes;
	}

}