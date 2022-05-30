package deafult;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Board extends GUIforgame {

	static public Armies[] gameBoard = new Armies[17];
	private int size;

	public Board() {
		super();
//		size = 0;
	}

	@Override
	public String toString() {
		return "Board [gameBoard=" + gameBoard.toString() + "]";
	}

	public Armies[] getGameBoard() {
		return gameBoard;
	}

	public void setGameBoard(Armies[] gameBoard) {
		this.gameBoard = gameBoard;
	}

	public void addArmy(Armies a, int i) {
		if (gameBoard[i] == null) {
			gameBoard[i] = a;
//			a.setPosOnBoard(i);
//			size++;
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
		if (gameBoard[position].getIsAlive() == true){
			return true;
		}
		return false;
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