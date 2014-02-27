/**
 * 
 */
package assignment6;

/**
* author: Ving Trung
* filename: Letter.java
* description: chapter 8 project 11
* 		This program creates the Letter class for creating letters.
* last changed: 2/9/2014
 */
public class Letter {

	/**
	 * @param args
	 */
	
	private String fromName = "";
	private String toName = "";
	private String textBody = "";

	
	public Letter(String from, String to){
		fromName = from;
		toName = to;
	} 	//Letter
		//set fromName and toName
	
	public void addLine(String line){
		textBody = textBody + line + "\n";
	}	//addLine
		//add entered string as a new line to textBody
	
	
	public String getText(){
		String fullString = "Dear " + toName + ":\n\n";
		fullString += textBody + "\nSincerely, " + "\n\n";
		fullString += fromName;
		return fullString;
	} //getText
		//Build final letter with predefined format

}
