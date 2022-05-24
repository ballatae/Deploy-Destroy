package deafult;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Board extends GUIforgame{

	ArrayList<Armies> gameBoard = new ArrayList<Armies>(15);


	public Board(ArrayList<Armies> gameBoard) {
		super();
		this.gameBoard = gameBoard;
	}
	

	@Override
	public String toString() {
		return "Board [gameBoard=" + gameBoard + "]";
	}

	public ArrayList<Armies> getGameBoard() {
		return gameBoard;
	}

	public void setGameBoard(ArrayList<Armies> gameBoard) {
		this.gameBoard = gameBoard;
	}
	
	public void addArmy(ArrayList<Armies> gameBoard) {
		
	}


	

}
