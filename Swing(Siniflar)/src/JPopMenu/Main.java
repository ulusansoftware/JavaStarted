package JPopMenu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

public class Main {

	public static void main(String[] args) {
		// JPopMenu
		// obj.setBounds(x,y,width,height);

		JFrame f = new JFrame("PopupMenü Örneði");
		JPopupMenu pm = new JPopupMenu("Menü");

		JMenuItem cut = new JMenuItem("cut");
		JMenuItem copy = new JMenuItem("copy");
		JMenuItem paste = new JMenuItem("paste");

		pm.add(cut);
		pm.add(copy);
		pm.add(paste);

		f.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				pm.show(f, e.getX(), e.getY());
			}
		});
		
		cut.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "Kes Butonuna Týklandý");
			}
		});
		copy.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "Kopyala Butonuna Týklandý");
			}
		});
		paste.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "Yapýþtýr Butonuna Týklandý");
			}
		});
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);

	}

}
