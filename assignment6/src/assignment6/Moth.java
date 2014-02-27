/**
 * 
 */
package assignment6;

/**
* author: Ving Trung
* filename: Moth.java
* description: chapter 8 project 13
* 		This program creates the Moth class to get the move and get the position of a moth.
* last changed: 2/9/2014
 */
public class Moth {

	/**
	 * @param args
	 */
	private double mothPosition= 0;
	
	public Moth(double initialPosition){
		mothPosition = initialPosition;
	} 	//Moth
		//set initial Position for moth;
	
	public void moveToLight(double lightPosition){
		mothPosition += (lightPosition - mothPosition) / 2; //half way between
	}	//moveToLight
		//take in light position
		//update moth position to half way to light position

	public void getPosition(){
		System.out.println("This moth is at " + mothPosition + ".");
	}	//getPosition
		//print the current position of the moth.
}
