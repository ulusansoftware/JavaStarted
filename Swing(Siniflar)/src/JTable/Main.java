package JTable;

import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Main {

	public static void main(String[] args) {
		// JTable
		// obj.setBounds(x,y,width,height)

		JFrame f = new JFrame("Table �rne�i");
		String[][] veri = { { "1", "Matematik", "85" }, { "2", "Fen Bilgisi", "50" }, { "3", "T�rk�e", "100" } };
		String[] baslik = { "ID", "DERS", "NOT" };
		JTable jt = new JTable(veri, baslik);
		jt.setBounds(30, 40, 200, 300);

		JScrollPane sp = new JScrollPane(jt);

		f.add(sp);
		f.setSize(400, 400);
		f.setVisible(true);
	}

}
