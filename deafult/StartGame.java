package deafult;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class StartGame extends JFrame {
	

	CoinToss coinToss;
	JPanel startGame;
	static StartGame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new StartGame();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public StartGame() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1370, 690);
		startGame = new JPanel();
		startGame.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(startGame);
		startGame.setLayout(null);

		JLabel background = new JLabel("");
		background.setBounds(0, 0, 1350, 645);
		background.setIcon(new ImageIcon("./background/startG.jpg"));
		startGame.add(background);

		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("./background/startButton.jpg"));
		btnNewButton.setBounds(479, 500, 391, 100);
		startGame.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gameOn(frame);
			}
		});
	}

	public void gameOn(JFrame frame) {
		frame.dispose();
		CoinToss.main(null);
	}
}
