package c10p30;
/**
* author: Ving Trung
* filename: barChartViewer.java
* description: chapter 10 project 30
* 		This program creates a bar chart of the lengths of the bridges
* last changed: 2/20/2014
 */
import javax.swing.JComponent;
import javax.swing.JFrame;

public class barChartViewer {

	public static void main(String[] args) {
		JFrame f = new JFrame(); 
		final int WIDTH = 700;
		final int HEIGHT = 400;
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		JComponent d = new barChartComponent();
		f.add(d); 
		f.setSize(WIDTH,HEIGHT); 
		f.setVisible(true);
	}
}
