package JScrollBar;

import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;

public class Main {

	public static void main(String[] args) {

		JFrame f = new JFrame("ScrollBar Örneði");
		JLabel lbl = new JLabel("Kaydýr");
		lbl.setBounds(100, 50, 300, 30);
		JScrollBar s = new JScrollBar(JScrollBar.VERTICAL, 0, 10, 0, 100);
		s.setMaximum(100);
		s.setMinimum(0);
		s.setBounds(100, 100, 50, 100);
		s.addAdjustmentListener(new AdjustmentListener() {

			@Override
			public void adjustmentValueChanged(AdjustmentEvent e) {
				lbl.setText("Yatay ScrollBar Deðeri :" + (s.getValue() + s.getModel().getExtent()));
			}
		});

		f.add(lbl);
		f.add(s);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}

}
