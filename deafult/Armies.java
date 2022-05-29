package deafult;

import java.util.Arrays;

public class Armies {
	private String type;
	private int armyNr;
//	private int posOnBoard;
	
	
	
	public Armies(String type, int armyNr) {
		super();
		this.type = type;
		this.armyNr = armyNr;
//		this.posOnBoard = -1;
	}
	
	
	public int getArmyNr() {
		return armyNr;
	}
	
	public void setPosOnBoard(int i) {
//		this.posOnBoard = i;
	}
	
	public int getPosOnBoard() {
//		return posOnBoard;
		return Arrays.asList(Board.gameBoard).indexOf(this);	
		
	}
	
//	public void setArmyNr(int armyNr) {
//		this.armyNr = armyNr;
//	}
//
//
	public String getType() {
		return type;
	}
//
//
//	public void setType(String type) {
//		this.type = type;
//	}
	
	
}