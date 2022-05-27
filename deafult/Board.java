package deafult;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Board extends GUIforgame{

	Armies[] gameBoard = new Armies[17];
	private int size;

	public Board() {
		super();
		size = 0;
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
		if(gameBoard[i] == null) {
			gameBoard[i] = a;
			size++;
		}
	}
	
	public int getLength() {
		return this.size;
	}


	

}
