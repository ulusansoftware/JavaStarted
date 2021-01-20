package JLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		// JLabel = YAZILAR
		// obj.setBounds(x,y,width(geniþlik),height(yükseklik) )

		JFrame f = new JFrame("Label Örneði");
		JLabel l1 = new JLabel();
		l1.setText("Yazý Kýsmý");
		l1.setBounds(100, 50, 180, 30);

		JButton btn = new JButton("Deðiþtir");
		btn.setBounds(100, 100, 100, 30);
		btn.addActionListener(new ActionListener() {
			int c = 1;

			@Override
			public void actionPerformed(ActionEvent e) {
				l1.setText("Butona " + c++ + " Kez Týklandý!!");

			}
		});

		f.add(btn);
		f.add(l1);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}

}
