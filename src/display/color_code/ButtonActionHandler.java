package display.color_code;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import components.resistors.Resistor;

public class ButtonActionHandler{
	
	public static String first_band4, second_band4, third_band4, fourth_band4;
	public static int n = 1;
	
	public static JLabel[] l;
	public static JLabel lb,lb2;
	
	public static void getColorButtonAction(final JPanel p, final ImageIcon[] image,final ImageIcon[] image2) {
		
		Initializer.initializeButtons();
		l = new JLabel[40];

		Initializer.b_black.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("black clicked!");
				switch (n) {
				case 1:
					first_band4 = "BLA";
					System.out.println("Band 1: " + first_band4);

				//	initializeLabel(0, 0, 180, image2, image2, p);
					l[0] = new JLabel("",image[0],JLabel.CENTER);
					l[0].setBounds(180, 300, 30, 100);
					l[0].setLayout(null);
					l[0].setVisible(true);
					p.add(l[0]);
					
					break;
				case 2:
					second_band4 = "BLA";
					System.out.println("Band 2: " + second_band4);
					
					l[1] = new JLabel("",image[0],JLabel.CENTER);
					l[1].setBounds(220, 300, 30, 100);
					l[1].setLayout(null);
					l[1].setVisible(true);
					p.add(l[1]);
					
					break;
				case 3:
					third_band4 = "BLA";
					System.out.println("Band 3: " + third_band4);
					
					l[2] = new JLabel("",image[0],JLabel.CENTER);
					l[2].setBounds(270, 300, 30, 100);
					l[2].setLayout(null);
					l[2].setVisible(true);
					p.add(l[2]);
					
					break;
				case 4:
					fourth_band4 = "BLA";
					System.out.println("Band 4: " + fourth_band4);
					
					l[3] = new JLabel("",image2[0],JLabel.CENTER);
					l[3].setBounds(345, 300, 30, 100);
					l[3].setLayout(null);
					l[3].setVisible(true);
					p.add(l[3]);
					
					break;
				default:
					System.out.println("you can't add bands");
					break;
				}
				n++;
				p.repaint();
			}

		});
		Initializer.b_brown.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				// TODO Auto-generated method stub
				System.out.println("brown clicked!");
				switch (n) {
				case 1:
					first_band4 = "BRO";
					System.out.println("Band 1: " + first_band4);

					l[4] = new JLabel("ham",image[1],JLabel.CENTER);
					l[4].setBounds(180, 300, 30, 100);
					l[4].setLayout(null);
					l[4].setVisible(true);
					p.add(l[4]);
					
					break;
				case 2:
					second_band4 = "BRO";
					System.out.println("Band 2: " + second_band4);
					
					l[5] = new JLabel("ham",image[1],JLabel.CENTER);
					l[5].setBounds(220, 300, 30, 100);
					l[5].setLayout(null);
					l[5].setVisible(true);
					p.add(l[5]);
					
					break;
				case 3:
					third_band4 = "BRO";
					System.out.println("Band 3: " + third_band4);
					
					l[6] = new JLabel("ham",image[1],JLabel.CENTER);
					l[6].setBounds(275, 300, 30, 100);
					l[6].setLayout(null);
					l[6].setVisible(true);
					p.add(l[6]);
					
					break;
				case 4:
					fourth_band4 = "BRO";
					System.out.println("Band 4: " + fourth_band4);
					
					l[7] = new JLabel("ham",image2[1],JLabel.CENTER);
					l[7].setBounds(345, 300, 30, 100);
					l[7].setLayout(null);
					l[7].setVisible(true);
					p.add(l[7]);
					
					break;
				default:
					System.out.println("you can't add bands");
					break;
				}
				n++;
				p.repaint();
			}

		});
		Initializer.b_red.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("red clicked!");
				switch (n) {
				case 1:
					first_band4 = "RED";
					System.out.println("Band 1: " + first_band4);
					
					l[8] = new JLabel("ham",image[2],JLabel.CENTER);
					l[8].setBounds(180, 300, 30, 100);
					l[8].setLayout(null);
					l[8].setVisible(true);
					p.add(l[8]);
					
					break;
				case 2:
					second_band4 = "RED";
					System.out.println("Band 2: " + second_band4);
					
					l[9] = new JLabel("ham",image[2],JLabel.CENTER);
					l[9].setBounds(220, 300, 30, 100);
					l[9].setLayout(null);
					l[9].setVisible(true);
					p.add(l[9]);
					
					break;
				case 3:
					third_band4 = "RED";
					System.out.println("Band 3: " + third_band4);
					
					l[10] = new JLabel("ham",image[2],JLabel.CENTER);
					l[10].setBounds(275, 300, 30, 100);
					l[10].setLayout(null);
					l[10].setVisible(true);
					p.add(l[10]);
					
					break;
				case 4:
					fourth_band4 = "RED";
					System.out.println("Band 4: " + fourth_band4);
					
					l[11] = new JLabel("ham",image2[2],JLabel.CENTER);
					l[11].setBounds(345, 300, 30, 100);
					l[11].setLayout(null);
					l[11].setVisible(true);
					p.add(l[11]);
					
					break;
				default:
					System.out.println("you can't add bands");
					break;
				}
				n++;
				p.repaint();

			}

		});
		Initializer.b_orange.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("orange clicked!");
				switch (n) {
				case 1:
					first_band4 = "ORA";
					System.out.println("Band 1: " + first_band4);
					
					l[12] = new JLabel("ham",image[3],JLabel.CENTER);
					l[12].setBounds(180, 300, 30, 100);
					l[12].setLayout(null);
					l[12].setVisible(true);
					p.add(l[12]);
					
					break;
				case 2:
					second_band4 = "ORA";
					System.out.println("Band 2: " + second_band4);
					
					l[13] = new JLabel("ham",image[3],JLabel.CENTER);
					l[13].setBounds(220, 300, 30, 100);
					l[13].setLayout(null);
					l[13].setVisible(true);
					p.add(l[13]);
					
					break;
				case 3:
					third_band4 = "ORA";
					System.out.println("Band 3: " + third_band4);
					
					l[14] = new JLabel("ham",image[3],JLabel.CENTER);
					l[14].setBounds(275, 300, 30, 100);
					l[14].setLayout(null);
					l[14].setVisible(true);
					p.add(l[14]);
					
					break;
				case 4:
					fourth_band4 = "ORA";
					System.out.println("Band 4: " + fourth_band4);
					
					l[15] = new JLabel("ham",image2[3],JLabel.CENTER);
					l[15].setBounds(345, 300, 30, 100);
					l[15].setLayout(null);
					l[15].setVisible(true);
					p.add(l[15]);
					
					break;
				default:
					System.out.println("you can't add bands");
					break;
				}
				n++;
				p.repaint();

			}

		});
		Initializer.b_yellow.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("brown clicked!");
				switch (n) {
				case 1:
					first_band4 = "YEL";
					System.out.println("Band 1: " + first_band4);
					
					l[16] = new JLabel("ham",image[4],JLabel.CENTER);
					l[16].setBounds(180, 300, 30, 100);
					l[16].setLayout(null);
					l[16].setVisible(true);
					p.add(l[16]);
					
					break;
				case 2:
					second_band4 = "YEL";
					System.out.println("Band 2: " + second_band4);
					
					l[17] = new JLabel("ham",image[4],JLabel.CENTER);
					l[17].setBounds(220, 300, 30, 100);
					l[17].setLayout(null);
					l[17].setVisible(true);
					p.add(l[17]);
					
					break;
				case 3:
					third_band4 = "YEL";
					System.out.println("Band 3: " + third_band4);
					
					l[18] = new JLabel("ham",image[4],JLabel.CENTER);
					l[18].setBounds(275, 300, 30, 100);
					l[18].setLayout(null);
					l[18].setVisible(true);
					p.add(l[18]);
					
					break;
				case 4:
					fourth_band4 = "YEL";
					System.out.println("Band 4: " + fourth_band4);
					
					l[19] = new JLabel("ham",image2[4],JLabel.CENTER);
					l[19].setBounds(345, 300, 30, 100);
					l[19].setLayout(null);
					l[19].setVisible(true);
					p.add(l[19]);
					
					break;
				default:
					System.out.println("you can't add bands");
					break;
				}
				n++;
				p.repaint();

			}

		});
		Initializer.b_green.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("green clicked!");
				switch (n) {
				case 1:
					first_band4 = "GRE";
					System.out.println("Band 1: " + first_band4);
					
					l[20] = new JLabel("ham",image[5],JLabel.CENTER);
					l[20].setBounds(180, 300, 30, 100);
					l[20].setLayout(null);
					l[20].setVisible(true);
					p.add(l[20]);
				
					break;
				case 2:
					second_band4 = "GRE";
					System.out.println("Band 2: " + second_band4);
					
					l[21] = new JLabel("ham",image[5],JLabel.CENTER);
					l[21].setBounds(220, 300, 30, 100);
					l[21].setLayout(null);
					l[21].setVisible(true);
					p.add(l[21]);
					
					break;
				case 3:
					third_band4 = "GRE";
					System.out.println("Band 3: " + third_band4);
					
					l[22] = new JLabel("ham",image[5],JLabel.CENTER);
					l[22].setBounds(275, 300, 30, 100);
					l[22].setLayout(null);
					l[22].setVisible(true);
					p.add(l[22]);
					
					break;
				case 4:
					fourth_band4 = "GRE";
					System.out.println("Band 4: " + fourth_band4);
					
					l[23] = new JLabel("ham",image2[5],JLabel.CENTER);
					l[23].setBounds(345, 300, 30, 100);
					l[23].setLayout(null);
					l[23].setVisible(true);
					p.add(l[23]);
					
					break;
				default:
					System.out.println("you can't add bands");
					break;
				}
				n++;
				p.repaint();
			}

		});
		Initializer.b_blue.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("blue clicked!");
				switch (n) {
				case 1:
					first_band4 = "BLU";
					System.out.println("Band 1: " + first_band4);
					
					l[24] = new JLabel("ham",image[6],JLabel.CENTER);
					l[24].setBounds(180, 300, 30, 100);
					l[24].setLayout(null);
					l[24].setVisible(true);
					p.add(l[24]);
					
					break;
				case 2:
					second_band4 = "BLU";
					System.out.println("Band 2: " + second_band4);
					
					l[25] = new JLabel("ham",image[6],JLabel.CENTER);
					l[25].setBounds(220, 300, 30, 100);
					l[25].setLayout(null);
					l[25].setVisible(true);
					p.add(l[25]);
					
					break;
				case 3:
					third_band4 = "BLU";
					System.out.println("Band 3: " + third_band4);
					
					l[26] = new JLabel("ham",image[6],JLabel.CENTER);
					l[26].setBounds(275, 300, 30, 100);
					l[26].setLayout(null);
					l[26].setVisible(true);
					p.add(l[26]);
					
					break;
				case 4:
					fourth_band4 = "BLU";
					System.out.println("Band 4: " + fourth_band4);
					
					l[27] = new JLabel("ham",image2[6],JLabel.CENTER);
					l[27].setBounds(345, 300, 30, 100);
					l[27].setLayout(null);
					l[27].setVisible(true);
					p.add(l[27]);
					
					break;
				default:
					System.out.println("you can't add bands");
					break;
				}
				n++;
				p.repaint();
			}

		});
		Initializer.b_violet.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("violet clicked!");
				switch (n) {
				case 1:
					first_band4 = "VIO";
					System.out.println("Band 1: " + first_band4);
					
					l[28] = new JLabel("ham",image[7],JLabel.CENTER);
					l[28].setBounds(180, 300, 30, 100);
					l[28].setLayout(null);
					l[28].setVisible(true);
					p.add(l[28]);
					
					break;
				case 2:
					second_band4 = "VIO";
					System.out.println("Band 2: " + second_band4);
					
					l[29] = new JLabel("ham",image[7],JLabel.CENTER);
					l[29].setBounds(220, 300, 30, 100);
					l[29].setLayout(null);
					l[29].setVisible(true);
					p.add(l[29]);
					
					break;
				case 3:
					third_band4 = "VIO";
					System.out.println("Band 3: " + third_band4);
					
					l[30] = new JLabel("ham",image[7],JLabel.CENTER);
					l[30].setBounds(275, 300, 30, 100);
					l[30].setLayout(null);
					l[30].setVisible(true);
					p.add(l[30]);
					
					break;
				case 4:
					fourth_band4 = "VIO";
					System.out.println("Band 4: " + fourth_band4);
					
					l[31] = new JLabel("ham",image2[7],JLabel.CENTER);
					l[31].setBounds(345, 300, 30, 100);
					l[31].setLayout(null);
					l[31].setVisible(true);
					p.add(l[31]);
					
					break;
				default:
					System.out.println("you can't add bands");
					break;
				}
				n++;
				p.repaint();
			}

		});
		Initializer.b_gray.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("gray clicked!");
				switch (n) {
				case 1:
					first_band4 = "GRY";
					System.out.println("Band 1: " + first_band4);
					
					l[32] = new JLabel("ham",image[8],JLabel.CENTER);
					l[32].setBounds(180, 300, 30, 100);
					l[32].setLayout(null);
					l[32].setVisible(true);
					p.add(l[32]);
					
					break;
				case 2:
					second_band4 = "GRY";
					System.out.println("Band 2: " + second_band4);
					
					l[33] = new JLabel("ham",image[8],JLabel.CENTER);
					l[33].setBounds(220, 300, 30, 100);
					l[33].setLayout(null);
					l[33].setVisible(true);
					p.add(l[33]);
					
					break;
				case 3:
					third_band4 = "GRY";
					System.out.println("Band 3: " + third_band4);
					
					l[34] = new JLabel("ham",image[8],JLabel.CENTER);
					l[34].setBounds(275, 300, 30, 100);
					l[34].setLayout(null);
					l[34].setVisible(true);
					p.add(l[34]);
					
					break;
				case 4:
					fourth_band4 = "GRY";
					System.out.println("Band 4: " + fourth_band4);
					
					l[35] = new JLabel("ham",image2[8],JLabel.CENTER);
					l[35].setBounds(345, 300, 30, 100);
					l[35].setLayout(null);
					l[35].setVisible(true);
					p.add(l[35]);
					
					break;
				default:
					System.out.println("you can't add bands");
					break;
				}
				n++;
				p.repaint();
			}

		});
		Initializer.b_white.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("white clicked!");
				switch (n) {
				case 1:
					first_band4 = "WHI";
					System.out.println("Band 1: " + first_band4);
					
					l[36] = new JLabel("ham",image[9],JLabel.CENTER);
					l[36].setBounds(180, 300, 30, 100);
					l[36].setLayout(null);
					l[36].setVisible(true);
					p.add(l[36]);
					
					break;
				case 2:
					second_band4 = "WHI";
					System.out.println("Band 2: " + second_band4);
					
					l[37] = new JLabel("ham",image[9],JLabel.CENTER);
					l[37].setBounds(220, 300, 30, 100);
					l[37].setLayout(null);
					l[37].setVisible(true);
					p.add(l[37]);
					
					break;
				case 3:
					third_band4 = "WHI";
					System.out.println("Band 3: " + third_band4);
					
					l[38] = new JLabel("ham",image[9],JLabel.CENTER);
					l[38].setBounds(275, 300, 30, 100);
					l[38].setLayout(null);
					l[38].setVisible(true);
					p.add(l[38]);
					
					break;
				case 4:
					fourth_band4 = "WHI";
					System.out.println("Band 4: " + fourth_band4);
					
					l[39] = new JLabel("ham",image2[9],JLabel.CENTER);
					l[39].setBounds(345, 300, 30, 100);
					l[39].setLayout(null);
					l[39].setVisible(true);
					p.add(l[39]);
					
					break;
				default:
					System.out.println("you can't add bands");
					break;
				}
				n++;
				p.repaint();
			}

		});
		
	}
	public static void getControlButtonAction(final JPanel p,final int type){
		
		Initializer.enter.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("enter clicked!");
				
				if (n >= 4 && type == 4) {
					System.out.println("four");
					Resistor resistor = new Resistor(first_band4, second_band4,
													 third_band4, fourth_band4);
					
					lb = new JLabel();
					lb.setText("value of the resistor: " + Resistor.toString(resistor.getResistance()));
					lb.setBounds(100, 10, 200, 50);
					lb.setLayout(null);
					
					p.add(lb);
					lb.setVisible(true);
					System.out.println("value of the resistor: " + Resistor.toString(resistor.getResistance()));
					p.repaint();
					
				} else if (n >= 5 && type == 5) {
					System.out.println("five");
					Resistor resistor = new Resistor(first_band4, second_band4,
							 third_band4, fourth_band4);

					lb = new JLabel();
					lb.setText("value of the resistor: " + resistor.getResistance());
					lb.setBounds(100, 10, 200, 50);
					lb.setLayout(null);
					
					p.add(lb);
					lb.setVisible(true);
					System.out.println("value of the resistor: " + resistor.getResistance());
					p.repaint();
					
				}else {
					lb2 = new JLabel();
					lb2.setText("Not enough info");
					lb2.setBounds(100, 30, 200, 50);
					lb2.setLayout(null);
					
					p.add(lb2);
					lb2.setVisible(true);
					System.out.println("Not enough info");
					p.repaint();
				}

			}

		});	
		Initializer.reset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("reset clicked!");
				reset();
			}
		});
	}
	
	
	public static void reset(){
		n = 1;
		
		if(lb != null){
			lb.setVisible(false);
		}
		if(lb2 != null){
			lb2.setVisible(false);
		}
		for(int i = 0;i<40;i++){
			if(l[i] !=null){
				l[i].setVisible(false);
			}
		}
	}
	public static void initializeLabel(int number,int numberImg,int x, final ImageIcon[] image,final ImageIcon[] image2, final JPanel p){
		l[number] = new JLabel("ham",image2[numberImg],JLabel.CENTER);
		l[number].setBounds(x, 300, 30, 100);
		l[number].setLayout(null);
		l[number].setVisible(true);
		p.add(l[number]);
	}

	
}
