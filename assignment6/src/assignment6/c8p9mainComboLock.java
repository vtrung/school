/**
 * 
 */
package assignment6;

/**
 * author: Ving Trung
 * filename: c8p9ComboLock.java
 * description: chapter 8 project 9
 * 		This program creates a new ComboLock and opens it.
 * last changed: 2/9/2014
 */
public class c8p9mainComboLock {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComboLock Lock = new ComboLock(39,10,39); //create new combo lock with 39,0,39
		Lock.turnRight(1); 
		Lock.turnLeft(1); 
		Lock.turnRight(1);
		if(Lock.open()){
			System.out.print("opened");
		} else {
			System.out.print("Locked");
		}
	}

}
