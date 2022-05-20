package deafult;

import java.util.ArrayList;

import javax.swing.JLabel;

public class PlaceArmyModel {
	public int i;
	public int armySlct;

	public ArrayList<JLabel> whiteArmy = new ArrayList<JLabel>();

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int getArmySlct() {
		return armySlct;
	}

	public void setArmySlct(int armySlct) {
		this.armySlct = armySlct;
	}

	public ArrayList<JLabel> getWhiteArmy() {
		return whiteArmy;
	}

	public void setWhiteArmy(ArrayList<JLabel> whiteArmy) {
		this.whiteArmy = whiteArmy;
	}
}
