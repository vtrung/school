package c10p30;

import java.awt.Graphics;
import javax.swing.JComponent;
/**
* author: Ving Trung
* filename: barChartComponent.java
* description: chapter 10 project 30
* 		This program creates a bar chart of the lengths of the bridges
* last changed: 2/20/2014
 */
public class barChartComponent extends JComponent {
	
	public void paintComponent(Graphics g) {
		g.drawString("Bridge", 50,50);
		g.drawString("Length", 200,50);
		g.drawString("Golden Gate", 50,110);
		g.fillRect(200, 100 ,4200/10,25);
		g.drawString("Brooklyn", 50,160);
		g.fillRect(200, 150 ,1595/10,25);
		g.drawString("Delaware Memorial", 50,210);
		g.fillRect(200, 200 ,2150/10,25);
		g.drawString("Mackinac", 50,260);
		g.fillRect(200, 250 ,3800/10,25);
		
		
	}
}
