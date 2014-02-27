/**
 * 
 */
package assignment6;

/**
* author: Ving Trung
* filename: ComboLock.java
* description: chapter 8 project 9
* 		This program create the ComboLock class
* last changed: 2/9/2014
 */
public class ComboLock {

	/**
	 * @param args
	 */
	private int combo1 = 0;
	private int combo2 = 0;
	private int combo3 = 0;
	//combo1,2,3 store the combination for lock
	private int dialLocation = 0;
	private boolean lastTurnLeft = true; //use to determine which direction the user is turning
	private boolean unlock1 = false;// unlock 1-3 check if user has unlocked all 3 combinations
	private boolean unlock2 = false;
	private boolean unlock3 = false;
	private boolean masterLock = false; //if the user makes a mistake, there is a master lock that turns on
	
	public ComboLock(int secret1, int secret2, int secret3){
		combo1 = secret1;
		combo2 = secret2;
		combo3 = secret3; //set combo1,2,3
	} 	//ComboLock
		//set combo1,2,3
	
	public void reset(){
		dialLocation = 0;
		lastTurnLeft = true;
		unlock1 = false;
		unlock2 = false;
		unlock3 = false;
		masterLock = false;
	}	//reset()
		//reset values to default values
		
	public void turnLeft(int ticks){
		if(!lastTurnLeft){ //if it has changed directions register dialLocation
			lastTurnLeft = true;
			if(dialLocation == combo1){
				unlock1 = true;
			} else {
				masterLock = true;
			}
		}
		
		for(int count = 0; count < ticks; count++){
			dialLocation++;
			if(dialLocation > 39){
				dialLocation = 0;
			}
		}
		
	} 	//turnLeft
		//take in integer 
		//turns dialLocation the amount of time as entered integer
	
	public void turnRight(int ticks){
		if(lastTurnLeft){		//if it has changed directions register dialLocation
			lastTurnLeft = false;
			if(unlock1 && !unlock2){ //check if it is the first or last turn;
				if(dialLocation == combo2){
					unlock2 = true;
				} else {
					masterLock = true;
				}
			}
		}
		
		for(int count = 0; count < ticks; count++){
			dialLocation--;
			if(dialLocation < 0){
				dialLocation = 39;
			}
		}
	} //turnRight
		//turn dialLocation to right 'tick' times
	
	public boolean open(){
		if(dialLocation == combo3){
			unlock3 = true;
		}
		if(unlock1 && unlock2 && unlock3 && !masterLock){
			return true;
		} else {
			return false;
		}
	} //open
		//check if requirements are met to open lock
	
}
