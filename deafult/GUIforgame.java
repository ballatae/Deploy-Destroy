package deafult;

import java.awt.*;
import java.util.Random;
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

public class GUIforgame extends JFrame implements /* ActionListener, */ MouseListener {
	static Random random = new Random();
	private JPanel contentPane;
	static Player player;
	static Computer computer;
	static Board board;
	private boolean turn;
	static int ArmySlct = 0;
	static int BlackSlct = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		player = new Player();
		computer = new Computer();
		board = new Board();
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

	/**
	 * Create the frame.
	 */
	public GUIforgame() {
		turn = true;
		int width = 90;
		int height = 75;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1370, 690);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		int roundsPlayed = 0;
		ArrayList<JLabel> whiteArmy = new ArrayList<JLabel>();
		ArrayList<JLabel> blackArmy = new ArrayList<JLabel>();

		JLabel background = new JLabel("New label");
		background.setBounds(0, 0, 1370, 650);
		background.setHorizontalAlignment(SwingConstants.CENTER);
		background.setIcon(new ImageIcon("./armies/backgrounddd.png"));
		contentPane.add(background);

		Image destroyedDemo = new ImageIcon(this.getClass().getResource("/rip.png")).getImage();
		Image destroyed = destroyedDemo.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);

		JLabel whiteSoldier1Lbl = new JLabel("");
		Image whiteSoldier1Icn = new ImageIcon(this.getClass().getResource("/whiteArmy1.png")).getImage();
		Image whiteSoldier1 = whiteSoldier1Icn.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
		whiteSoldier1Lbl.setIcon(new ImageIcon(whiteSoldier1));
		whiteSoldier1Lbl.setBounds(255, 10, 93, 69);
		background.add(whiteSoldier1Lbl);
		whiteSoldier1Lbl.addMouseListener(new MouseInputAdapter() {
			public void mouseClicked(MouseEvent e) {
				// if (player.getArmyByNr(1).getPosOnBoard() == -1)
				ArmySlct = 1;
				System.out.println("Board qysh jon i kan fuqit ren :  " + getBoard());
				System.out.println("Board qysh jon poisitonet ren : " + getBoardPos());

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
				// if (player.getArmyByNr(2).getPosOnBoard() == -1)
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
				// if (player.getArmyByNr(3).getPosOnBoard() == -1)
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
				// if (player.getArmyByNr(4).getPosOnBoard() == -1)
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
				// (player.getArmyByNr(5).getPosOnBoard() == -1)
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
				// if (player.getArmyByNr(6).getPosOnBoard() == -1)
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
				// if (player.getArmyByNr(7).getPosOnBoard() == -1)
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
				// if (player.getArmyByNr(8).getPosOnBoard() == -1)
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
		blackSoldier1Lbl.addMouseListener(new MouseInputAdapter() {

			public void mouseClicked(MouseEvent e) {
				BlackSlct = 1;
				removeBlack(blackArmy, BlackSlct, destroyed, whiteArmy);
				// if (roundsPlayed == 8) {
				// call the method for destroying the soldier
				// blackSoldier1Lbl.setIcon(new ImageIcon(destroyed));
				// }

			}
		});

		JLabel blackSoldier2Lbl = new JLabel("");
		Image blackSoldier2Icn = new ImageIcon(this.getClass().getResource("/blackArmy2.png")).getImage();
		Image blackSoldier2 = blackSoldier2Icn.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
		blackSoldier2Lbl.setIcon(new ImageIcon(blackSoldier2));
		blackSoldier2Lbl.setBounds(355, 562, 93, 69);
		background.add(blackSoldier2Lbl);
		blackSoldier2Lbl.addMouseListener(new MouseInputAdapter() {

			public void mouseClicked(MouseEvent e) {
				BlackSlct = 2;
				removeBlack(blackArmy, BlackSlct, destroyed, whiteArmy);
				// if (roundsPlayed == 8) {
				// call the method for destroying the soldier
				// blackSoldier2Lbl.setIcon(new ImageIcon(destroyed));
				// }
			}
		});

		JLabel blackSoldier3Lbl = new JLabel("");
		Image blackSoldier3Icn = new ImageIcon(this.getClass().getResource("/blackArmy3.png")).getImage();
		Image blackSoldier3 = blackSoldier3Icn.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
		blackSoldier3Lbl.setIcon(new ImageIcon(blackSoldier3));
		blackSoldier3Lbl.setBounds(458, 562, 93, 69);
		background.add(blackSoldier3Lbl);
		blackSoldier3Lbl.addMouseListener(new MouseInputAdapter() {

			public void mouseClicked(MouseEvent e) {
				BlackSlct = 3;
				removeBlack(blackArmy, BlackSlct, destroyed, whiteArmy);
				// if (roundsPlayed == 8) {
				// call the method for destroying the soldier
				// blackSoldier3Lbl.setIcon(new ImageIcon(destroyed));
				// }
			}
		});

		JLabel blackSoldier4Lbl = new JLabel("");
		Image blackSoldier4Icn = new ImageIcon(this.getClass().getResource("/blackArmy4.png")).getImage();
		Image blackSoldier4 = blackSoldier4Icn.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
		blackSoldier4Lbl.setIcon(new ImageIcon(blackSoldier4));
		blackSoldier4Lbl.setBounds(561, 562, 93, 69);
		background.add(blackSoldier4Lbl);
		blackSoldier4Lbl.addMouseListener(new MouseInputAdapter() {

			public void mouseClicked(MouseEvent e) {
				BlackSlct = 4;
				removeBlack(blackArmy, BlackSlct, destroyed, whiteArmy);
				// if (roundsPlayed == 8) {
				// call the method for destroying the soldier
				// blackSoldier4Lbl.setIcon(new ImageIcon(destroyed));
				// }
			}
		});

		JLabel blackSoldier5Lbl = new JLabel("");
		Image blackSoldier5Icn = new ImageIcon(this.getClass().getResource("/blackArmy5.png")).getImage();
		Image blackSoldier5 = blackSoldier5Icn.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
		blackSoldier5Lbl.setIcon(new ImageIcon(blackSoldier5));
		blackSoldier5Lbl.setBounds(664, 562, 93, 69);
		background.add(blackSoldier5Lbl);
		blackSoldier5Lbl.addMouseListener(new MouseInputAdapter() {

			public void mouseClicked(MouseEvent e) {
				BlackSlct = 5;
				removeBlack(blackArmy, BlackSlct, destroyed, whiteArmy);
				// if (roundsPlayed == 8) {
				// call the method for destroying the soldier
				// blackSoldier5Lbl.setIcon(new ImageIcon(destroyed));
				// }
			}
		});

		JLabel blackSoldier6Lbl = new JLabel("");
		Image blackSoldier6Icn = new ImageIcon(this.getClass().getResource("/blackArmy6.png")).getImage();
		Image blackSoldier6 = blackSoldier6Icn.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
		blackSoldier6Lbl.setIcon(new ImageIcon(blackSoldier6));
		blackSoldier6Lbl.setBounds(762, 562, 93, 69);
		background.add(blackSoldier6Lbl);
		blackSoldier6Lbl.addMouseListener(new MouseInputAdapter() {

			public void mouseClicked(MouseEvent e) {
				BlackSlct = 6;
				removeBlack(blackArmy, BlackSlct, destroyed, whiteArmy);
				// if (roundsPlayed == 8) {
				// call the method for destroying the soldier
				// blackSoldier6Lbl.setIcon(new ImageIcon(destroyed));
				// }
			}
		});

		JLabel blackSoldier7Lbl = new JLabel("");
		Image blackSoldier7Icn = new ImageIcon(this.getClass().getResource("/blackArmy7.png")).getImage();
		Image blackSoldier7 = blackSoldier7Icn.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
		blackSoldier7Lbl.setIcon(new ImageIcon(blackSoldier7));
		blackSoldier7Lbl.setBounds(861, 562, 93, 69);
		background.add(blackSoldier7Lbl);
		blackSoldier7Lbl.addMouseListener(new MouseInputAdapter() {

			public void mouseClicked(MouseEvent e) {
				BlackSlct = 7;

				removeBlack(blackArmy, BlackSlct, destroyed, whiteArmy);
				// if (roundsPlayed == 8) {
				// call the method for destroying the soldier
				// blackSoldier7Lbl.setIcon(new ImageIcon(destroyed));
				// }
			}
		});

		JLabel blackSoldier8Lbl = new JLabel("");
		Image blackSoldier8Icn = new ImageIcon(this.getClass().getResource("/blackArmy8.png")).getImage();
		Image blackSoldier8 = blackSoldier8Icn.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
		blackSoldier8Lbl.setIcon(new ImageIcon(blackSoldier8));
		blackSoldier8Lbl.setBounds(958, 562, 93, 69);
		background.add(blackSoldier8Lbl);
		blackSoldier8Lbl.addMouseListener(new MouseInputAdapter() {
			public void mouseClicked(MouseEvent e) {
				BlackSlct = 8;
				// destroyArmy(board, 8, blackSoldier8Lbl);
				removeBlack(blackArmy, BlackSlct, destroyed, whiteArmy);
				// if (roundsPlayed == 8) {
				// call the method for destroying the soldier
				// blackSoldier8Lbl.setIcon(new ImageIcon(destroyed));
				// }
			}
		});

		whiteArmy.addAll(Arrays.asList(whiteSoldier1Lbl, whiteSoldier2Lbl, whiteSoldier3Lbl, whiteSoldier4Lbl,
				whiteSoldier5Lbl, whiteSoldier6Lbl, whiteSoldier7Lbl, whiteSoldier8Lbl));

		blackArmy.addAll(Arrays.asList(blackSoldier1Lbl, blackSoldier2Lbl, blackSoldier3Lbl, blackSoldier4Lbl,
				blackSoldier5Lbl, blackSoldier6Lbl, blackSoldier7Lbl, blackSoldier8Lbl));

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
				// if (player.getArmyByNr(1).getPosOnBoard() == -1)
				placeArmy(1, ArmySlct, whiteArmy, blackArmy, roundsPlayed);
			}
		});

		JLabel position2 = new JLabel("");
		position2.setBorder(border);
		position2.setBounds(85, yBoard, widthBoard, heightBoard);
		background.add(position2);
		position2.addMouseListener(new MouseInputAdapter() {
			public void mouseClicked(MouseEvent e) {
				// if (player.getArmyByNr(2).getPosOnBoard() == -1)
				placeArmy(2, ArmySlct, whiteArmy, blackArmy, roundsPlayed);
			}
		});

		JLabel position3 = new JLabel("");
		position3.setBorder(border);
		position3.setBounds(170, yBoard, widthBoard, heightBoard);
		background.add(position3);
		position3.addMouseListener(new MouseInputAdapter() {
			public void mouseClicked(MouseEvent e) {
				// if (player.getArmyByNr(1).getPosOnBoard() == -1)
				placeArmy(3, ArmySlct, whiteArmy, blackArmy, roundsPlayed);
			}
		});

		JLabel position4 = new JLabel("");
		position4.setBorder(border);
		position4.setBounds(255, yBoard, widthBoard, heightBoard);
		background.add(position4);
		position4.addMouseListener(new MouseInputAdapter() {
			public void mouseClicked(MouseEvent e) {
				// if (player.getArmyByNr(1).getPosOnBoard() == -1)
				placeArmy(4, ArmySlct, whiteArmy, blackArmy, roundsPlayed);
			}
		});

		JLabel position5 = new JLabel("");
		position5.setBorder(border);
		position5.setBounds(340, yBoard, widthBoard, heightBoard);
		background.add(position5);
		position5.addMouseListener(new MouseInputAdapter() {
			public void mouseClicked(MouseEvent e) {
				// if (player.getArmyByNr(1).getPosOnBoard() == -1)
				placeArmy(5, ArmySlct, whiteArmy, blackArmy, roundsPlayed);
			}
		});

		JLabel position6 = new JLabel("");
		position6.setBorder(border);
		position6.setBounds(425, yBoard, widthBoard, heightBoard);
		background.add(position6);
		position6.addMouseListener(new MouseInputAdapter() {
			public void mouseClicked(MouseEvent e) {
				// if (player.getArmyByNr(1).getPosOnBoard() == -1)
				placeArmy(6, ArmySlct, whiteArmy, blackArmy, roundsPlayed);
			}
		});

		JLabel position7 = new JLabel("");
		position7.setBorder(border);
		position7.setBounds(510, yBoard, widthBoard, heightBoard);
		background.add(position7);
		position7.addMouseListener(new MouseInputAdapter() {
			public void mouseClicked(MouseEvent e) {
				// if (player.getArmyByNr(1).getPosOnBoard() == -1)
				placeArmy(7, ArmySlct, whiteArmy, blackArmy, roundsPlayed);
			}
		});

		JLabel position8 = new JLabel("");
		position8.setBorder(border);
		position8.setBounds(595, yBoard, widthBoard, heightBoard);
		background.add(position8);
		position8.addMouseListener(new MouseInputAdapter() {
			public void mouseClicked(MouseEvent e) {
				// if (player.getArmyByNr(1).getPosOnBoard() == -1)
				placeArmy(8, ArmySlct, whiteArmy, blackArmy, roundsPlayed);
			}
		});

		JLabel position9 = new JLabel("");
		position9.setBorder(border);
		position9.setBounds(680, yBoard, widthBoard, heightBoard);
		background.add(position9);
		position9.addMouseListener(new MouseInputAdapter() {
			public void mouseClicked(MouseEvent e) {
				// if (player.getArmyByNr(1).getPosOnBoard() == -1)
				placeArmy(9, ArmySlct, whiteArmy, blackArmy, roundsPlayed);
			}
		});

		JLabel position10 = new JLabel("");
		position10.setBorder(border);
		position10.setBounds(765, yBoard, widthBoard, heightBoard);
		background.add(position10);
		position10.addMouseListener(new MouseInputAdapter() {
			public void mouseClicked(MouseEvent e) {
				placeArmy(10, ArmySlct, whiteArmy, blackArmy, roundsPlayed);
			}
		});

		JLabel position11 = new JLabel("");
		position11.setBorder(border);
		position11.setBounds(850, yBoard, widthBoard, heightBoard);
		background.add(position11);
		position11.addMouseListener(new MouseInputAdapter() {
			public void mouseClicked(MouseEvent e) {
				placeArmy(11, ArmySlct, whiteArmy, blackArmy, roundsPlayed);
			}
		});

		JLabel position12 = new JLabel("");
		position12.setBorder(border);
		position12.setBounds(935, yBoard, widthBoard, heightBoard);
		background.add(position12);
		position12.addMouseListener(new MouseInputAdapter() {
			public void mouseClicked(MouseEvent e) {
				placeArmy(12, ArmySlct, whiteArmy, blackArmy, roundsPlayed);
			}
		});

		JLabel position13 = new JLabel("");
		position13.setBorder(border);
		position13.setBounds(1020, yBoard, widthBoard, heightBoard);
		background.add(position13);
		position13.addMouseListener(new MouseInputAdapter() {
			public void mouseClicked(MouseEvent e) {
				placeArmy(13, ArmySlct, whiteArmy, blackArmy, roundsPlayed);
			}
		});

		JLabel position14 = new JLabel("");
		position14.setBorder(border);
		position14.setBounds(1105, yBoard, widthBoard, heightBoard);
		background.add(position14);
		position14.addMouseListener(new MouseInputAdapter() {
			public void mouseClicked(MouseEvent e) {
				// if (player.getArmyByNr(1).getPosOnBoard() == -1)
				placeArmy(14, ArmySlct, whiteArmy, blackArmy, roundsPlayed);
			}
		});

		JLabel position15 = new JLabel("");
		position15.setBorder(border);
		position15.setBounds(1190, yBoard, widthBoard, heightBoard);
		background.add(position15);
		position15.addMouseListener(new MouseInputAdapter() {
			public void mouseClicked(MouseEvent e) {
				// if (player.getArmyByNr(1).getPosOnBoard() == -1)
				placeArmy(15, ArmySlct, whiteArmy, blackArmy, roundsPlayed);
			}
		});

		JLabel position16 = new JLabel("");
		position16.setBorder(border);
		position16.setBounds(1275, yBoard, 80, heightBoard);
		background.add(position16);
		position16.addMouseListener(new MouseInputAdapter() {
			public void mouseClicked(MouseEvent e) {
				/// if (player.getArmyByNr(1).getPosOnBoard() == -1)
				placeArmy(16, ArmySlct, whiteArmy, blackArmy, roundsPlayed);
			}
		});

	}

//	@Override
//	public void actionPerformed(ActionEvent e) {
//// TODO Auto-generated method stub
//
//	}

	int[] placesDeployed = new int[17];

	public void moveToBoard(JLabel selectedSoldier, int i) {

		switch (i) {
		case 1:
			selectedSoldier.setLocation(0, 295);
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
//		if(turn == true) {
//			turn = false;			
//		}else {
//			turn = true;
//		}

	}

	public void placeArmy(int i, int armySlct, ArrayList<JLabel> whiteArmy, ArrayList<JLabel> blackArmy,
			int roundsPlayed) {
		switch (armySlct) {
		case 1:
			moveToBoard(whiteArmy.get(0), i);
			board.addArmy(player.getArmyByNr(1), i);
			player.getArmyByNr(1).setPosOnBoard(i);
			addNumberInArray(placesDeployed, i);
			break;
		case 2:
			moveToBoard(whiteArmy.get(1), i);
			board.addArmy(player.getArmyByNr(2), i);
			player.getArmyByNr(2).setPosOnBoard(i);
			addNumberInArray(placesDeployed, i);

			break;
		case 3:
			moveToBoard(whiteArmy.get(2), i);
			board.addArmy(player.getArmyByNr(3), i);
			player.getArmyByNr(3).setPosOnBoard(i);
			addNumberInArray(placesDeployed, i);
			break;
		case 4:
			moveToBoard(whiteArmy.get(3), i);
			board.addArmy(player.getArmyByNr(4), i);
			player.getArmyByNr(4).setPosOnBoard(i);
			addNumberInArray(placesDeployed, i);
			break;
		case 5:
			moveToBoard(whiteArmy.get(4), i);
			board.addArmy(player.getArmyByNr(5), i);
			player.getArmyByNr(5).setPosOnBoard(i);
			addNumberInArray(placesDeployed, i);
			break;
		case 6:
			moveToBoard(whiteArmy.get(5), i);
			board.addArmy(player.getArmyByNr(6), i);
			player.getArmyByNr(6).setPosOnBoard(i);
			addNumberInArray(placesDeployed, i);
			break;
		case 7:
			moveToBoard(whiteArmy.get(6), i);
			board.addArmy(player.getArmyByNr(7), i);
			player.getArmyByNr(7).setPosOnBoard(i);
			addNumberInArray(placesDeployed, i);
			break;
		case 8:
			moveToBoard(whiteArmy.get(7), i);
			board.addArmy(player.getArmyByNr(8), i);
			player.getArmyByNr(8).setPosOnBoard(i);
			addNumberInArray(placesDeployed, i);
			break;
		}

		// if(turn == false) {
		blackDeploy(blackArmy, blackDeployed);
		// }

//		for (int j = 0; j < board.getLength(); j++) {
//			System.out.print(j + "");
//		}
		roundsPlayed += 1;
		board.toString();

	}

	int[] blackDeployed = new int[8];

	public void blackDeploy(ArrayList<JLabel> blackArmy, int[] blackDeployed) {
		int blackSelected = (int) (1 + (Math.random() * 8));
		int placeSelected = (int) (Math.random() * 16);
		while (checkArray(blackDeployed, blackSelected) == true) {
			blackSelected = (int) (1 + (Math.random() * 8));
		}
		while (checkArray(placesDeployed, placeSelected) == true) {
			placeSelected = (int) (Math.random() * 16);
		}
		addNumberInArray(blackDeployed, blackSelected);
		addNumberInArray(placesDeployed, placeSelected);
		board.addArmy(computer.getArmyByNr(blackSelected), placeSelected);
		computer.getArmyByNr(blackSelected).setPosOnBoard(placeSelected);
		// placeArmy();
		placeBlackArmy(placeSelected, blackSelected, blackArmy);
		System.out.println("Black deployed army " + blackSelected + " at pos. " + placeSelected + "\n");
	}

	// Check array if that soldier is deployed
	public boolean checkArray(int[] blackDeployed, int selectedNumber) {
		boolean test = false;
		for (int element : blackDeployed) {
			if (element == selectedNumber) {
				test = true;
				break;
			}
		}
		return test;
	}

	// after the soldier is deployed add its' number in the array so it won't be
	// able to deploy again
	public static int[] addNumberInArray(int[] blackDeployed, int blackSelected) {
		for (int i = 0; i < blackDeployed.length; i++) {
			if (blackDeployed[i] == 0) {
				blackDeployed[i] = blackSelected;
				break;
			}
		}
		return blackDeployed;
	}

	public void placeBlackArmy(int placeSelected, int blackSelected, ArrayList<JLabel> blackArmy) {
		switch (blackSelected) {
		case 1:
			moveToBoard(blackArmy.get(0), placeSelected);
//			System.out.println("1");
//			board.addArmy(player.getArmyByNr(1), blackSelected);
			computer.getArmyByNr(1).setPosOnBoard(blackSelected);
			break;
		case 2:
			moveToBoard(blackArmy.get(1), placeSelected);
//			board.addArmy(player.getWhiteA2(i), i));
//			board.addArmy(player.getArmyByNr(2), blackSelected);
			computer.getArmyByNr(2).setPosOnBoard(blackSelected);

			break;
		case 3:
			moveToBoard(blackArmy.get(2), placeSelected);
//			board.addArmy(player.getArmyByNr(3), blackSelected);
			computer.getArmyByNr(3).setPosOnBoard(blackSelected);
			break;
		case 4:
			moveToBoard(blackArmy.get(3), placeSelected);
//			board.addArmy(player.getArmyByNr(4), blackSelected);
			computer.getArmyByNr(4).setPosOnBoard(blackSelected);
			break;
		case 5:
			moveToBoard(blackArmy.get(4), placeSelected);
//			board.addArmy(player.getArmyByNr(5), blackSelected);
			computer.getArmyByNr(5).setPosOnBoard(blackSelected);
			break;
		case 6:
			moveToBoard(blackArmy.get(5), placeSelected);
//			board.addArmy(player.getArmyByNr(6), blackSelected);
			computer.getArmyByNr(6).setPosOnBoard(blackSelected);
			break;
		case 7:
			moveToBoard(blackArmy.get(6), placeSelected);
//			board.addArmy(player.getArmyByNr(7), blackSelected);
			computer.getArmyByNr(7).setPosOnBoard(blackSelected);
			break;
		case 8:
			moveToBoard(blackArmy.get(7), placeSelected);
//			board.addArmy(player.getArmyByNr(8), blackSelected);
			computer.getArmyByNr(8).setPosOnBoard(blackSelected);
			break;
		}
		if (turn == true) {
			turn = false;
		} else {
			turn = true;
		}
		System.out.println(turn);
	}

	public boolean removeBlack(ArrayList<JLabel> blackArmy, int blackSlct, Image destroyed,
			ArrayList<JLabel> whiteArmy) {
		switch (blackSlct) {
		case 1:
			if (destroyBlack(1)) {
				System.out.println("Destoyed black 1");
				destroyBlackArmy(board, 1, blackArmy.get(0), destroyed, whiteArmy);
				// blackArmy.get(0).setIcon(new ImageIcon());
			}
			break;
		case 2:
			if (destroyBlack(2)) {
				System.out.println("Destroy black 2");
				destroyBlackArmy(board, 2, blackArmy.get(1), destroyed, whiteArmy);
				// blackArmy.get(1).setIcon(new ImageIcon());
			}
			break;
		case 3:
			if (destroyBlack(3)) {
				System.out.println("Destroy black 3");
				destroyBlackArmy(board, 3, blackArmy.get(2), destroyed, whiteArmy);
				// 1blackArmy.get(2).setIcon(new ImageIcon());
			}
			break;
		case 4:
			if (destroyBlack(4)) {
				System.out.println("Destroy black 4");
				destroyBlackArmy(board, 4, blackArmy.get(3), destroyed, whiteArmy);
//				blackArmy.get(3).setIcon(new ImageIcon());
			}
			break;
		case 5:
			if (destroyBlack(5)) {
				System.out.println("Destroy black 5");
				destroyBlackArmy(board, 5, blackArmy.get(4), destroyed, whiteArmy);
//				blackArmy.get(4).setIcon(new ImageIcon());
			}
			break;
		case 6:
			if (destroyBlack(6)) {
				System.out.println("Destroy black 6");
				destroyBlackArmy(board, 6, blackArmy.get(5), destroyed, whiteArmy);
//				blackArmy.get(5).setIcon(new ImageIcon());
			}
			break;
		case 7:
			if (destroyBlack(7)) {
				System.out.println("Destroy black 7");
				destroyBlackArmy(board, 7, blackArmy.get(6), destroyed, whiteArmy);
//				blackArmy.get(6).setIcon(new ImageIcon());
			}
			break;
		case 8:
			if (destroyBlack(8)) {
				System.out.println("Destroy black 8");
				destroyBlackArmy(board, 8, blackArmy.get(7), destroyed, whiteArmy);
//				blackArmy.get(7).setIcon(new ImageIcon());
			}
			break;

		}
		return false;

	}

	public boolean destroyBlack(int armySlct) {
		// if
		// (board.isAlive(board.getNextArmyPosition(computer.getArmyByNr(armySlct).getPosOnBoard())))
		// {
		if (board.isWhite(board.getNextArmyPosition(computer.getArmyByNr(armySlct).getPosOnBoard()))) {
			if (board.armyPower(board.getNextArmyPosition(computer.getArmyByNr(armySlct).getPosOnBoard())) > board
					.armyPower(board.getPosition(computer.getArmyByNr(armySlct).getPosOnBoard()))) {
				System.out.println("bardh: "
						+ board.armyPower(board.getNextArmyPosition(computer.getArmyByNr(armySlct).getPosOnBoard())));
				System.out.println(
						"zi: " + board.armyPower(board.getPosition(computer.getArmyByNr(armySlct).getPosOnBoard())));
				computer.kill(armySlct);
				// computer.setArmyPowerTo0(armySlct);
//				computer.printArmyNr();
				return true;

			}
		}
		// }
		// if
		// (board.isAlive(board.getPreviousArmyPosition(computer.getArmyByNr(armySlct).getPosOnBoard())))
		// {
		// if (computer.getArmyByNr(armySlct).getPosOnBoard() != 1) {
		if (board.isWhite(board.getPreviousArmyPosition(computer.getArmyByNr(armySlct).getPosOnBoard()))) {
			if (board.armyPower(board.getPreviousArmyPosition(computer.getArmyByNr(armySlct).getPosOnBoard())) > board
					.armyPower(board.getPosition(computer.getArmyByNr(armySlct).getPosOnBoard()))) {
				System.out.println("perpara bardh: " + board
						.armyPower(board.getPreviousArmyPosition(computer.getArmyByNr(armySlct).getPosOnBoard())));
				System.out.println(
						"i ziu: " + board.armyPower(board.getPosition(computer.getArmyByNr(armySlct).getPosOnBoard())));
				computer.kill(armySlct);
				// computer.setArmyPowerTo0(armySlct);
//					computer.printArmyNr();
				return true;
			}
		}
		// }
		// }
		// (board.isAlive(board.getNextArmyPosition(computer.getArmyByNr(armySlct).getPosOnBoard()))
		// &&
		// board.isAlive(board.getPreviousArmyPosition(computer.getArmyByNr(armySlct).getPosOnBoard())))
		if (board.isWhite(board.getNextArmyPosition(computer.getArmyByNr(armySlct).getPosOnBoard()))
				&& board.isWhite(board.getPreviousArmyPosition(computer.getArmyByNr(armySlct).getPosOnBoard()))) {
			if (board.armyPower(board.getNextArmyPosition(computer.getArmyByNr(armySlct).getPosOnBoard())) + board
					.armyPower(board.getPreviousArmyPosition(computer.getArmyByNr(armySlct).getPosOnBoard())) > board
							.armyPower(board.getPosition(computer.getArmyByNr(armySlct).getPosOnBoard()))) {
				System.out.println("dyjat bashk e mujten");
				computer.kill(armySlct);
				// computer.setArmyPowerTo0(armySlct);
//				computer.printArmyNr();
				return true;
			}
		}
		return false;

	}

	public void destroyBlackArmy(Board board, int blackselected, JLabel blackSoldier1Lbl, Image destroyed,
			ArrayList<JLabel> whiteArmy) {
		System.out.println("jasht");
		if (destroyBlack(blackselected)) {
			System.out.println("mrena");
			blackSoldier1Lbl.setIcon(new ImageIcon(destroyed));
			System.out.println("ja heka fuqin ja la 0");

		}
		removeWhite(whiteArmy, destroyed);
	}

	public void destroyWhiteArmy(JLabel whiteSoldier1Lbl, int blackSelected) {
		if (destroyWhite(blackSelected)) {
			System.out.println("haha ta prisha ta lash 0");
			whiteSoldier1Lbl.setIcon(new ImageIcon());
		}
	}

	int[] whiteDestroyed = new int[8];

	public boolean destroyWhite(int blackSelected) {

		if (board.isBlack(board.getNextArmyPosition(player.getArmyByNr(blackSelected).getPosOnBoard()))) {
			if (board.armyPower(board.getNextArmyPosition(player.getArmyByNr(blackSelected).getPosOnBoard())) > board
					.armyPower(board.getPosition(player.getArmyByNr(blackSelected).getPosOnBoard()))) {
				System.out.println("bardh: " + board
						.armyPower(board.getNextArmyPosition(player.getArmyByNr(blackSelected).getPosOnBoard())));
				System.out.println(
						"zi: " + board.armyPower(board.getPosition(player.getArmyByNr(blackSelected).getPosOnBoard())));
				return true;
			}
		}

		if (board.isBlack(board.getPreviousArmyPosition(player.getArmyByNr(blackSelected).getPosOnBoard()))) {
			if (board
					.armyPower(board.getPreviousArmyPosition(player.getArmyByNr(blackSelected).getPosOnBoard())) > board
							.armyPower(board.getPosition(player.getArmyByNr(blackSelected).getPosOnBoard()))) {
				System.out.println("perpara bardh: " + board
						.armyPower(board.getPreviousArmyPosition(player.getArmyByNr(blackSelected).getPosOnBoard())));
				System.out.println("i ziu: "
						+ board.armyPower(board.getPosition(player.getArmyByNr(blackSelected).getPosOnBoard())));
				return true;
			}
		}

		if (board.isBlack(board.getNextArmyPosition(player.getArmyByNr(blackSelected).getPosOnBoard()))
				&& board.isBlack(board.getPreviousArmyPosition(player.getArmyByNr(blackSelected).getPosOnBoard()))) {
			if (board.armyPower(board.getNextArmyPosition(player.getArmyByNr(blackSelected).getPosOnBoard())) + board
					.armyPower(board.getPreviousArmyPosition(player.getArmyByNr(blackSelected).getPosOnBoard())) > board
							.armyPower(board.getPosition(player.getArmyByNr(blackSelected).getPosOnBoard()))) {
				System.out.println("dyjat bashk e mujten");
				return true;
			}
		}
		return false;
	}

	public boolean removeWhite(ArrayList<JLabel> whiteArmy, Image destroyed) {
		int blackSelected = (int) (1 + (Math.random() * 8));
		while (checkArray(whiteDestroyed, blackSelected) == true
				|| computer.getArmyByNr(blackSelected).getIsAlive() == true) {
			blackSelected = (int) (1 + (Math.random() * 8));
//			while(computer.getArmyByNr(blackSelected).getIsAlive() != true)
		}
		addNumberInArray(whiteDestroyed, blackSelected);
		switch (blackSelected) {
		case 1:
			if (destroyBlack(1)) {
				System.out.println("Destoyed black 1");
				destroyWhiteArmy(whiteArmy.get(0), 1);
			}
			break;
		case 2:
			if (destroyBlack(2)) {
				System.out.println("Destroy black 2");
				destroyWhiteArmy(whiteArmy.get(1), 2);
			}
			break;
		case 3:
			if (destroyBlack(3)) {
				System.out.println("Destroy black 3");
				destroyWhiteArmy(whiteArmy.get(2), 3);
			}
			break;
		case 4:
			if (destroyBlack(4)) {
				System.out.println("Destroy black 4");
				destroyWhiteArmy(whiteArmy.get(3), 4);
			}
			break;
		case 5:
			if (destroyBlack(5)) {
				System.out.println("Destroy black 5");
				destroyWhiteArmy(whiteArmy.get(4), 5);
			}
			break;
		case 6:
			if (destroyBlack(6)) {
				System.out.println("Destroy black 6");
				destroyWhiteArmy(whiteArmy.get(5), 6);
			}
			break;
		case 7:
			if (destroyBlack(7)) {
				System.out.println("Destroy black 7");
				destroyWhiteArmy(whiteArmy.get(6), 7);
			}
			break;
		case 8:
			if (destroyBlack(8)) {
				System.out.println("Destroy black 8");
				destroyWhiteArmy(whiteArmy.get(7), 8);
			}
			break;

		}
		return false;
	}

	public void deploy() {

	}

	@Override
	public void mouseClicked(MouseEvent e) {
// TODO Auto-generated method stub

	}

	public String getBoard() {
		String a = "";
		for (int i = 0; i < 17; i++) {
			if (Board.gameBoard[i] != null)
				a = a + Board.gameBoard[i].getArmyNr() + " ";
		}
		return a;

	}

	public String getBoardPos() {
		String a = "";
		for (int i = 0; i < 17; i++) {
			if (Board.gameBoard[i] != null)
				a = a + i + " ";
		}
		return a;

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