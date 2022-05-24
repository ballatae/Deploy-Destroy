package deafult;

import java.util.ArrayList;
import java.util.Arrays;

public class Player {
	Armies whiteA1 = new Armies("white", 1);
	Armies whiteA2 = new Armies("white", 2);
	Armies whiteA3 = new Armies("white", 3);
	Armies whiteA4 = new Armies("white", 4);
	Armies whiteA5 = new Armies("white", 5);
	Armies whiteA6 = new Armies("white", 6);
	Armies whiteA7 = new Armies("white", 7);
	Armies whiteA8 = new Armies("white", 8);

	ArrayList<Armies> availableArmies = new ArrayList<Armies>(
			Arrays.asList(whiteA1, whiteA2, whiteA3, whiteA4, whiteA5, whiteA6, whiteA7, whiteA8));

	public Player() {
		super();
//		this.availableArmies = availableArmies;
	}

	public ArrayList<Armies> getAvailableArmies() {
		return availableArmies;
	}

	public void setAvailableArmies(ArrayList<Armies> availableArmies) {
		this.availableArmies = availableArmies;
	}
	
	public void getArmy(int pos) {
		
		
		System.out.println("5");
	}
	
	public Armies getArmyPosition(int pos) {
		return availableArmies.get(pos);
	}
	
	public Armies getWhiteA1() {
		System.out.println("blabla");
		return whiteA1;
	}

	public void setWhiteA1(Armies whiteA1) {
		this.whiteA1 = whiteA1;
	}

	public Armies getWhiteA2() {
		return whiteA2;
	}

	public void setWhiteA2(Armies whiteA2) {
		this.whiteA2 = whiteA2;
	}

	public Armies getWhiteA3() {
		return whiteA3;
	}

	public void setWhiteA3(Armies whiteA3) {
		this.whiteA3 = whiteA3;
	}

	public Armies getWhiteA4() {
		return whiteA4;
	}

	public void setWhiteA4(Armies whiteA4) {
		this.whiteA4 = whiteA4;
	}

	public Armies getWhiteA5() {
		return whiteA5;
	}

	public void setWhiteA5(Armies whiteA5) {
		this.whiteA5 = whiteA5;
	}

	public Armies getWhiteA6() {
		return whiteA6;
	}

	public void setWhiteA6(Armies whiteA6) {
		this.whiteA6 = whiteA6;
	}

	public Armies getWhiteA7() {
		return whiteA7;
	}

	public void setWhiteA7(Armies whiteA7) {
		this.whiteA7 = whiteA7;
	}

	public Armies getWhiteA8() {
		return whiteA8;
	}

	public void setWhiteA8(Armies whiteA8) {
		this.whiteA8 = whiteA8;
	}

}
