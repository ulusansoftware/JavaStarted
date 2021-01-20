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

		JFrame f = new JFrame("PopupMen� �rne�i");
		JPopupMenu pm = new JPopupMenu("Men�");

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
				JOptionPane.showMessageDialog(f, "Kes Butonuna T�kland�");
			}
		});
		copy.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "Kopyala Butonuna T�kland�");
			}
		});
		paste.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "Yap��t�r Butonuna T�kland�");
			}
		});
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);

	}

}
