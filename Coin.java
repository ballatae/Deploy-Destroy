package coin;

public class Coin {
	
	private String face = "";

	public Coin() {
			
	}

	public String getFace() {
		return face;
	}

	public void setFace(String f) {
		face = f;
	}
	
	public void flip() {
		int result = (int)(Math.random() * 2);
		//String firstPlayer;
		if(result==0) {
			face = "White";
			//firstPlayer = "Player";
			
		}else {
			face = "Black";
			//firstPlayer = "Computer";
		}
	}

	public String toString(String firstPlayer) {
		return getFace();
	}
	
	
	
	
}
