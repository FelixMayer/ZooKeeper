package ZooPack;

public class Bat extends Mammal{
	
		public Bat() {
			super(300);
		}
		
//		public void changeBatEnergyLevel(int energyLevel) {
//			super.energyLevel(energyLevel);
//		} 
	
	public void fly() {
		energyLevel -= 50;
		System.out.println("The Bat takes off: flap flap flap");
	}
	
	public void eatHumans() {
		energyLevel += 25;
		System.out.println("CRUNCH");
	}
	
	public void attackTown() {
		energyLevel -= 100;
		System.out.println("AAAAAAAAAAAAAHHHHHHHH");
	}
}
