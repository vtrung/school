import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;

/*
 * author: Ving Trung
 * date: 2/11/14
 * assignment: quiz 4
 * class: CIS 16
 * 
 */

public class quizgui extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					quizgui frame = new quizgui();
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
	public quizgui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCoolButton = new JButton("My Cool Button");
		btnCoolButton.setBounds(21, 36, 122, 29);
		contentPane.add(btnCoolButton);
		
		JCheckBox chckbxMyCoolCheckbox = new JCheckBox("My Cool Check box");
		chckbxMyCoolCheckbox.setBounds(21, 90, 184, 35);
		contentPane.add(chckbxMyCoolCheckbox);
		
		JLabel lblMyCoolJlabel = new JLabel("My New JLabel");
		lblMyCoolJlabel.setBounds(31, 148, 171, 44);
		contentPane.add(lblMyCoolJlabel);
	}
}
