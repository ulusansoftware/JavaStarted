package JLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		// JLabel = YAZILAR
		// obj.setBounds(x,y,width(geni�lik),height(y�kseklik) )

		JFrame f = new JFrame("Label �rne�i");
		JLabel l1 = new JLabel();
		l1.setText("Yaz� K�sm�");
		l1.setBounds(100, 50, 180, 30);

		JButton btn = new JButton("De�i�tir");
		btn.setBounds(100, 100, 100, 30);
		btn.addActionListener(new ActionListener() {
			int c = 1;

			@Override
			public void actionPerformed(ActionEvent e) {
				l1.setText("Butona " + c++ + " Kez T�kland�!!");

			}
		});

		f.add(btn);
		f.add(l1);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}

}
