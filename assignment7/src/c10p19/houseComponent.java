package c10p19;

import java.awt.*;

import javax.swing.JComponent;
/**
* author: Ving Trung
* filename: houseComponent.java
* description: chapter 10 project 19
* 		This program draws a house in a frame
* last changed: 2/20/2014
 */
public class houseComponent extends JComponent{

	public void paintComponent(Graphics g) {
		
		g.drawRect(100,200,300,300);
		g.drawRect(150,250,50,50);
		g.drawRect(300,250,50,50);
		g.drawRect(200,350,100,150);
		int[] x = {100, 250, 400};
		int[] y = {200, 100, 200};
		g.drawPolygon(x,y,3);
		
	}
	
	
}
