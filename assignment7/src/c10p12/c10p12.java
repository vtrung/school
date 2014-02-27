package c10p12;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
* author: Ving Trung
* filename: houseViewer.java
* description: chapter 10 project 12
* 		This program will calculate the
* last changed: 2/20/2014
 */
public class c10p12 extends JFrame {

	private JPanel contentPane;
	private JTextPane textPane = new JTextPane();
	private double balance = 0.00;
	private double interest = 0;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					c10p12 frame = new c10p12();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public c10p12() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		textPane.setBounds(19, 141, 324, 120);
		contentPane.add(textPane);
		
		final JTextArea textArea = new JTextArea();
		textArea.setBounds(138, 15, 231, 21);
		contentPane.add(textArea);
		
		final JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(138, 48, 232, 21);
		contentPane.add(textArea_1);
		
		JButton myButton = new JButton("Calculate");
		myButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				balance = Double.parseDouble(textArea.getText());
				interest = Double.parseDouble(textArea_1.getText());
				double newBalance = balance + (balance * interest);
				textPane.setText("After Year 1 Balance: $" + Double.toString(newBalance));
			}
		});
		myButton.setBounds(16, 86, 117, 29);
		contentPane.add(myButton);
		
		JLabel lblAccountBalance = new JLabel("Account Balance:");
		lblAccountBalance.setBounds(20, 6, 126, 35);
		contentPane.add(lblAccountBalance);
		
		JLabel lblInterestRage = new JLabel("Interest Rate:");
		lblInterestRage.setBounds(19, 48, 104, 16);
		contentPane.add(lblInterestRage);
	}
}
