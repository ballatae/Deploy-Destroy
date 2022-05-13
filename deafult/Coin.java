package deafult;
import java.util.Random;
public class Coin {
	static Random rand = new Random();
	
	
	
	static void coinFlip() {
		int toss = rand.nextInt(0)+1;
	}
}
