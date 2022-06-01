package deafult;

import java.util.ArrayList;
import java.util.Arrays;

public class Player extends Board {
	Armies white17 = new Armies("white", 0, true);
	Armies whiteA1 = new Armies("white", 1, true);
	Armies whiteA2 = new Armies("white", 2, true);
	Armies whiteA3 = new Armies("white", 3, true);
	Armies whiteA4 = new Armies("white", 4, true);
	Armies whiteA5 = new Armies("white", 5, true);
	Armies whiteA6 = new Armies("white", 6, true);
	Armies whiteA7 = new Armies("white", 7, true);
	Armies whiteA8 = new Armies("white", 8, true);

	ArrayList<Armies> availableArmies = new ArrayList<Armies>(
			Arrays.asList(whiteA1, whiteA2, whiteA3, whiteA4, whiteA5, whiteA6, whiteA7, whiteA8));

	public Player() {
		super();
	}

	public ArrayList<Armies> getAvailableArmies() {
		return availableArmies;
	}

	public void setAvailableArmies(ArrayList<Armies> availableArmies) {
		this.availableArmies = availableArmies;
	}

	public Armies getArmyPosition(int pos) {
		return availableArmies.get(pos);
	}

	public Armies getArmyByNr(int number) {
		for (int i = 0; i < availableArmies.size(); i++) {
			if (availableArmies.get(i).getArmyNr() == number) {
				return availableArmies.get(i);
			}
		}
		return null;
	}

	public void destroy(int n) {
		if (getArmyByNr(n).getIsAlive() == true) {
			getArmyByNr(n).setIsAlive(false);
		}
		System.out.println("I killed yor warrior: " + n + "\n");
		System.out.println(getArmyByNr(n).getIsAlive());

	}

	public String printArmyNr() {
		String armyPowers = " ";
		for (int i = 0; i < availableArmies.size(); i++) {
			armyPowers = armyPowers + " ";
		}
		return armyPowers;
	}

}