import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Board {
	
	static Random rand = new Random();
	static Scanner scan = new Scanner(System.in);
	ArrayList<Human>
	gameBoard = new ArrayList<Human>(15);
	
	
	
	Human h1 = new Human();	
	Computer c1 = new Computer();
	
	public void deploy(ArrayList<Human> availableWhite) {
		for (int i =0; i<8; i++) {
			System.out.println("Select army:");
			int armySlct = scan.nextInt();
			System.out.println("Enter a position to deploy");
			int armyPosition = scan.nextInt();
			
			placeArmy(gameBoard, armySlct, armyPosition, availableWhite);
			
			availableWhite.remove(armySlct);
				
			
			System.out.println("The computer plays");
			int computerPosition = rand.nextInt();
		}
	}
	
	public void placeArmy(ArrayList<Human> gameBoard, int armySlct, int armyPosition, ArrayList<Human> availableWhite) {
		switch(armyPosition) {
		case 1:
			//availableWhite.get(armySlct-1);
			gameBoard[armyPosition] = availableWhite.get(armySlct-1) ;
		}
	}


	@Override
	public String toString() {
		return "Board [gameBoard=" + gameBoard + "]";
	}
	
	
	
	
	
}
