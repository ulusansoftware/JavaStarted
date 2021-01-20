package JProgressBar;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		// JProgressBar
		// obj.setBounds(x,y,weith,height);

		JFrame f = new JFrame("ProgressBar Örneði");
		JProgressBar jb = new JProgressBar(0, 2000);
		jb.setBounds(40, 40, 160, 30);
		jb.setValue(0);
		jb.setStringPainted(true);

		f.add(jb);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);

		int i = 0;
		while (i <= 2000) {
			jb.setValue(i);
			i += 20;
			try {
				Thread.sleep(150);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
