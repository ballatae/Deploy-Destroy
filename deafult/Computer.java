package deafult;

import java.util.ArrayList;
import java.util.Arrays;

public class Computer extends Board {
	Armies blackA1 = new Armies("black", 1, true);
	Armies blackA2 = new Armies("black", 2, true);
	Armies blackA3 = new Armies("black", 3, true);
	Armies blackA4 = new Armies("black", 4, true);
	Armies blackA5 = new Armies("black", 5, true);
	Armies blackA6 = new Armies("black", 6, true);
	Armies blackA7 = new Armies("black", 7, true);
	Armies blackA8 = new Armies("black", 8, true);

	ArrayList<Armies> availableBlack = new ArrayList<Armies>(
			Arrays.asList(blackA1, blackA2, blackA3, blackA4, blackA5, blackA6, blackA7, blackA8));

	public Computer() {
		super();
	}

	public ArrayList<Armies> getAvailableBlack() {
		return availableBlack;
	}

	public void setAvailableBlack(ArrayList<Armies> availableBlack) {
		this.availableBlack = availableBlack;
	}

	public Armies getArmyPosition(int pos) {
		return availableBlack.get(pos);
	}
	
	public void kill(int n) {
		getArmyByNr(n).setIsAlive(false);
		System.out.println("diq booommmm");
		System.out.println(getArmyByNr(n).getIsAlive());
		
	}

	public void setArmyPowerTo0(int nr) {
		getArmyByNr(nr).setArmyNr(0);
	}

	public Armies getBlackA1() {
		return blackA1;
	}

	public void setBlackA1(Armies blackA1) {
		this.blackA1 = blackA1;
	}

	public Armies getBlackA2() {
		return blackA2;
	}

	public void setBlackA2(Armies blackA2) {
		this.blackA2 = blackA2;
	}

	public Armies getBlackA3() {
		return blackA3;
	}

	public void setBlackA3(Armies blackA3) {
		this.blackA3 = blackA3;
	}

	public Armies getBlackA4() {
		return blackA4;
	}

	public void setBlackA4(Armies blackA4) {
		this.blackA4 = blackA4;
	}

	public Armies getBlackA5() {
		return blackA5;
	}

	public void setBlackA5(Armies blackA5) {
		this.blackA5 = blackA5;
	}

	public Armies getBlackA6() {
		return blackA6;
	}

	public void setBlackA6(Armies blackA6) {
		this.blackA6 = blackA6;
	}

	public Armies getBlackA7() {
		return blackA7;
	}

	public void setBlackA7(Armies blackA7) {
		this.blackA7 = blackA7;
	}

	public Armies getBlackA8() {
		return blackA8;
	}

	public void setBlackA8(Armies blackA8) {
		this.blackA8 = blackA8;
	}

	public Armies getArmyByNr(int number) {
		for (int i = 0; i < availableBlack.size(); i++) {
			if (availableBlack.get(i).getArmyNr() == number) {
				return availableBlack.get(i);
			}
		}
		return null;
	}

	public String printArmyNr() {
		String armyPowers = " ";
		for (int i = 0; i < availableBlack.size(); i++) {
			armyPowers = armyPowers + " ";
		}
		return armyPowers;
	}

}