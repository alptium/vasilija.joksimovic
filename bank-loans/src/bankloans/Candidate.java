package bankloans;

public class Candidate {

	private String name;
	private String surname;
	private int age;
	private String hasPermanentJob;
	private int averageSallary;
	private String isMarried;
	private String hasAnotherLoan;
	private String creditType;
	
	public Candidate (String name, String surname, int age, String hasPermanentJob, int averageSallary, String isMarried, String hasAnotherLoan, String creditType) {
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.hasPermanentJob = hasPermanentJob;
		this.averageSallary = averageSallary;
		this.isMarried = isMarried;
		this.hasAnotherLoan = hasAnotherLoan;
		this.creditType = creditType;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public int getAverageSallary() {
		return averageSallary;
	}
	
	public String getHasPermanentJob() {
		return hasPermanentJob;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getIsMarried() {
		return isMarried;
	}
	
	public String getHasAnotherLoan() {
		return hasAnotherLoan;
	}
	public String getCreditType() {
		return creditType;
	}
	
}
