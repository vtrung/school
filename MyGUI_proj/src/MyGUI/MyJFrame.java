package MyGUI;

/*
 * author: Ving Trung
 * date: 2/11/14
 * assignment: 4 My GUI
 * class: CIS 16
 * 
 */

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyJFrame extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel = new JLabel("New label");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyJFrame frame = new MyJFrame();
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
	public MyJFrame() {
		setTitle("MY GUI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton myButton = new JButton("Cool Button");
		myButton.setBounds(10,40,100,25);
		contentPane.add(myButton);
		
		JTextField myText = new JTextField("New Text");
		myText.setBounds(10,10,100,25);
		contentPane.add(myText);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "RADIOs", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(20, 69, 112, 93);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		ButtonGroup radioButtons = new ButtonGroup();
		
		JRadioButton myRadio = new JRadioButton("Radio 1");
		myRadio.setBounds(6, 22, 100, 25);
		panel_2.add(myRadio);
		radioButtons.add(myRadio);
		
		JRadioButton myRadio2 = new JRadioButton("Radio 2");
		myRadio2.setBounds(6, 41, 100, 25);
		panel_2.add(myRadio2);
		radioButtons.add(myRadio2);
		
		JRadioButton myRadio3 = new JRadioButton("Radio 3");
		myRadio3.setBounds(6, 62, 100, 25);
		panel_2.add(myRadio3);
		radioButtons.add(myRadio3);
		
		
		
		JCheckBox myCheck = new JCheckBox("Check Box");
		myCheck.setBounds(10, 159, 100, 25);
		contentPane.add(myCheck);
		
		JToggleButton myToggle = new JToggleButton("Toggle");
		myToggle.setBounds(10, 186, 100, 25);
		contentPane.add(myToggle);
		
		JSpinner mySpinner = new JSpinner();
		mySpinner.setBounds(10, 211, 150, 25);
		contentPane.add(mySpinner);
		
		JSlider mySlider = new JSlider();
		mySlider.setBounds(100, 20, 150, 25);
		contentPane.add(mySlider);
		
		JScrollBar myScroll = new JScrollBar();
		myScroll.setBounds(435,0,15,278);
		contentPane.add(myScroll);
		
		JButton btnNew = new JButton("NEW");
		btnNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("You have clicked the new button");
				lblNewLabel.setText("New Button!");
			}
		});
		btnNew.setBounds(245, 20, 117, 29);
		contentPane.add(btnNew);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(172, 57, 215, 179);
		contentPane.add(panel);
		
		JTextPane txtpnNewText = new JTextPane();
		txtpnNewText.setText("New Text");
		txtpnNewText.setBounds(20, 237, 90, 16);
		contentPane.add(txtpnNewText);
		
		
		lblNewLabel.setBounds(182, 240, 180, 38);
		contentPane.add(lblNewLabel);
		
		
	}
}
