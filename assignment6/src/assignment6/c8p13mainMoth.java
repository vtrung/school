/**
 * 
 */
package assignment6;

/**
* author: Ving Trung
* filename: c8p13mainMoth.java
* description: chapter 8 project 13
* 		This program uses the Moth class to get the move and get the position of a moth.
* last changed: 2/9/2014
 */
public class c8p13mainMoth {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Moth myMoth = new Moth(1.00);
		myMoth.moveToLight(3.00);  //moves moth halfway towards light
		myMoth.moveToLight(5.00);
		myMoth.getPosition(); //print position of moth
		myMoth.moveToLight(0);
		myMoth.getPosition();
	}

}
