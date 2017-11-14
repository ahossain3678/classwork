package javaTheHardWay;

public class Animal {

	private String description;
	private Trait trait1;
	private Trait trait2;
	private int age;
	private boolean mated;
	
	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			Animal someAnimal = new Animal();
			System.out.println(someAnimal);
		}

	}
	public Animal() {
		chooseTraits();
		description = getName();
		age = 0;
	}
	public Animal(String description, Trait trait1, Trait trait2) {
		this.trait1 = trait1;
		this.trait2 = trait2;
		while(trait2.equals(trait1)) {
			trait2 = new Trait();
		}
		this.description = description;
	}
	public String getName() {
		return "animal";
	}
	public String getDescription() {
		return this.description;
	}
	public void chooseTraits() {
		
	}

}
