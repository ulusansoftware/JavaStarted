import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		// Graphical User Interface (GUI) GRAF�K KULLANICI ARAY�Z�
		// Swing : Sun Microsystems taraf�ndan piyasaya s�r�len resmi java GUI arac�d�r.

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
