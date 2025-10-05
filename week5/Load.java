class Loan {
	private double annualInterstRate;
	private int numberOfYears;
	private double loanAmount;
	private java.util.Date loanDate;

	public Loan(){ this(2.5, 10, 1000);}

	public Loan(double annualInterstRate, int numberOfYears, double loanAmount){
		this.annualInterstRate = annualInterstRate;
		this.numberOfYears = numberOfYears;
		this.loanAmount = loanAmount;
		loanData = new java.util.Date();
	}

	public double getAnnualIntresestRate(){
		return annualInterstRate;
	}

	public void setAnnualInterstRate(double annualInterstRate){
		this.annualInterstRate = annualInterstRate;
	}

	public void setNumberOfYears(int numberOfYears){
		this.numberOfYears = numberOfYears;
	}
	
	public void setLoanAmount(double loanAmount){
		this.loanAmount = loanAmount;
	}

}