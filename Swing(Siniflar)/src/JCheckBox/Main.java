package JCheckBox;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {
	public static void main(String[] args) {
		// JCheckBox
		// obj.setBounds(x,y,width,height)

		JFrame f = new JFrame("CheckBox Örneði");
		JLabel lb = new JLabel("Seçim Yapýnýz! ");
		lb.setBounds(100, 50, 300, 50);
		JCheckBox ch1 = new JCheckBox("C++");
		JCheckBox ch2 = new JCheckBox("java");
		ch1.setBounds(100, 100, 250, 50);
		ch2.setBounds(100, 150, 250, 50);

		ch1.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				lb.setText("C++ Seçim Kutusu " + (e.getStateChange() == 1 ? "Seçildi" : "Seçilmedi"));
			}
		});
		ch2.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				lb.setText("Java Seçim Kutusu " + (e.getStateChange() == 1 ? "Seçildi" : "Seçilmedi"));
			}
		});

		f.add(lb);
		f.add(ch1);
		f.add(ch2);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}
}