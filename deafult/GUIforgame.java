package deafult;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import deafult.Player;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.*;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.event.MouseInputAdapter;

import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Arrays;

public class GUIforgame extends JFrame implements ActionListener, MouseListener {

	private JPanel contentPane;
	static Player player;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		player = new Player();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {

					GUIforgame frame = new GUIforgame();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	int ArmySlct = 0;

	/**
	 * Create the frame.
	 */
	public GUIforgame() {

		int width = 90;
		int height = 75;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1370, 690);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

// JLabel selectedSoldier = new JLabel("");

		JLabel background = new JLabel("New label");
		background.setBounds(0, 0, 1370, 650);
		background.setHorizontalAlignment(SwingConstants.CENTER);
		background.setIcon(new ImageIcon("./armies/backgrounddd.png"));
		contentPane.add(background);

		JLabel whiteSoldier1Lbl = new JLabel("");
		Image whiteSoldier1Icn = new ImageIcon(this.getClass().getResource("/whiteArmy1.png")).getImage();
		Image whiteSoldier1 = whiteSoldier1Icn.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
		whiteSoldier1Lbl.setIcon(new ImageIcon(whiteSoldier1));
		whiteSoldier1Lbl.setBounds(255, 10, 93, 69);
		background.add(whiteSoldier1Lbl);
		whiteSoldier1Lbl.addMouseListener(new MouseInputAdapter() {
			public void mouseClicked(MouseEvent e) {
				ArmySlct = 1;

			}
		});

		JLabel whiteSoldier2Lbl = new JLabel("");
		Image whiteSoldier2Icn = new ImageIcon(this.getClass().getResource("/whiteArmy2.png")).getImage();
		Image whiteSoldier2 = whiteSoldier2Icn.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
		whiteSoldier2Lbl.setIcon(new ImageIcon(whiteSoldier2));
		whiteSoldier2Lbl.setBounds(355, 10, 93, 69);
		background.add(whiteSoldier2Lbl);
		whiteSoldier2Lbl.addMouseListener(new MouseInputAdapter() {
			public void mouseClicked(MouseEvent e) {
				ArmySlct = 2;
			}
		});

		JLabel whiteSoldier3Lbl = new JLabel("");
		Image whiteSoldier3Icn = new ImageIcon(this.getClass().getResource("/whiteArmy3.png")).getImage();
		Image whiteSoldier3 = whiteSoldier3Icn.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
		whiteSoldier3Lbl.setIcon(new ImageIcon(whiteSoldier3));
		whiteSoldier3Lbl.setBounds(458, 10, 93, 69);
		background.add(whiteSoldier3Lbl);
		whiteSoldier3Lbl.addMouseListener(new MouseInputAdapter() {
			public void mouseClicked(MouseEvent e) {
				ArmySlct = 3;
			}
		});

		JLabel whiteSoldier4Lbl = new JLabel("");
		Image whiteSoldier4Icn = new ImageIcon(this.getClass().getResource("/whiteArmy4.png")).getImage();
		Image whiteSoldier4 = whiteSoldier4Icn.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
		whiteSoldier4Lbl.setIcon(new ImageIcon(whiteSoldier4));
		whiteSoldier4Lbl.setBounds(561, 10, 93, 69);
		background.add(whiteSoldier4Lbl);
		whiteSoldier4Lbl.addMouseListener(new MouseInputAdapter() {
			public void mouseClicked(MouseEvent e) {
				ArmySlct = 4;
			}
		});

		JLabel whiteSoldier5Lbl = new JLabel("");
		Image whiteSoldier5Icn = new ImageIcon(this.getClass().getResource("/whiteArmy5.png")).getImage();
		Image whiteSoldier5 = whiteSoldier5Icn.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
		whiteSoldier5Lbl.setIcon(new ImageIcon(whiteSoldier5));
		whiteSoldier5Lbl.setBounds(664, 10, 93, 69);
		background.add(whiteSoldier5Lbl);
		whiteSoldier5Lbl.addMouseListener(new MouseInputAdapter() {
			public void mouseClicked(MouseEvent e) {
				ArmySlct = 5;
			}
		});

		JLabel whiteSoldier6Lbl = new JLabel("");
		Image whiteSoldier6Icn = new ImageIcon(this.getClass().getResource("/whiteArmy6.png")).getImage();
		Image whiteSoldier6 = whiteSoldier6Icn.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
		whiteSoldier6Lbl.setIcon(new ImageIcon(whiteSoldier6));
		whiteSoldier6Lbl.setBounds(762, 10, 93, 69);
		background.add(whiteSoldier6Lbl);
		whiteSoldier6Lbl.addMouseListener(new MouseInputAdapter() {
			public void mouseClicked(MouseEvent e) {
				ArmySlct = 6;
			}
		});

		JLabel whiteSoldier7Lbl = new JLabel("");
		Image whiteSoldier7Icn = new ImageIcon(this.getClass().getResource("/whiteArmy7.png")).getImage();
		Image whiteSoldier7 = whiteSoldier7Icn.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
		whiteSoldier7Lbl.setIcon(new ImageIcon(whiteSoldier7));
		whiteSoldier7Lbl.setBounds(861, 10, 93, 69);
		background.add(whiteSoldier7Lbl);
		whiteSoldier7Lbl.addMouseListener(new MouseInputAdapter() {
			public void mouseClicked(MouseEvent e) {
				ArmySlct = 7;
			}
		});

		JLabel whiteSoldier8Lbl = new JLabel("");
		Image whiteSoldier8Icn = new ImageIcon(this.getClass().getResource("/whiteArmy8.png")).getImage();
		Image whiteSoldier8 = whiteSoldier8Icn.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
		whiteSoldier8Lbl.setIcon(new ImageIcon(whiteSoldier8));
		whiteSoldier8Lbl.setBounds(958, 10, 93, 69);
		background.add(whiteSoldier8Lbl);
		whiteSoldier8Lbl.addMouseListener(new MouseInputAdapter() {
			public void mouseClicked(MouseEvent e) {
				ArmySlct = 8;
			}
		});

// black soldiers
		JLabel blackSoldier1Lbl = new JLabel("");
		Image blackSoldier1Icn = new ImageIcon(this.getClass().getResource("/blackArmy1.png")).getImage();
		Image blackSoldier1 = blackSoldier1Icn.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
		blackSoldier1Lbl.setIcon(new ImageIcon(blackSoldier1));
		blackSoldier1Lbl.setBounds(255, 562, 93, 69);
		background.add(blackSoldier1Lbl);

		JLabel blackSoldier2Lbl = new JLabel("");
		Image blackSoldier2Icn = new ImageIcon(this.getClass().getResource("/blackArmy2.png")).getImage();
		Image blackSoldier2 = blackSoldier2Icn.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
		blackSoldier2Lbl.setIcon(new ImageIcon(blackSoldier2));
		blackSoldier2Lbl.setBounds(355, 562, 93, 69);
		background.add(blackSoldier2Lbl);

		JLabel blackSoldier3Lbl = new JLabel("");
		Image blackSoldier3Icn = new ImageIcon(this.getClass().getResource("/blackArmy3.png")).getImage();
		Image blackSoldier3 = blackSoldier3Icn.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
		blackSoldier3Lbl.setIcon(new ImageIcon(blackSoldier3));
		blackSoldier3Lbl.setBounds(458, 562, 93, 69);
		background.add(blackSoldier3Lbl);

		JLabel blackSoldier4Lbl = new JLabel("");
		Image blackSoldier4Icn = new ImageIcon(this.getClass().getResource("/blackArmy4.png")).getImage();
		Image blackSoldier4 = blackSoldier4Icn.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
		blackSoldier4Lbl.setIcon(new ImageIcon(blackSoldier4));
		blackSoldier4Lbl.setBounds(561, 562, 93, 69);
		background.add(blackSoldier4Lbl);

		JLabel blackSoldier5Lbl = new JLabel("");
		Image blackSoldier5Icn = new ImageIcon(this.getClass().getResource("/blackArmy5.png")).getImage();
		Image blackSoldier5 = blackSoldier5Icn.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
		blackSoldier5Lbl.setIcon(new ImageIcon(blackSoldier5));
		blackSoldier5Lbl.setBounds(664, 562, 93, 69);
		background.add(blackSoldier5Lbl);

		JLabel blackSoldier6Lbl = new JLabel("");
		Image blackSoldier6Icn = new ImageIcon(this.getClass().getResource("/blackArmy6.png")).getImage();
		Image blackSoldier6 = blackSoldier6Icn.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
		blackSoldier6Lbl.setIcon(new ImageIcon(blackSoldier6));
		blackSoldier6Lbl.setBounds(762, 562, 93, 69);
		background.add(blackSoldier6Lbl);

		JLabel blackSoldier7Lbl = new JLabel("");
		Image blackSoldier7Icn = new ImageIcon(this.getClass().getResource("/blackArmy7.png")).getImage();
		Image blackSoldier7 = blackSoldier7Icn.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
		blackSoldier7Lbl.setIcon(new ImageIcon(blackSoldier7));
		blackSoldier7Lbl.setBounds(861, 562, 93, 69);
		background.add(blackSoldier7Lbl);

		JLabel blackSoldier8Lbl = new JLabel("");
		Image blackSoldier8Icn = new ImageIcon(this.getClass().getResource("/blackArmy8.png")).getImage();
		Image blackSoldier8 = blackSoldier8Icn.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
		blackSoldier8Lbl.setIcon(new ImageIcon(blackSoldier8));
		blackSoldier8Lbl.setBounds(958, 562, 93, 69);
		background.add(blackSoldier8Lbl);

		ArrayList<JLabel> whiteArmy = new ArrayList<JLabel>(
				Arrays.asList(whiteSoldier1Lbl, whiteSoldier2Lbl, whiteSoldier3Lbl, whiteSoldier4Lbl, whiteSoldier5Lbl,
						whiteSoldier6Lbl, whiteSoldier7Lbl, whiteSoldier8Lbl));

		int widthBoard = 89;
		int heightBoard = 100;
		int yBoard = 284;
// fields of war
		JLabel position1 = new JLabel("");
		Border border = BorderFactory.createLineBorder(Color.LIGHT_GRAY, 3);
		position1.setBorder(border);
		position1.setBounds(0, yBoard, widthBoard, heightBoard);
		background.add(position1);
		position1.addMouseListener(new MouseInputAdapter() {

			public void mouseClicked(MouseEvent e) {
				placeArmy(1, ArmySlct, whiteArmy);
			}
		});

		JLabel position2 = new JLabel("");
		position2.setBorder(border);
		position2.setBounds(85, yBoard, widthBoard, heightBoard);
		background.add(position2);
		position2.addMouseListener(new MouseInputAdapter() {
			public void mouseClicked(MouseEvent e) {
				placeArmy(2, ArmySlct, whiteArmy);
			}
		});

		JLabel position3 = new JLabel("");
		position3.setBorder(border);
		position3.setBounds(170, yBoard, widthBoard, heightBoard);
		background.add(position3);
		position3.addMouseListener(new MouseInputAdapter() {
			public void mouseClicked(MouseEvent e) {
				placeArmy(3, ArmySlct, whiteArmy);
			}
		});

		JLabel position4 = new JLabel("");
		position4.setBorder(border);
		position4.setBounds(255, yBoard, widthBoard, heightBoard);
		background.add(position4);
		position4.addMouseListener(new MouseInputAdapter() {
			public void mouseClicked(MouseEvent e) {
				placeArmy(4, ArmySlct, whiteArmy);
			}
		});

		JLabel position5 = new JLabel("");
		position5.setBorder(border);
		position5.setBounds(340, yBoard, widthBoard, heightBoard);
		background.add(position5);
		position5.addMouseListener(new MouseInputAdapter() {
			public void mouseClicked(MouseEvent e) {
				placeArmy(5, ArmySlct, whiteArmy);
			}
		});

		JLabel position6 = new JLabel("");
		position6.setBorder(border);
		position6.setBounds(425, yBoard, widthBoard, heightBoard);
		background.add(position6);
		position6.addMouseListener(new MouseInputAdapter() {
			public void mouseClicked(MouseEvent e) {
				placeArmy(6, ArmySlct, whiteArmy);
			}
		});

		JLabel position7 = new JLabel("");
		position7.setBorder(border);
		position7.setBounds(510, yBoard, widthBoard, heightBoard);
		background.add(position7);
		position7.addMouseListener(new MouseInputAdapter() {
			public void mouseClicked(MouseEvent e) {
				placeArmy(7, ArmySlct, whiteArmy);
			}
		});

		JLabel position8 = new JLabel("");
		position8.setBorder(border);
		position8.setBounds(595, yBoard, widthBoard, heightBoard);
		background.add(position8);
		position8.addMouseListener(new MouseInputAdapter() {
			public void mouseClicked(MouseEvent e) {
				placeArmy(8, ArmySlct, whiteArmy);
			}
		});

		JLabel position9 = new JLabel("");
		position9.setBorder(border);
		position9.setBounds(680, yBoard, widthBoard, heightBoard);
		background.add(position9);
		position9.addMouseListener(new MouseInputAdapter() {
			public void mouseClicked(MouseEvent e) {
				placeArmy(9, ArmySlct, whiteArmy);
			}
		});

		JLabel position10 = new JLabel("");
		position10.setBorder(border);
		position10.setBounds(765, yBoard, widthBoard, heightBoard);
		background.add(position10);
		position10.addMouseListener(new MouseInputAdapter() {
			public void mouseClicked(MouseEvent e) {
				placeArmy(10, ArmySlct, whiteArmy);
			}
		});

		JLabel position11 = new JLabel("");
		position11.setBorder(border);
		position11.setBounds(850, yBoard, widthBoard, heightBoard);
		background.add(position11);
		position11.addMouseListener(new MouseInputAdapter() {
			public void mouseClicked(MouseEvent e) {
				placeArmy(11, ArmySlct, whiteArmy);
			}
		});

		JLabel position12 = new JLabel("");
		position12.setBorder(border);
		position12.setBounds(935, yBoard, widthBoard, heightBoard);
		background.add(position12);
		position12.addMouseListener(new MouseInputAdapter() {
			public void mouseClicked(MouseEvent e) {
				placeArmy(12, ArmySlct, whiteArmy);
			}
		});

		JLabel position13 = new JLabel("");
		position13.setBorder(border);
		position13.setBounds(1020, yBoard, widthBoard, heightBoard);
		background.add(position13);
		position13.addMouseListener(new MouseInputAdapter() {
			public void mouseClicked(MouseEvent e) {
				placeArmy(13, ArmySlct, whiteArmy);
			}
		});

		JLabel position14 = new JLabel("");
		position14.setBorder(border);
		position14.setBounds(1105, yBoard, widthBoard, heightBoard);
		background.add(position14);
		position14.addMouseListener(new MouseInputAdapter() {
			public void mouseClicked(MouseEvent e) {
				placeArmy(14, ArmySlct, whiteArmy);
			}
		});

		JLabel position15 = new JLabel("");
		position15.setBorder(border);
		position15.setBounds(1190, yBoard, widthBoard, heightBoard);
		background.add(position15);
		position15.addMouseListener(new MouseInputAdapter() {
			public void mouseClicked(MouseEvent e) {
				placeArmy(15, ArmySlct, whiteArmy);
			}
		});

		JLabel position16 = new JLabel("");
		position16.setBorder(border);
		position16.setBounds(1275, yBoard, 80, heightBoard);
		background.add(position16);
		position16.addMouseListener(new MouseInputAdapter() {
			public void mouseClicked(MouseEvent e) {
				placeArmy(16, ArmySlct, whiteArmy);
			}
		});

	}

	@Override
	public void actionPerformed(ActionEvent e) {
// TODO Auto-generated method stub

	}

	public void moveToBoard(JLabel selectedSoldier, int i) {

		switch (i) {
		case 1:
			selectedSoldier.setLocation(0, 295);
			System.out.println("erdh");
			player.getWhiteA1();

			break;
		case 2:
			selectedSoldier.setLocation(85, 295);

			break;
		case 3:
			selectedSoldier.setLocation(170, 295);

			break;
		case 4:
			selectedSoldier.setLocation(255, 295);

			break;
		case 5:
			selectedSoldier.setLocation(340, 295);

			break;
		case 6:
			selectedSoldier.setLocation(425, 295);

			break;
		case 7:
			selectedSoldier.setLocation(510, 295);

			break;
		case 8:
			selectedSoldier.setLocation(595, 295);

			break;
		case 9:
			selectedSoldier.setLocation(680, 295);
			break;
		case 10:
			selectedSoldier.setLocation(765, 295);
			break;
		case 11:
			selectedSoldier.setLocation(850, 295);
			break;
		case 12:
			selectedSoldier.setLocation(935, 295);
			break;
		case 13:
			selectedSoldier.setLocation(1020, 295);
			break;
		case 14:
			selectedSoldier.setLocation(1105, 295);
			break;
		case 15:
			selectedSoldier.setLocation(1190, 295);
			break;
		case 16:
			selectedSoldier.setLocation(1272, 295);
			break;
		}
	}

	public void placeArmy(int i, int armySlct, ArrayList<JLabel> whiteArmy) {
		switch (armySlct) {
		case 1:
			moveToBoard(whiteArmy.get(0), i);
			System.out.println("1");
			
			break;
		case 2:
			moveToBoard(whiteArmy.get(1), i);
			break;
		case 3:
			moveToBoard(whiteArmy.get(2), i);
			break;
		case 4:
			moveToBoard(whiteArmy.get(3), i);
			break;
		case 5:
			moveToBoard(whiteArmy.get(4), i);
			break;
		case 6:
			moveToBoard(whiteArmy.get(5), i);
			break;
		case 7:
			moveToBoard(whiteArmy.get(6), i);
			break;
		case 8:
			moveToBoard(whiteArmy.get(7), i);
			break;
		}
	}

	public void deploy() {

	}

	@Override
	public void mouseClicked(MouseEvent e) {
// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
// TODO Auto-generated method stub

	}
}
