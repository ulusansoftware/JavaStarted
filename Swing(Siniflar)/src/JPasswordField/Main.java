package JPasswordField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		// JPasswordField
		// obj.SetBounds(x,y,width(geni�lik),height(y�kseklik) )

		JFrame f = new JFrame("PasswordField �rne�i");
		JLabel l1 = new JLabel("�ifre :");

		l1.setBounds(20, 20, 100, 30);

		JPasswordField pass = new JPasswordField();
		pass.setBounds(20, 50, 100, 30);

		JButton btn = new JButton("G�R��");
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
