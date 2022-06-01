//package coin;
//
//import java.awt.*;
//import java.awt.event.*;
//import javax.swing.*;
//import javax.swing.ImageIcon;
//
//public class CoinPanel extends JPanel {
//	
//	private Coin coin;
//	private ImageIcon coinWhite, coinBlack;
//	private JLabel imgLabel;
//	
//	
//	public CoinPanel(Coin coin) {
//		this.coin = coin;
//		coinWhite = new ImageIcon("../coinImages/coinWhite.png");
//		coinBlack = new ImageIcon("../coinImages/coinBlack.png");
//		imgLabel = new JLabel("Coin Game", coinWhite, SwingConstants.CENTER);
//		imgLabel.setHorizontalTextPosition(SwingConstants.CENTER);
//		imgLabel.setVerticalTextPosition(SwingConstants.TOP);
//		add(imgLabel);
//		setBackground(Color.WHITE);
//		setPreferredSize(new Dimension(400,400));
//		
//	}
//	
//	public void repaint() {
//		if(coin != null) {
//			System.out.println("Coin : "+coin);
//		}
//		
//		if(coin.getFace().equals("White")) {
//			imgLabel.setIcon(coinWhite);
//		}
//		
//		if(coin.getFace().equals("Black")) {
//			imgLabel.setIcon(coinBlack);
//		}
//		
//		super.repaint();
//	}
//	
//}
