// This program shows the basics of how to draw 2D shapes
//author: Ving Trung
// date: 1/28/2014
// assignment: #3 DrawSomething
// class: CIS 016

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

		int xCenter = (int)(xLoc + (30*scale)/2); //25
		int yCenter = (int)(yLoc + (30*scale)/2); //125
		
		//Setting Center point for polygon
		int polyX[] = {xCenter , xCenter, xCenter, xCenter, xCenter, xCenter};
		int polyY[] = {yCenter ,yCenter, yCenter, yCenter, yCenter, yCenter};
		//x,y point offset from center point for each corner of polygon
		int offsetX[] = {0, 0, 5, 10, 10, 2};
		int offsetY[] = {-10, -15, -25, -25, -15, -10};
		//set into polyX and polyY
		for(int i = 0; i < 6; i++){
			polyX[i] += (int)(offsetX[i] * scale);
			polyY[i] += (int)(offsetY[i] * scale);
		};
		
		//Draw orange
		g2.setColor(Color.orange);
		g2.fillOval(xLoc, yLoc, (int)(30*scale), (int)(30*scale));
		g2.setColor(Color.black);
		g2.setStroke(new BasicStroke(1));
		g2.drawOval(xLoc, yLoc, (int)(30*scale), (int)(30*scale));
		
		//Draw Polygon (leaf)
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
		//Draw Title
		Font tri = new Font("TimesRoman", Font.ITALIC, 18);
		g2.setFont(tri);
		g2.drawString("This is an Orange Tree.",50,50);
	
		//Draw Grass
		Color brown = new Color(0x663300);
		g2.setColor(Color.green);
		g2.fillRect(0,500,getWidth(),100);
		g2.setColor(Color.black);
		g2.drawRect(0,500,getWidth(),100);
		//Draw Trunk
		g2.setColor(brown);
		g2.fillRect(275, 400, 50, 100);
		//Draw Tree
		g2.setColor(Color.GREEN);
		g2.fillOval(75, 50, 450, 400); // TREE Dimensions
		g2.setColor(Color.black);
		g2.drawOval(75, 50, 450, 400);
		
		
		double randX, randY, randScale;
		
		for(int count = 0; count < 15; count++){
			randX = Math.random()*290 + 130;
			randY = Math.random()*240 + 105;
			randScale = Math.random()*0.6 + 1;
			drawOrange((int)randX, (int)randY, randScale, g2);
		}

	} // paintComponent

} // main
