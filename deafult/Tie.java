package deafult;

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

public class Tie extends JFrame {
	// DeployDestroy contentPane;
	JPanel startGame;
	CoinToss cointoss;
	static Tie tie;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tie = new Tie();
					tie.setVisible(true);
					tie.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Tie() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1370, 690);
		startGame = new JPanel();
		startGame.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(startGame);
		startGame.setLayout(null);

		JLabel background = new JLabel("");
		background.setBounds(0, 0, 1350, 645);
		background.setIcon(new ImageIcon("./background/tie.jpg"));
		startGame.add(background);

		JButton playAgain = new JButton("");
		playAgain.setIcon(new ImageIcon("./background/playAgain.jpg"));
		playAgain.setBounds(350, 530, 300, 77);
		startGame.add(playAgain);
		playAgain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gameOn(tie);
			}
		});

		JButton quitGame = new JButton("");
		quitGame.setIcon(new ImageIcon("./background/quitGame.jpg"));
		quitGame.setBounds(685, 530, 300, 77);
		startGame.add(quitGame);
		quitGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				close(tie);
			}
		});
	}

	public void gameOn(JFrame tie) {
		tie.dispose();
		CoinToss.main(null);
	}

	public void close(JFrame tie) {
		tie.dispose();
	}
}
