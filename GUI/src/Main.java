import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		// Graphical User Interface (GUI) GRAFÝK KULLANICI ARAYÜZÜ
		// Swing : Sun Microsystems tarafýndan piyasaya sürülen resmi java GUI aracýdýr.

		JFrame frame = new JFrame();
		frame.setSize(200, 200);
		JPanel panel = new JPanel();

		JButton btn = new JButton("Buton");
		panel.add(btn);

		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}
