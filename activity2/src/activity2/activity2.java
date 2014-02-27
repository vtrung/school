/**
 * 
 */
package activity2;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 * author: Ving Trung
 * filename: activity2.java
 * description: activity2 
 * 	//read in txt file named: ziptable.txt
 *	//outputs: SystemOut.txt
 *	//correct the format for zip code identifier
 * last changed: Jan 30, 2014
 *
 */
public class activity2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws FileNotFoundException{
	
		File zipFile = new File("ziptable.txt");
		Scanner in = new Scanner(zipFile);
		String fileName = "SystemOut.txt";
		PrintWriter fileOut = new PrintWriter(fileName);
		String nextLine = "";
		String nextWord = "";
		String printLine = "";
		
		while(in.hasNext()){ //print to console and "SystemOut.txt" the corrected zip format in ziptable.txt.
			nextLine = in.nextLine();
			if(nextLine.length() > 0){
			
			Scanner lineScanner = new Scanner(nextLine); //open a new string scanner at each line and close at the end of loop
			// print ziptable to console
			printLine = "";
			while(lineScanner.hasNext()){
				nextWord = lineScanner.next();
				if(nextWord.matches("\\d{3}")){ //if zip match 3 digits. print correct format
					printLine = printLine + nextWord + "-" + nextWord + " ";
					
				} else {
					printLine = printLine + nextWord + " ";
				}
	
			}
			System.out.println(printLine);
			fileOut.println(printLine);
			lineScanner.close(); //close string scanner before next loop.
			}
			
		}
		fileOut.close();
		System.out.print("\n\n" + fileName + " has been created");
	}

}
