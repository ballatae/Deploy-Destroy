package coin;

import java.awt.*;
import javax.swing.*;

public class CoinGui {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Coin Flip Game");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Coin coin = new Coin();
		CoinPanel coinPanel = new CoinPanel(coin);
		CoinControl controls = new CoinControl(coinPanel, coin);
		
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.add(coinPanel);
		panel.add(controls);
		
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
		
	}
}
