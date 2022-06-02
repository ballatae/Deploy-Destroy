package deafult;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Board extends DeployDestroy {

	static public Armies[] gameBoard = new Armies[20];
	private int size;
	Armies white17 = new Armies("white", 0, false);
	Armies white18 = new Armies("white", 0, false);

	public Board() {
		super();
		gameBoard[0] = (this.white17);
		gameBoard[17] = (this.white18);
	}

	public Armies[] getGameBoard() {
		return gameBoard;
	}

	public void addArmy(Armies a, int i) {
		if (gameBoard[i] == null) {
			gameBoard[i] = a;
		}
	}

	public int getNextArmyPosition(int position) {
		return position + 1;
	}

	public int getPreviousArmyPosition(int position) {
		return position - 1;
	}

	public int getPosition(int position) {
		return position;
	}

	public int getLength() {
		return this.size;
	}

	public void contains(String string) {
		// TODO Auto-generated method stub

	}

	public boolean isWhite(int position) {
		if (gameBoard[position].getType() == "white") {
			return true;
		}
		return false;
	}

	public boolean isAlive(int position) {
		return gameBoard[position].getIsAlive();
	}

	public boolean isBlack(int position) {
		if (gameBoard[position].getType() == "black") {
			return true;
		}
		return false;
	}

	public int armyPower(int position) {
		return gameBoard[position].getArmyNr();
	}

}