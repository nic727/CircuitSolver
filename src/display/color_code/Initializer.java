package display.color_code;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Initializer {
	
	public static JButton b_black, b_brown, b_red, b_orange, b_yellow, b_green, b_blue,
						  b_violet, b_gray, b_white;
	public static JButton enter;
	public static JButton reset;
	public static JRadioButton band_4,band_5;
	
	public static BufferedImage bi,bi2,bi3;
	public static Image[] c_bands;
	public static Image[] c_bands2;
	public static Image[] c_bands3;
	
	public static ImageIcon img,img2;
	public static ImageIcon[] bands;
	public static ImageIcon[] bands2;
	public static ImageIcon[] bands3;
	
	public static void initializeButtons() {

		b_black = new JButton();
		b_black.setLayout(null);

		b_black.setBounds(50, 50, 20, 40);
		b_black.setLocation(140, 250);
		b_black.setBackground(Color.BLACK);

		b_brown = new JButton();
		b_brown.setLayout(null);

		b_brown.setBounds(50, 50, 20, 40);
		b_brown.setLocation(160, 250);
		b_brown.setBackground(new Color(102, 51, 0));

		b_red = new JButton();
		b_red.setLayout(null);

		b_red.setBounds(50, 50, 20, 40);
		b_red.setLocation(180, 250);
		b_red.setBackground(Color.RED);

		b_orange = new JButton();
		b_orange.setLayout(null);

		b_orange.setBounds(50, 50, 20, 40);
		b_orange.setLocation(200, 250);
		b_orange.setBackground(new Color(255, 128, 0));

		b_yellow = new JButton();
		b_yellow.setLayout(null);

		b_yellow.setBounds(50, 50, 20, 40);
		b_yellow.setLocation(220, 250);
		b_yellow.setBackground(Color.YELLOW);

		b_green = new JButton();
		b_green.setLayout(null);

		b_green.setBounds(50, 50, 20, 40);
		b_green.setLocation(240, 250);
		b_green.setBackground(Color.GREEN);

		b_blue = new JButton();
		b_blue.setLayout(null);

		b_blue.setBounds(50, 50, 20, 40);
		b_blue.setLocation(260, 250);
		b_blue.setBackground(Color.BLUE);

		b_violet = new JButton();
		b_violet.setLayout(null);

		b_violet.setBounds(50, 50, 20, 40);
		b_violet.setLocation(280, 250);
		b_violet.setBackground(new Color(102, 0, 102));

		b_gray = new JButton();
		b_gray.setLayout(null);

		b_gray.setBounds(50, 50, 20, 40);
		b_gray.setLocation(300, 250);
		b_gray.setBackground(Color.GRAY);

		b_white = new JButton();
		b_white.setLayout(null);

		b_white.setBounds(50, 50, 20, 40);
		b_white.setLocation(320, 250);
		b_white.setBackground(Color.WHITE);

		enter = new JButton();
		enter.setLayout(null);

		enter.setBounds(50, 50, 90, 40);
		enter.setLocation(320, 150);
		enter.setText("Enter");

		reset = new JButton();
		reset.setLayout(null);

		reset.setBounds(50, 50, 90, 40);
		reset.setLocation(220, 150);
		reset.setText("Reset");
		
		
		}
	
	public static void initializeImage() {
	
		c_bands = new Image[10];
		c_bands2 = new Image[10];
		c_bands3 = new Image[10];
		
		bands = new ImageIcon[10];
		bands2 = new ImageIcon[10];
		bands3 = new ImageIcon[10];

		try {
			bi = ImageIO.read(new File("src/display/color_code/images/resistor_band.png"));
			bi2 = ImageIO.read(new File("src/display/color_code/images/resistor_bands2.png"));
			bi3 = ImageIO.read(new File("src/display/color_code/images/resistor_band.png"));
			
			for (int i = 0; i < 10; i++) {
				c_bands[i] = bi.getSubimage(i*23, 0, 23, 61);
				bands[i] = new ImageIcon(c_bands[i]);
				System.out.println("i of b1: "+i*23+"width: "+bi.getWidth());
				
				c_bands2[i] = bi2.getSubimage(i*18, 0, 18, 88);
				bands2[i] = new ImageIcon(c_bands2[i]);
				
				c_bands3[i] = bi3.getSubimage(i*23, 0 ,23 ,61);
				bands3[i] = new ImageIcon(c_bands3[i]);
				System.out.println("i of b3: "+i*20+" width: "+bi3.getWidth()+" x+width: "+i*20+bi3.getWidth());
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
			img = new ImageIcon("src/display/color_code/images/resistor.png");
			img2 = new ImageIcon("src/display/color_code/images/resistor5.png");
		}

	public static void addButtons(JPanel p, JLabel label){
		Initializer.b_black.setVisible(true);
		Initializer.b_brown.setVisible(true);
		Initializer.b_red.setVisible(true);
		Initializer.b_orange.setVisible(true);
		Initializer.b_yellow.setVisible(true);
		Initializer.b_green.setVisible(true);
		Initializer.b_blue.setVisible(true);
		Initializer.b_violet.setVisible(true);
		Initializer.b_gray.setVisible(true);
		Initializer.b_white.setVisible(true);
		Initializer.enter.setVisible(true);
		Initializer.reset.setVisible(true);

		p.add(Initializer.b_black);
		p.add(Initializer.b_brown);
		p.add(Initializer.b_red);
		p.add(Initializer.b_orange);
		p.add(Initializer.b_yellow);
		p.add(Initializer.b_green);
		p.add(Initializer.b_blue);
		p.add(Initializer.b_violet);
		p.add(Initializer.b_gray);
		p.add(Initializer.b_white);
		p.add(label);
		p.add(Initializer.enter);
		p.add(Initializer.reset);
	}
}
