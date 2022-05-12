import java.util.ArrayList;
import java.util.Arrays;

public class Computer {
	
	Armies blackA1 = new Armies(false, 1);
	Armies blackA2 = new Armies(false, 2);
	Armies blackA3 = new Armies(false, 3);
	Armies blackA4 = new Armies(false, 4);
	Armies blackA5 = new Armies(false, 5);
	Armies blackA6 = new Armies(false, 6);
	Armies blackA7 = new Armies(false, 7);
	Armies blackA8 = new Armies(false, 8);

	
	
	ArrayList<Armies> availableBlack = new ArrayList<Armies>(Arrays.asList(blackA1, blackA2, blackA3, blackA4, blackA5, blackA6, blackA7, blackA8));



	@Override
	public String toString() {
		return "Computer [blackA1=" + blackA1 + ", blackA2=" + blackA2 + ", blackA3=" + blackA3 + ", blackA4=" + blackA4
				+ ", blackA5=" + blackA5 + ", blackA6=" + blackA6 + ", blackA7=" + blackA7 + ", blackA8=" + blackA8
				+ ", availableBlack=" + availableBlack + "]";
	}
	
	
	
	
}
