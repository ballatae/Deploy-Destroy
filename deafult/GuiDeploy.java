package deafult;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.SystemColor;

public class GuiDeploy extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiDeploy frame = new GuiDeploy();
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
	public GuiDeploy() {
		int width = 90;
		int height = 75;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1370, 690);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		// white Soldiers
		JLabel whiteSoldier1Lbl = new JLabel("");
		Image whiteSoldier1Icn = new ImageIcon(this.getClass().getResource("/whiteArmy1.png")).getImage();
		Image whiteSoldier1 = whiteSoldier1Icn.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
		whiteSoldier1Lbl.setIcon(new ImageIcon(whiteSoldier1));
		whiteSoldier1Lbl.setBounds(255, 562, 93, 69);
		panel.add(whiteSoldier1Lbl);

		JLabel whiteSoldier2Lbl = new JLabel("");
		Image whiteSoldier2Icn = new ImageIcon(this.getClass().getResource("/whiteArmy2.png")).getImage();
		Image whiteSoldier2 = whiteSoldier2Icn.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
		whiteSoldier2Lbl.setIcon(new ImageIcon(whiteSoldier2));
		whiteSoldier2Lbl.setBounds(355, 562, 93, 69);
		panel.add(whiteSoldier2Lbl);

		JLabel whiteSoldier3Lbl = new JLabel("");
		Image whiteSoldier3Icn = new ImageIcon(this.getClass().getResource("/whiteArmy3.png")).getImage();
		Image whiteSoldier3 = whiteSoldier3Icn.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
		whiteSoldier3Lbl.setIcon(new ImageIcon(whiteSoldier3));
		whiteSoldier3Lbl.setBounds(458, 562, 93, 69);
		panel.add(whiteSoldier3Lbl);

		JLabel whiteSoldier4Lbl = new JLabel("");
		Image whiteSoldier4Icn = new ImageIcon(this.getClass().getResource("/whiteArmy4.png")).getImage();
		Image whiteSoldier4 = whiteSoldier4Icn.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
		whiteSoldier4Lbl.setIcon(new ImageIcon(whiteSoldier4));
		whiteSoldier4Lbl.setBounds(561, 562, 93, 69);
		panel.add(whiteSoldier4Lbl);

		JLabel whiteSoldier5Lbl = new JLabel("");
		Image whiteSoldier5Icn = new ImageIcon(this.getClass().getResource("/whiteArmy5.png")).getImage();
		Image whiteSoldier5 = whiteSoldier5Icn.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
		whiteSoldier5Lbl.setIcon(new ImageIcon(whiteSoldier5));
		whiteSoldier5Lbl.setBounds(664, 562, 93, 69);
		panel.add(whiteSoldier5Lbl);

		JLabel whiteSoldier6Lbl = new JLabel("");
		Image whiteSoldier6Icn = new ImageIcon(this.getClass().getResource("/whiteArmy6.png")).getImage();
		Image whiteSoldier6 = whiteSoldier6Icn.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
		whiteSoldier6Lbl.setIcon(new ImageIcon(whiteSoldier6));
		whiteSoldier6Lbl.setBounds(762, 562, 93, 69);
		panel.add(whiteSoldier6Lbl);

		JLabel whiteSoldier7Lbl = new JLabel("");
		Image whiteSoldier7Icn = new ImageIcon(this.getClass().getResource("/whiteArmy7.png")).getImage();
		Image whiteSoldier7 = whiteSoldier7Icn.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
		whiteSoldier7Lbl.setIcon(new ImageIcon(whiteSoldier7));
		whiteSoldier7Lbl.setBounds(861, 562, 93, 69);
		panel.add(whiteSoldier7Lbl);

		JLabel whiteSoldier8Lbl = new JLabel("");
		Image whiteSoldier8Icn = new ImageIcon(this.getClass().getResource("/whiteArmy8.png")).getImage();
		Image whiteSoldier8 = whiteSoldier8Icn.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
		whiteSoldier8Lbl.setIcon(new ImageIcon(whiteSoldier8));
		whiteSoldier8Lbl.setBounds(958, 562, 93, 69);
		panel.add(whiteSoldier8Lbl);

		// black soldiers
		JLabel blackSoldier1Lbl = new JLabel("");
		Image blackSoldier1Icn = new ImageIcon(this.getClass().getResource("/blackArmy1.png")).getImage();
		Image blackSoldier1 = blackSoldier1Icn.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
		blackSoldier1Lbl.setIcon(new ImageIcon(blackSoldier1));
		blackSoldier1Lbl.setBounds(255, 10, 93, 69);
		panel.add(blackSoldier1Lbl);

		JLabel blackSoldier2Lbl = new JLabel("");
		Image blackSoldier2Icn = new ImageIcon(this.getClass().getResource("/blackArmy2.png")).getImage();
		Image blackSoldier2 = blackSoldier2Icn.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
		blackSoldier2Lbl.setIcon(new ImageIcon(blackSoldier2));
		blackSoldier2Lbl.setBounds(355, 10, 93, 69);
		panel.add(blackSoldier2Lbl);

		JLabel blackSoldier3Lbl = new JLabel("");
		Image blackSoldier3Icn = new ImageIcon(this.getClass().getResource("/blackArmy3.png")).getImage();
		Image blackSoldier3 = blackSoldier3Icn.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
		blackSoldier3Lbl.setIcon(new ImageIcon(blackSoldier3));
		blackSoldier3Lbl.setBounds(458, 10, 93, 69);
		panel.add(blackSoldier3Lbl);

		JLabel blackSoldier4Lbl = new JLabel("");
		Image blackSoldier4Icn = new ImageIcon(this.getClass().getResource("/blackArmy4.png")).getImage();
		Image blackSoldier4 = blackSoldier4Icn.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
		blackSoldier4Lbl.setIcon(new ImageIcon(blackSoldier4));
		blackSoldier4Lbl.setBounds(561, 10, 93, 69);
		panel.add(blackSoldier4Lbl);

		JLabel blackSoldier5Lbl = new JLabel("");
		Image blackSoldier5Icn = new ImageIcon(this.getClass().getResource("/blackArmy5.png")).getImage();
		Image blackSoldier5 = blackSoldier5Icn.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
		blackSoldier5Lbl.setIcon(new ImageIcon(blackSoldier5));
		blackSoldier5Lbl.setBounds(664, 10, 93, 69);
		panel.add(blackSoldier5Lbl);

		JLabel blackSoldier6Lbl = new JLabel("");
		Image blackSoldier6Icn = new ImageIcon(this.getClass().getResource("/blackArmy6.png")).getImage();
		Image blackSoldier6 = blackSoldier6Icn.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
		blackSoldier6Lbl.setIcon(new ImageIcon(blackSoldier6));
		blackSoldier6Lbl.setBounds(762, 10, 93, 69);
		panel.add(blackSoldier6Lbl);

		JLabel blackSoldier7Lbl = new JLabel("");
		Image blackSoldier7Icn = new ImageIcon(this.getClass().getResource("/blackArmy7.png")).getImage();
		Image blackSoldier7 = blackSoldier7Icn.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
		blackSoldier7Lbl.setIcon(new ImageIcon(blackSoldier7));
		blackSoldier7Lbl.setBounds(861, 10, 93, 69);
		panel.add(blackSoldier7Lbl);

		JLabel blackSoldier8Lbl = new JLabel("");
		Image blackSoldier8Icn = new ImageIcon(this.getClass().getResource("/blackArmy8.png")).getImage();
		Image blackSoldier8 = blackSoldier8Icn.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
		blackSoldier8Lbl.setIcon(new ImageIcon(blackSoldier8));
		blackSoldier8Lbl.setBounds(958, 10, 93, 69);
		panel.add(blackSoldier8Lbl);
		
		
		
		
	}
}
