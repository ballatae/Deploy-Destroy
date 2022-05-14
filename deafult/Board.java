package deafult;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Board {
	
	static Random rand = new Random();
	static Scanner scan = new Scanner(System.in);
	ArrayList<Armies>
	gameBoard = new ArrayList<Armies>(15);
	
	
	Player h1 = new Player();	
	Player c1 = new Player();
	
	public void deploy(ArrayList<Armies> army) {
		for (int i =0; i<8; i++) {
			
		
		}
	}
	
	public void placeArmy(ArrayList<Player> gameBoard, int armySlct, int armyPosition, ArrayList<Player> availableArmies) {
		switch(armyPosition) {
		case 1:
			//availableWhite.get(armySlct-1);
			//gameBoard[armyPosition] = availableWhite.get(armySlct-1) ;
		}
	}


	@Override
	public String toString() {
		return "Board [gameBoard=" + gameBoard + "]";
	}
	
	
	
	
	
}
