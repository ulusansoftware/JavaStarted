package JComboBox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		// JComboBox
		// obj.setBounds(x,y,width,height)

		JFrame f = new JFrame("Combox Örneði");
		String arr[] = { "C", "C#", "C++", "Java", "Python" };
		JComboBox cb = new JComboBox(arr);
		cb.setBounds(50, 100, 90, 20);
		JButton btn = new JButton("SEÇ");
		btn.setBounds(50, 150, 80, 20);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = "Seçilen Programlama Dili : " + cb.getItemAt(cb.getSelectedIndex());
				System.out.println(text);
			}
		});
		
		
		f.add(cb);
		f.add(btn);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}

}
