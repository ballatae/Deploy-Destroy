//package coin;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//
//public class CoinControl extends JPanel{
//	
//	private Coin coin;
//	private CoinPanel coinPanel;
//	private JButton flipButton;
//	
//	public CoinControl(CoinPanel coinPanel, Coin coin) {
//		
//		this.coin = coin;
//		this.coinPanel = coinPanel;
//		flipButton = new JButton ("Flip the Coin!");
//		flipButton.setToolTipText("Flips the coin.");
//		flipButton.addActionListener(new ButtonListener());
//	
//		setBackground(Color.WHITE);
//		add(flipButton);
//	}
//	
//	private class ButtonListener implements ActionListener{
//		public void actionperformed(Action event) {
//			coin.flip();
//			coinPanel.repaint();
//		}
//
//		
//		public void actionPerformed(ActionEvent e) {
//			
//			
//		}
//
//		
//		
//	}
//	
//	
//}
