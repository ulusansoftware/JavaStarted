package JList;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.DefaultListSelectionModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;

public class Main {

	public static void main(String[] args) {
		// JComboBox
		// obj.setBounds(x,y,width,height)

		JFrame f = new JFrame("List Örneði");

		DefaultListModel<String> l = new DefaultListModel();
		l.addElement("C++");
		l.addElement("JavaScript");
		l.addElement("Java");
		l.addElement("PHP");

		JList<String> list = new JList(l);
		list.setBounds(100, 100, 75, 75);
		list.setSelectionMode(DefaultListSelectionModel.SINGLE_SELECTION);
		DefaultListModel<String> l2 = new DefaultListModel();
		l2.addElement("Swing");
		l2.addElement("Laravel");
		l2.addElement("VueJs");
		l2.addElement("Bootstrap");

		JList<String> list2 = new JList(l2);
		list2.setBounds(100, 200, 75, 75);

		JButton btn = new JButton("Seçildi");
		btn.setBounds(100, 300, 75, 30);

		btn.addActionListener(new ActionListener() {
			String txt = "";

			@Override
			public void actionPerformed(ActionEvent e) {
				if (list.getSelectedIndex() != -1) {
					txt = "Seçilen Programlama Dili : " + list.getSelectedValue();

				}

				if (list2.getSelectedIndex() != -1) {
					txt += "\nSeçilen FrameWork : ";
					for (Object item : list2.getSelectedValuesList()) {
						txt += item + " , ";
					}

				}
				System.out.print(txt);
			}
		});

		f.add(list);
		f.add(list2);
		f.add(btn);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}

}
