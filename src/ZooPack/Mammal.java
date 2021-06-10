package ZooPack;

public class Mammal {
	public int energyLevel;
	
	public Mammal(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	public Mammal() {
		this.energyLevel = 100;
	}
	
	//setter
	public void energyLevel(int temp) {
		energyLevel = temp;
	}
	
	//getter
	public int getEnergyLevel() {
		return energyLevel;
	}
	
	public int displayEnergy() {
		System.out.println("Energy Level:" + energyLevel);
		return energyLevel;
	}
}
