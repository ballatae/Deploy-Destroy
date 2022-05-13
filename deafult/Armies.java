package deafult;

public class Armies {
	private boolean deployed;
	private int armyNr;
	
	
	
	public Armies(boolean deployed, int armyNr) {
		super();
		this.deployed = deployed;
		this.armyNr = armyNr;
	}
	public boolean isDeployed() {
		return deployed;
	}
	public void setDeployed(boolean deployed) {
		this.deployed = deployed;
	}
	public int getArmyNr() {
		return armyNr;
	}
	public void setArmyNr(int armyNr) {
		this.armyNr = armyNr;
	}
	
	
}
