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

	public void destroy(int n) {
		if (getArmyByNr(n).getIsAlive() == true) {
			getArmyByNr(n).setIsAlive(false);
		}
	}

	public Armies getArmyByNr(int number) {
		for (int i = 0; i < availableBlack.size(); i++) {
			if (availableBlack.get(i).getArmyNr() == number) {
				return availableBlack.get(i);
			}
		}
		return null;
	}

	public void printPowerAlive() {
		for (int i = 0; i < availableBlack.size(); i++) {
			System.out
					.println(availableBlack.get(i).getArmyNr() + " osht gjall? " + availableBlack.get(i).getIsAlive());

		}
	}

	public String printArmyNr() {
		String armyPowers = " ";
		for (int i = 0; i < availableBlack.size(); i++) {
			armyPowers = armyPowers + " ";
		}
		return armyPowers;
	}

}