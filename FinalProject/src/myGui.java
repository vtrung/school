import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JTable;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;

import java.awt.Font;
import javax.swing.border.BevelBorder;


public class myGui extends JFrame {

	private JPanel contentPane;
	private DefaultTableModel model = new DefaultTableModel();
	private JTable table = new JTable(model);
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					myGui frame = new myGui();
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
	public myGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 651, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		//table = new JTable();
		table.setBounds(164, 59, 459, 238);
		contentPane.add(table);
		model.addColumn("Col1");
		model.addColumn("Col2");
		
		
		JButton btnNewButton = new JButton("Import");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				model.addRow(new Object[]{"v1", "v2"});
				model.addRow(new Object[]{"new", "row"});
			}
		});
		btnNewButton.setBounds(22, 59, 117, 29);
		contentPane.add(btnNewButton);
		
		JButton btnExport = new JButton("Export");
		btnExport.setBounds(22, 96, 117, 29);
		contentPane.add(btnExport);
		
		JLabel lblMathDepartmentScheduler = new JLabel("Math Department Scheduler");
		lblMathDepartmentScheduler.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lblMathDepartmentScheduler.setBounds(164, 16, 341, 31);
		contentPane.add(lblMathDepartmentScheduler);
	}
}
