import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.SystemColor;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField input;
	private JButton btnNewButton;
	private double answer, number;
	int operation;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void addInput(String str) {
		input.setText(input.getText() + str);
	}

	public void calculate() {
		switch (operation) {
		case 1:
			answer = number + Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
		case 2:
			answer = number - Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
		case 3:
			answer = number * Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
		case 4:
			answer = number / Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;

		}
	}

	/**
	 * Create the frame.
	 */
	public Calculator() {
		setType(Type.UTILITY);
		setTitle("                                         Calculator Making");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 504);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setForeground(new Color(255, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel screen = new JPanel();
		screen.setBounds(10, 11, 364, 60);
		contentPane.add(screen);
		screen.setLayout(null);

		input = new JTextField();
		input.setBackground(new Color(240, 255, 240));
		input.setEditable(false);
		input.setHorizontalAlignment(SwingConstants.RIGHT);
		input.setFont(new Font("Georgia", Font.PLAIN, 23));
		input.setBounds(0, 27, 364, 33);
		screen.add(input);
		input.setColumns(10);

		JLabel lbl = new JLabel("");
		lbl.setBackground(new Color(253, 245, 230));
		lbl.setFont(new Font("Tahoma", Font.BOLD, 22));
		lbl.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl.setBounds(0, 0, 364, 27);
		screen.add(lbl);

		JPanel control = new JPanel();
		control.setBackground(new Color(250, 240, 230));
		control.setBounds(10, 82, 364, 368);
		contentPane.add(control);
		control.setLayout(new GridLayout(4, 4, 20, 20));

		JButton btnNewButton = new JButton("7");
		btnNewButton.setForeground(new Color(255, 0, 0));
		btnNewButton.setBackground(UIManager.getColor("menu"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 28));
		control.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("8");
		btnNewButton_1.setForeground(new Color(255, 0, 0));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_1.setFont(new Font("Dialog", Font.BOLD, 28));
		control.add(btnNewButton_1);

		JButton btnNewButton_3 = new JButton("9");
		btnNewButton_3.setForeground(new Color(255, 0, 0));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_3.setFont(new Font("Dialog", Font.BOLD, 28));
		control.add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("+");
		btnNewButton_4.setBackground(Color.WHITE);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				operation = 1;
				input.setText("");
				lbl.setText(number + "+");
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 32));
		control.add(btnNewButton_4);

		JButton btnNewButton_2 = new JButton("4");
		btnNewButton_2.setForeground(new Color(255, 0, 0));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_2.setFont(new Font("Dialog", Font.BOLD, 28));
		control.add(btnNewButton_2);

		JButton btnNewButton_6 = new JButton("5");
		btnNewButton_6.setForeground(new Color(255, 0, 0));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_6.setFont(new Font("Dialog", Font.BOLD, 28));
		control.add(btnNewButton_6);

		JButton btnNewButton_5 = new JButton("6");
		btnNewButton_5.setForeground(new Color(255, 0, 0));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_5.setFont(new Font("Dialog", Font.BOLD, 28));
		control.add(btnNewButton_5);

		JButton btnNewButton_7 = new JButton("-");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				operation = 2;
				input.setText("");
				lbl.setText(number + "-");
			}
		});
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 32));
		control.add(btnNewButton_7);

		JButton btnNewButton_7_1 = new JButton("1");
		btnNewButton_7_1.setForeground(new Color(255, 0, 0));
		btnNewButton_7_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_7_1.setFont(new Font("Dialog", Font.BOLD, 28));
		control.add(btnNewButton_7_1);

		JButton btnNewButton_8 = new JButton("2");
		btnNewButton_8.setForeground(new Color(255, 0, 0));
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_8.setFont(new Font("Dialog", Font.BOLD, 28));
		control.add(btnNewButton_8);

		JButton btnNewButton_7_2 = new JButton("3");
		btnNewButton_7_2.setForeground(new Color(255, 0, 0));
		btnNewButton_7_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_7_2.setFont(new Font("Dialog", Font.BOLD, 28));
		control.add(btnNewButton_7_2);

		JButton btnNewButton_7_3 = new JButton("x");
		btnNewButton_7_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				operation = 3;
				input.setText("");
				lbl.setText(number + "x");
			}
		});
		btnNewButton_7_3.setFont(new Font("Tahoma", Font.BOLD, 32));
		control.add(btnNewButton_7_3);
		
				JButton btnNewButton_7_2_2 = new JButton("C");
				btnNewButton_7_2_2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						input.setText(" ");
					}
				});
				btnNewButton_7_2_2.setFont(new Font("Dialog", Font.BOLD, 28));
				control.add(btnNewButton_7_2_2);
		
				JButton btnNewButton_7_2_1 = new JButton("0");
				btnNewButton_7_2_1.setForeground(new Color(255, 0, 0));
				btnNewButton_7_2_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						addInput(e.getActionCommand());
					}
				});
				btnNewButton_7_2_1.setFont(new Font("Dialog", Font.BOLD, 28));
				control.add(btnNewButton_7_2_1);

		JButton btnNewButton_7_3_1 = new JButton("\u00F7");
		btnNewButton_7_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				operation = 4;
				input.setText("");
				lbl.setText(number + "÷");
			}
		});
		
				JButton btnNewButton_8_1 = new JButton("=");
				btnNewButton_8_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						calculate();
						lbl.setText("");
					}
				});
				btnNewButton_8_1.setFont(new Font("Dialog", Font.BOLD, 28));
				control.add(btnNewButton_8_1);
		btnNewButton_7_3_1.setFont(new Font("Tahoma", Font.BOLD, 32));
		control.add(btnNewButton_7_3_1);
	}
}
