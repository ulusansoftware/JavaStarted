package Testt;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Test extends JFrame {

	private JPanel contentPane;
	private JTextField metin;
	private JButton gonderbtn;
	private JButton gonderbtn_1;

	/*
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test frame = new Test();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/*
	 * Create the frame.
	 */
	public Test() {
		setTitle("Ulusan Software");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 594, 592);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		metin = new JTextField();
		metin.setToolTipText("Bu bir metin kutusu");
		metin.setFont(new Font("Arial Black", Font.PLAIN, 11));
		metin.setBounds(206, 126, 110, 36);
		contentPane.add(metin);
		metin.setColumns(10);

		JLabel lbl = new JLabel("Yaz\u0131");
		lbl.setFont(new Font("Bodoni MT", Font.PLAIN, 14));
		lbl.setBounds(206, 85, 162, 30);
		contentPane.add(lbl);

		JButton gonderbtn = new JButton("G\\u00F6nder");
		gonderbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbl.setText(metin.getText());
			}
		});

		gonderbtn.setBounds(206, 180, 110, 36);
		contentPane.add(gonderbtn);
	}
}
