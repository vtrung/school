package myLabelPkg;
/*
* author: Ving Trung
* date: 2/26/14
* assignment: assignment 7 Calculator
* class: CIS 16
*/

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.MatteBorder;
import javax.swing.UIManager;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.EtchedBorder;

public class myCalc extends JFrame {
	private JPanel contentPane;
	private JLabel lblNewLabel = new JLabel("0");
	private double sumNumber = 0;
	private String memory = "";
	private String input = "";
	private boolean dotPress = false;
	private char lastPress = ' ';
	private JLabel memLabel = new JLabel("");
	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					myCalc frame = new myCalc();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void number_button(JButton button, final String button_number){
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(lastPress == '='){ //if equal was last pressed, clear all variables as user is starting new calculation
					clear();
				}
				input += button_number;
				lblNewLabel.setText(input);
			}
		});
	}
	
	public void process_operator(){
		switch(lastPress){
			case '+':
				sumNumber += Double.parseDouble(input);
				break;
			case '-':
				sumNumber += Double.parseDouble(input); 
				break;
			case '*':
				sumNumber = sumNumber * Double.parseDouble(input); 
				break;
			case '/':
				sumNumber = sumNumber / Double.parseDouble(input); 
				break;
			case ' ': //new calculation after clear
				sumNumber += Double.parseDouble(input);
				break;
			default:
		}
		lastPress = ' ';	
	}
	
	public void write_operator(char pressed){
		lastPress = ' ';
		lastPress = pressed;
	}
	
	public void clear(){
		sumNumber = 0;
		input = "";
		lblNewLabel.setText("0");
		lastPress = ' ';
		dotPress = false;
	}
	
	/**
	 * Create the frame.
	 */
	public myCalc() {
		setResizable(false);
		setTitle("Ving's Calculator");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 399, 287);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Calculator Number panel
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(44, 18, 285, 51);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel.setBounds(21, 22, 258, 29);
		panel.add(lblNewLabel);
		memLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		
		memLabel.setBounds(142, 0, 137, 28);
		panel.add(memLabel);
		
		//Number buttons below
		JButton button1 = new JButton("1");
		number_button(button1, "1");
		button1.setBounds(46, 81, 47, 39);
		contentPane.add(button1);
		
		JButton button2 = new JButton("2");
		number_button(button2, "2");
		button2.setBounds(94, 81, 47, 39);
		contentPane.add(button2);
		
		JButton button3 = new JButton("3");
		number_button(button3, "3");
		button3.setBounds(142, 81, 47, 39);
		contentPane.add(button3);
		
		JButton button4 = new JButton("4");
		number_button(button4, "4");
		button4.setBounds(46, 120, 47, 39);
		contentPane.add(button4);
		
		JButton button5 = new JButton("5");
		number_button(button5, "5");
		button5.setBounds(94, 120, 47, 39);
		contentPane.add(button5);
		
		JButton button6 = new JButton("6");
		number_button(button6, "6");
		button6.setBounds(142, 120, 47, 39);
		contentPane.add(button6);
		
		JButton button7 = new JButton("7");
		number_button(button7, "7");
		button7.setBounds(46, 159, 47, 39);
		contentPane.add(button7);
		
		JButton button8 = new JButton("8");
		number_button(button8, "8");
		button8.setBounds(94, 159, 47, 39);
		contentPane.add(button8);
		
		JButton button9 = new JButton("9");
		number_button(button9, "9");
		button9.setBounds(142, 159, 47, 39);
		contentPane.add(button9);
		
		JButton button0 = new JButton("0");
		number_button(button0, "0");
		button0.setBounds(94, 198, 47, 39);
		contentPane.add(button0);
		// End Number Buttons
		
		// Decimal Button
		JButton button_dot = new JButton(".");
		button_dot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!dotPress){
					input += ".";
					lblNewLabel.setText(input);
					dotPress = true;
				}
			}
		});
		button_dot.setBounds(142, 198, 47, 39);
		contentPane.add(button_dot);
		//End Decimal Button
		
		// PLUS Button
		JButton button_plus = new JButton("+"); // plus button
		button_plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(input.length() > 0){ //if there is an input
					process_operator();
				}
				lastPress = '+';
				lblNewLabel.setText(Double.toString(sumNumber) + " + ");
				input = "";
				dotPress = false;
			}
		});
		button_plus.setBounds(201, 198, 61, 39);
		contentPane.add(button_plus);
		// End PLUS button
		
		// MINUS button
		JButton button_minus = new JButton("-"); // minus button
		button_minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(input.length() > 0){ //if there is an input
					process_operator();
				}
				lastPress = '-';
				lblNewLabel.setText(Double.toString(sumNumber) + " - ");
				input = "";
				dotPress = false;
			}
		});
		button_minus.setBounds(201, 159, 61, 39);
		contentPane.add(button_minus);
		// end MINUS button
		
		// divide button
		JButton button_divide = new JButton("/");
		button_divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(input.length() > 0){ //if there is an input
					process_operator();
				}
				lastPress = '/';
				lblNewLabel.setText(Double.toString(sumNumber) + " / ");
				input = "";
				dotPress = false;
			}
		});
		button_divide.setBounds(201, 120, 61, 39);
		contentPane.add(button_divide);
		
		// multiply button
		JButton button_multi = new JButton("*");
		button_multi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(input.length() > 0){ //if there is an input
					process_operator();
				}
				lastPress = '*';
				lblNewLabel.setText(Double.toString(sumNumber) + " * ");
				input = "";
				dotPress = false;
			}
		});
		button_multi.setBounds(201, 81, 61, 39);
		contentPane.add(button_multi);
		
		
		JButton button_equal = new JButton("="); // equal button
		button_equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(input.length() > 0){ //if there is an input
					process_operator();
				}
				lastPress = '=';
				lblNewLabel.setText(Double.toString(sumNumber));
				equalPress = true;
				minusPress = false;
			}
		});
		button_equal.setBounds(274, 151, 55, 86);
		contentPane.add(button_equal);
		
		// CLEAR Button
		JButton button_c = new JButton("C");  // C button
		button_c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clear();
			}
		});
		button_c.setBounds(338, 18, 47, 51);
		contentPane.add(button_c);
		// END CLEAR Button
		
		// MEMORY BUTTONS BELOW //
		
		//ADD to memory
		JButton btnM = new JButton("M+");
		btnM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				memory = lblNewLabel.getText();
				memLabel.setText("M " + memory);
			}
		});
		btnM.setBounds(274, 81, 55, 24);
		contentPane.add(btnM);
		
		//Memory Clear
		JButton btnMc = new JButton("MC");
		btnMc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				memory = "";
				memLabel.setText("");
			}
		});
		btnMc.setBounds(274, 105, 55, 24);
		contentPane.add(btnMc);
		//End Memory Clear
		
		//Memory button
		JButton btnM_1 = new JButton("M");
		btnM_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input = memory;
				lblNewLabel.setText(input);
				equalPress = false;
			}
		});
		btnM_1.setBounds(274, 127, 55, 24);
		contentPane.add(btnM_1);
		
		
		
		
		//End Memory button
		
	}
}
