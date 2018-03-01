package selector;

public class Candidates {

	private String name;
	private String surname;
	private int age;
	private int height;
	private int weight;
	private boolean healthProblems;
	private boolean earlierInjuries;
	
	public Candidates(String name, String surname, int age, int height, int weight, boolean healthProblems, boolean earlierInjuries ) {
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
	
	public boolean HealthProblems() {
		return healthProblems;
	}
	
	public boolean EarlierInjuries() {
		return earlierInjuries;
	}
	
}


