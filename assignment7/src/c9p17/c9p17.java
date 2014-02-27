/**
 * 
 */
package c9p17;
/**
* author: Ving Trung
* filename: c9p17.java
* description: chapter 9 project 17
* 		This program filter out all word that are longer than 5.
* last changed: 2/20/2014
 */
import java.util.ArrayList;
import java.util.Scanner;
/**
 * @author svingt
 *
 */
public class c9p17 {

	/**
	 * @param args
	 */
public static ArrayList<Word> collectAll(ArrayList<Word> objects, Filter f){
	return objects;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShortWordFilter filter = new ShortWordFilter();
		ArrayList<Word> WordList = new ArrayList<Word>();
		System.out.println("This program filter out all word that are longer than 5.");
		System.out.println("Enter a sentence: ");
		Scanner in = new Scanner(System.in);
		WordList.add(new Word("Awesome"));
		String input = in.nextLine();
		
		Scanner stringIn = new Scanner(input);
		while(stringIn.hasNext()){
			//System.out.println(stringIn.next());
			WordList.add(new Word(stringIn.next()));
		};
		stringIn.close();
		
		for(Word element: WordList){
				if(filter.accept(element)){
					System.out.println(element.get_word());
		}
		
		//collectAll(WordList, filter);
		
	}
}
}
