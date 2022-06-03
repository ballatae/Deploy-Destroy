package deafult;

import java.util.Arrays;

public class Armies {
	private String type;
	private int armyNr;
	private boolean isAlive;
	
	public Armies(String type, int armyNr, boolean isAlive) {
		// TODO Auto-generated constructor stub
		super();
		this.type = type;
		this.armyNr = armyNr;
		this.isAlive = isAlive;
	}

	public boolean getIsAlive() {
		return this.isAlive;
	}
	
	public void setIsAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}
	
	public int getArmyNr() {
		return armyNr;
	}
	
	public void setPosOnBoard(int i) {
//		this.posOnBoard = i;
	}
	
	public int getPosOnBoard() {
		return Arrays.asList(Board.gameBoard).indexOf(this);	
		
	}
	

	public String getType() {
		return type;
	}

	public void setArmyNr(int armyNr) {
		this.armyNr = armyNr;
	}
	
	public void disableArmy() {
		this.armyNr = 0;
		System.out.println("Disable army" + this.armyNr);
	}
	
	
}