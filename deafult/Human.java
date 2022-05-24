package deafult;
import java.util.ArrayList;
import java.util.Arrays;

public class Human {
	
	Armies whiteA1 = new Armies("white", 1);
	Armies whiteA2 = new Armies("white", 2);
	Armies whiteA3 = new Armies("white", 3);
	Armies whiteA4 = new Armies("white", 4);
	Armies whiteA5 = new Armies("white", 5);
	Armies whiteA6 = new Armies("white", 6);
	Armies whiteA7 = new Armies("white", 7);
	Armies whiteA8 = new Armies("white", 8);
	
	
	ArrayList<Armies> availableWhite = new ArrayList<Armies>(Arrays.asList(whiteA1, whiteA2, whiteA3, whiteA4, whiteA5, whiteA6, whiteA7, whiteA8));


	@Override
	public String toString() {
		return "Human [whiteA1=" + whiteA1 + ", whiteA2=" + whiteA2 + ", whiteA3=" + whiteA3 + ", whiteA4=" + whiteA4
				+ ", whiteA5=" + whiteA5 + ", whiteA6=" + whiteA6 + ", whiteA7=" + whiteA7 + ", whiteA8=" + whiteA8
				+ ", availableWhite=" + availableWhite + "]";
	}

	
}
