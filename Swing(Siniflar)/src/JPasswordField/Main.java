package JPasswordField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		// JPasswordField
		// obj.SetBounds(x,y,width(geniþlik),height(yükseklik) )

		JFrame f = new JFrame("PasswordField Örneði");
		JLabel l1 = new JLabel("Þifre :");

		l1.setBounds(20, 20, 100, 30);

		JPasswordField pass = new JPasswordField();
		pass.setBounds(20, 50, 100, 30);

		JButton btn = new JButton("GÝRÝÞ");
		btn.setBounds(20, 80, 100, 30);
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String password = new String(pass.getPassword());
				l1.setText(l1.getText() + password);
			}
		});

		f.add(l1);
		f.add(pass);
		f.add(btn);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}

}
