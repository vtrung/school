package layoutPackage;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MyCoolJFrame extends JFrame {

	private JPanel MyCoolJPanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyCoolJFrame frame = new MyCoolJFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void TryFlowLayout()
	{
		MyCoolJPanel.setLayout(new FlowLayout());
		// MyCoolJPanel.setLayout(new FlowLayout(FlowLayout.LEFT)); // with an alignment
		// MyCoolJPanel.setLayout(new FlowLayout(FlowLayout.LEFT,24,45)); // with an horizontal and vertical gaps

		JButton mybutn1 = new JButton("First");
		MyCoolJPanel.add(mybutn1);
		
		JButton mybutn2 = new JButton("Second");
		MyCoolJPanel.add(mybutn2);
		
		JButton mybutn3 = new JButton("Third");
		MyCoolJPanel.add(mybutn3);
		
		JButton mybutn4 = new JButton("Fourth");
		MyCoolJPanel.add(mybutn4);
		
	} // TryFlowLayout
	
	public void TryBorderLayout()
	{
		MyCoolJPanel.setLayout(new BorderLayout());
		//MyCoolJPanel.setLayout(new BorderLayout(20,30)); // horizontal and vertical gaps
		
		JButton BtnNorth = new JButton("North");
		MyCoolJPanel.add(BtnNorth,BorderLayout.NORTH);
		
		JButton BtnSouth = new JButton("South");
		MyCoolJPanel.add(BtnSouth,BorderLayout.SOUTH);
		
		JButton BtnEast = new JButton("East");
		MyCoolJPanel.add(BtnEast,BorderLayout.EAST);
		
		JButton BtnWest = new JButton("West");
		MyCoolJPanel.add(BtnWest,BorderLayout.WEST);
		
		JButton BtnCenter = new JButton("Center");
		MyCoolJPanel.add(BtnCenter,BorderLayout.CENTER);
		
		
	} // TryBorderLayout
	
	public void TryCardLayout()
	{
		CardLayout Deck = new CardLayout();
		MyCoolJPanel.setLayout(Deck);
		
		MyCoolJPanel.add(new Button("Ace of Spades"), "Ace");
		MyCoolJPanel.add(new Button("Jack of Diamonds"), "Jack");
		MyCoolJPanel.add(new Button("Queen of Hearts"), "Queen");
		
		Deck.show(MyCoolJPanel, "Jack");
		
		//Deck.last(MyCoolJPanel);
		
	} // TryCardLayout
	
	public void TryGridLayout()
	{
		// if pass in 0 for rows or for columns it means as many as necessary
		// but can't have 0 for both rows AND columns at the same time.
		MyCoolJPanel.setLayout(new GridLayout(2,2)); // rows, columns
		//MyCoolJPanel.setLayout(new GridLayout(2,2,20,20)); // rows, columns, horiz gap, vertical gap
		//MyCoolJPanel.setLayout(new GridLayout(0,1,20,20)); // only one column but as many rows as neede.
		
		JButton mybutn1 = new JButton("First");
		MyCoolJPanel.add(mybutn1);
		
		JButton mybutn2 = new JButton("Second");
		MyCoolJPanel.add(mybutn2);
		
		JButton mybutn3 = new JButton("Third");
		MyCoolJPanel.add(mybutn3);
		
		JButton mybutn4 = new JButton("Fourth");
		MyCoolJPanel.add(mybutn4);
		
	} // TryGridLayout
	
	public void TryGridBagLayout()
	{
		// The GridBagLayout uses the GridBagConstraints object to set it's layout properties.
		// the object must be instantiated and then used to set the constraints and properties of the
		// GridBagLayout and it's components (buttons, lists, etc.)
		// gridx is the column, starts at 0
		// gridy is the row, starts at0
		// gridwidth is the number of cell columns a component consumes
		// gridheight is the number of cell rows a component consumes
		// ipadx is the internal cell padding for width
		// ipady is the internal cell padding for height
		// insets is the external padding for each component
		// weightx is the priority for distributing space among columns, betwee 0.0 and 1.0.
		// weighty is the priority for distributing space among rows, between 0.0 and 1.0.
		// fill determines how to fill a cell if the component is smaller than the cell space.
		// 		Options include:
		//			NONE which is the default.
		//			HORIZONTAL makes the component fill horizontal space
		//			VERTICAL makes the component fill vertical space
		//			BOTH makes the component fill the entire display area
		// anchor where to place the component Values are:
		// 			FIRST_LINE_START	PAGE_START	FIRST_LINE_END
		//			LINE_START			CENTER		LINE_END
		//			LAST_LINE_START		PAGE_END	LAST_LINE_END
		
		MyCoolJPanel.setLayout(new GridBagLayout());
		GridBagConstraints CONSTRAINTS = new GridBagConstraints();
		
		//CONSTRAINTS.fill = GridBagConstraints.HORIZONTAL;
		//CONSTRAINTS.fill = GridBagConstraints.VERTICAL;
		
		CONSTRAINTS.weightx = 0.5;
		CONSTRAINTS.weighty = 1.0;
		
		CONSTRAINTS.insets = new Insets(10,10,10,10);
		
		JButton mybutn1 = new JButton("First");
		MyCoolJPanel.add(mybutn1,CONSTRAINTS); // have to include CONSTRAINTS as you add buttons.
		
		JButton mybutn2 = new JButton("Second");
		MyCoolJPanel.add(mybutn2,CONSTRAINTS);
		
		JButton mybutn3 = new JButton("Third");
		MyCoolJPanel.add(mybutn3,CONSTRAINTS);
		
		JButton mybutn4 = new JButton("Fourth");
		MyCoolJPanel.add(mybutn4,CONSTRAINTS);
		
	} // TryGridBagLayout
	
	/**
	 * Create the frame.
	 */
	public MyCoolJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		MyCoolJPanel = new JPanel();
		MyCoolJPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		MyCoolJPanel.setLayout(new BorderLayout(0, 0));
		setContentPane(MyCoolJPanel);
		
		//TryFlowLayout(); // Show the Flow layout
		
		//TryBorderLayout(); // Show the Border layout which is the default layout.
							// The Center part expands as needed, the sides expand only to cover
							// as much space as is needed.
		
		//TryCardLayout(); // it manages multiple componets that share the same display. Only
						 // displays one item at a time. Must tell it which one to display.
		
		//TryGridLayout(); // columns and rows fo the SAME width and height.
		
		//TryGridBagLayout(); // columns and rows don't have to be the same width and height.
		
	} // MyCoolJFrame constructor method

} // MyCoolJFrame class
