package ZooPack;

public class Gorilla extends Mammal {
	public Gorilla() {
		super();
	}
	
	public void throwSomething() {
		energyLevel -= 5;
		System.out.println("The Gorilla threw something, he seems a bit less energised");
	}
	
	public void eatBananas() {
		energyLevel += 10;
		System.out.println("The Gorilla had a Banana to eat and seems satisfied and energised.");
	}
	
	public void climb() {
		energyLevel -= 10;
		System.out.println("The Gorilla climbed a tree and is now a bit tired after losing energy.");
	}
}
