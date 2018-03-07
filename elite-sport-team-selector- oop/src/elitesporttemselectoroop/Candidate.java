package elitesporttemselectoroop;

public class Candidate {
	private String name;
	 private String surname;
	 int age;
	 int height;
	 int weight;
	 boolean healthProblems;
	 boolean earlierInjuries;
	
	public Candidate(String name, String surname, int age, int height, int weight, boolean healthProblems, boolean earlierInjuries ) {
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.healthProblems = healthProblems;
		this.earlierInjuries = earlierInjuries;
		
	}
	
	public String getName() {
		return name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public boolean getHealthProblems() {
		return healthProblems;
	}
	
	public boolean getEarlierInjuries() {
		return earlierInjuries;
	}
	
}



