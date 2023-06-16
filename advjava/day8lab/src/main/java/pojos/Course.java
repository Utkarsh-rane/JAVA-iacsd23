package pojos;

public enum Course {
	DAC(90000),DITIS(75000),DBDA(120000);
	private int fees;

	private Course(int fees) {
		this.fees = fees;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}
	
	
}
