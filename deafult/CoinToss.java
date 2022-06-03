package deafult;

import java.awt.EventQueue;
import java.awt.*;

import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.MouseInputAdapter;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class CoinToss extends JFrame implements ActionListener {
	static CoinToss cointoss;
	static DeployDestroy contentPane;
	JPanel coinPanel;
	static Image whiteCoin;
	static Image blackCoin;
	static JLabel coinDisplayed;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cointoss = new CoinToss();
					cointoss.setVisible(true);
					cointoss.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CoinToss() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1370, 690);
		coinPanel = new JPanel();
		coinPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(coinPanel);
		coinPanel.setLayout(null);

		//<a href="http://www.freepik.com">Designed by vectorpocket / Freepik</a>
		JLabel background = new JLabel("");
		background.setBounds(0, 0, 1350, 645);
		background.setIcon(new ImageIcon("./background/coinBackground.jpg"));
		coinPanel.add(background);

		JLabel coinDisplayed = new JLabel("");
		whiteCoin = new ImageIcon(this.getClass().getResource("coinWhite.png")).getImage();

		blackCoin = new ImageIcon(this.getClass().getResource("coinBlack.png")).getImage();

		coinDisplayed.setIcon(new ImageIcon());
		coinDisplayed.setBounds(490, 150, 330, 350);
		background.add(coinDisplayed);

		JButton continuebtn = new JButton("");
		continuebtn.setIcon(new ImageIcon("./armies/continue.png"));
		continuebtn.setBounds(479, 500, 391, 100);
		background.add(continuebtn);
		continuebtn.setVisible(false);
		continuebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				startGame(cointoss);
			}
		});

		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("./armies/flipbtn.png"));
		btnNewButton.setBounds(479, 245, 391, 100);
		background.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (flip()) {
					coinDisplayed.setIcon(new ImageIcon(whiteCoin));
					btnNewButton.setVisible(false);
					continuebtn.setVisible(true);
				} else {
					coinDisplayed.setIcon(new ImageIcon(blackCoin));
					coinDisplayed.setBounds(490, 150, 330, 350);
				}
			}
		});
	}

	public boolean flip() {
		return true;
	}

	static public void startGame(JFrame cointoss) {
		cointoss.dispose();
		DeployDestroy.main(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}
