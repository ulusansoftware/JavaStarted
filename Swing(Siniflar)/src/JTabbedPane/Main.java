package JTabbedPane;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		// JTabbedPane
		// obj.setBounds(x,y,weith,height);

		JFrame f = new JFrame("JTabbedPane �rne�i");

		JLabel lb1 = new JLabel("�lk Alan");
		JPanel p1 = new JPanel();
		p1.add(lb1);

		JLabel lb2 = new JLabel("�kinci Alan");
		JPanel p2 = new JPanel();
		p2.add(lb2);

		JLabel lb3 = new JLabel("���nc� Alan");
		JPanel p3 = new JPanel();
		p3.add(lb3);

		JTabbedPane tp = new JTabbedPane();
		tp.setBounds(50, 50, 200, 200);
		tp.add("ilk", p1);
		tp.add("�kinci", p2);
		tp.add("���nc�", p3);
		
		
		f.add(tp);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}

}
