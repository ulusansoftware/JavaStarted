package FlowLayout;
import javax.swing.*;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		// BorderLayout
		JFrame f = new JFrame("Layout");

		JButton jb1 = new JButton("b1");
		JButton jb2 = new JButton("b2");
		JButton jb3 = new JButton("b3");
		JButton jb4 = new JButton("b4");
		JButton jb5 = new JButton("b5");
		JButton jb6 = new JButton("b6");

		JPanel p = new JPanel();
		p.setLayout(new FlowLayout(FlowLayout.CENTER));

		p.add(jb1);
		p.add(jb2);
		p.add(jb3);
		p.add(jb4);
		p.add(jb5);
		p.add(jb6);

		f.add(p);
		f.setSize(400, 400);
		f.setVisible(true);
	}

}
