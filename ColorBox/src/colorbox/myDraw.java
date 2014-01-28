// This program shows the basics of how to draw 2D shapes
// author: Ving Trung
// date: 1/22/2014
// assignment: #2 DrawSomething
// class: CIS 016
//
package colorbox;

import java.awt.*;

import javax.swing.JPanel;

public class myDraw extends JPanel{
	
	// The paintComponent method is a special method that gets called automatically for every JPanel.
	// if we want to display something in that JPanel, we just put the drawing commands inside the
	// paintComponent method and they will get drawn for us.
	// The paintComponent method receives a Graphics object as input. We assign it to the variable g
	// we then cast/change the Graphics object to a Graphics2D object. This object extends the Graphics
	// object and can do more things, such as anti-aliasing, which smoothes out the lines and curves
	// which are drawn.
	
	public void drawOrange(int xLoc, int yLoc, double scale, Graphics2D g2){

		int xCenter = (int)(xLoc + (50*scale)/2); //25
		int yCenter = (int)(yLoc + (50*scale)/2); //125
		
		int polyX[] = {xCenter , xCenter, xCenter, xCenter, xCenter, xCenter};//{25,25,30,35,35,27}; //{xCenter ,xCenter, xCenter+5, xCenter+10, xCenter+10,xCenter+2}
		int polyY[] = {yCenter ,yCenter, yCenter, yCenter, yCenter, yCenter};//{100,95,85,85,95,100};//{yCenter - 25,yCenter-30, yCenter -40, yCenter - 40, yCenter - 30, yCenter -25};
		int offsetX[] = {0, 0, 5, 10, 10, 2};
		int offsetY[] = {-25, -30, -40, -40, -30, -25};
		g2.setColor(Color.orange);
		g2.fillOval(xLoc, yLoc, (int)(50*scale), (int)(50*scale));
		g2.setColor(Color.black);
		g2.setStroke(new BasicStroke(1));
		g2.drawOval(xLoc, yLoc, (int)(50*scale), (int)(50*scale));
		
		
		for(int i = 0; i < 6; i++){
			polyX[i] += (int)(offsetX[i] * scale);
			polyY[i] += (int)(offsetY[i] * scale);
		};
		
		g2.setColor(Color.green);
		g2.fillPolygon(polyX, polyY, 6);
		g2.setColor(Color.black);
		g2.drawPolygon(polyX, polyY, 6);
		
	} //drawOrange
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.setBackground(Color.cyan);
		
		Graphics2D g2 = (Graphics2D)g;
	    RenderingHints rh = new RenderingHints(
	             RenderingHints.KEY_ANTIALIASING,
	             RenderingHints.VALUE_ANTIALIAS_ON);
	    
	    g2.setRenderingHints(rh);
		
	
		Font tri = new Font("TimesRoman", Font.ITALIC, 18);
	
		g2.setFont(tri);
		g2.drawString("This is an Orange Tree.",50,50);
	
		
		Color brown = new Color(0x663300);
		g2.setColor(Color.green);
		g2.fillRect(0,500,600,100);
		g2.setColor(Color.black);
		g2.drawRect(0,500,600,100);
		g2.setColor(brown);
		g2.fillRect(275, 400, 50, 100);
		//drawing tree
		g2.setColor(Color.GREEN);
		g2.fillOval(75, 50, 450, 400);
		g2.setColor(Color.black);
		g2.drawOval(75, 50, 450, 400);
		
		
		double randX, randY, randScale;
		
		for(int count = 0; count < 4; count++){
			randX = Math.random()*200 + 75;
			randY = Math.random()*400 + 75;
			randScale = Math.random()*0.5 + 1;
			drawOrange((int)randX, (int)randY, randScale, g2);
		}
		
//		drawOrange(300, 300, 0.5, g2);
//		drawOrange(120, 195, 1.6, g2);
//		drawOrange(350, 178, 1, g2);
//		drawOrange(245, 200, 1.2, g2);
	} // paintComponent
 
} // main
