package JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		// JButton
		// btn.setBounds(x,y,width(geni�lik),height(y�kseklik) )
		JFrame f = new JFrame("Buton �rne�i");
		JButton btn = new JButton("BUTON");
		btn.setText("BUTON");
		btn.setBounds(100, 100, 100, 30);

		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Butona T�kland� !!");

			}

		});

		f.add(btn);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);

	}

}
