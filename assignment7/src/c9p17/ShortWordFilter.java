package c9p17;
/**
* author: Ving Trung
* filename: ShortWordFilter.java
* description: chapter 9 project 17
* 		This program filter out all word that are longer than 5.
* last changed: 2/20/2014
 */
public class ShortWordFilter implements Filter {
	
	private int limit = 5;
	
	public ShortWordFilter(){
	}
	
	public ShortWordFilter(Filter Object) {
		accept(Object);
	}
	
	public boolean accept(Object x){
		if (((Word)x).get_word().length() > limit){
			return false;
		} else {
		return true;
		}
	}
}
