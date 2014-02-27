/**
 * 
 */
package assignment6;

/**
* author: Ving Trung
* filename: c8p11mainLetter.java
* description: chapter 8 project 11
* 		This program create a new Letter class.
* last changed: 2/9/2014
 */
public class c8p11mainLetter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	Letter myLetter = new Letter("Mary", "John"); //declare (From, To)
	myLetter.addLine("I am sorry we must part."); //add to body of letter
	myLetter.addLine("I wish you all the best.");
	System.out.print(myLetter.getText()); //print out letter

	}

}
