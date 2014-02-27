package c10p19;

import javax.swing.JFrame;
import javax.swing.JComponent;
/**
* author: Ving Trung
* filename: houseViewer.java
* description: chapter 10 project 19
* 		This program draws a house in a frame
* last changed: 2/20/2014
 */
public class houseViewer {
	
	
	public static void main(String[] args) {
		JFrame f = new JFrame(); 
		final int WIDTH = 600;
		final int HEIGHT = 600;
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		JComponent d = new houseComponent();
		f.add(d); 
		f.setSize(WIDTH,HEIGHT); // set the size of the window to be 600x600 pixels.
		f.setVisible(true);
	}
		
}
