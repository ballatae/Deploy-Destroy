package deafult;

import java.util.ArrayList;
import java.util.Arrays;

public class Player {
	Armies army1 = new Armies(false, 1);
	Armies army2 = new Armies(false, 2);
	Armies army3 = new Armies(false, 3);
	Armies army4 = new Armies(false, 4);
	Armies army5 = new Armies(false, 5);
	Armies army6 = new Armies(false, 6);
	Armies army7 = new Armies(false, 7);
	Armies army8 = new Armies(false, 8);
	
	
	ArrayList<Armies> availableArmies = new ArrayList<Armies>(Arrays.asList(army1, army2, army3, army4, army5, army6, army7, army8));


}
