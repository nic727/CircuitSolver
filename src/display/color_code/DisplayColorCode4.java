package display.color_code;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class DisplayColorCode4 {

	public static JPanel p;

	public static int x = 0;
	public static int y = 0;
	public static JLabel label;

	public static void colorCode() {

		final JFrame f = new JFrame();
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p = new JPanel();
		Initializer.initializeButtons();
		Initializer.initializeImage();
		
		label = new JLabel("", Initializer.img, JLabel.CENTER);

		label.setBounds(50, 50, 500, 100);
		label.setLocation(0, 300);

		label.setLayout(null);
		label.setVisible(true);

		JDialog d = new JDialog(f, "Hello", true);
		d.addWindowListener(new WindowActionHandler());
		d.setLocationRelativeTo(f);
		d.setSize(500, 500);
		d.setLayout(null);

		p.setLayout(null);
		ButtonActionHandler.getColorButtonAction(p, Initializer.bands,Initializer.bands2);
		ButtonActionHandler.getControlButtonAction(p,4);
		
		f.addWindowListener(new WindowActionHandler());;
		d.setContentPane(p);

		Initializer.addButtons(p, label);

		d.setVisible(true);

	}

	}
