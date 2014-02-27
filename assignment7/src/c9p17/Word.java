package c9p17;
/**
* author: Ving Trung
* filename: Word.java
* description: chapter 9 project 17
* 		This program filter out all word that are longer than 5.
* last changed: 2/20/2014
 */
public class Word implements Filter{

	private String newWord = "";
	
	public Word(){
		newWord = "";
	}
	
	public Word(String aWord){
		newWord = aWord;
	}
	
	public boolean accept(Object x) {
		// TODO Auto-generated method stub
		if(newWord.length() > 5){
			return false;
		} else {
			return true;
		}
	}
	
	public String get_word() {
		// TODO Auto-generated method stub
		return newWord;
	}

	
}
