 //author: Ving Trung
// date: 1/22/2014
// assignment: #2 DrawSomething
// class: CIS 016

package colorbox;

import javax.swing.*;

public class myMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame("Zareh's cool frame."); // create a window and put some text in title bar. Assign this new JFrame to the variable f.
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // make sure if the user clicks on the top right "x" in the window, the window closes.
		
		myDraw d = new myDraw(); // create a MyDraw object. This line declares and instantiates a MyDraw object and assigns this new object to the variable d.
		
		f.add(d);  // now add this newly created MyDraw object (which we have assigned to the variable d) to the Jframe we created (assigned to the variable f).
		f.setSize(600,600); // set the size of the window to be 600x600 pixels.
		f.setVisible(true); // now make the window visible. The "paintComponent" method that is associated with this JFrame will now automatically be called.
		
	}

}