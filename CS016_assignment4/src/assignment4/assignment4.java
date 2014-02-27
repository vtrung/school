/**
 * 
 */
package assignment4;
import java.util.Scanner;
/**
//author: Ving Trung
// date: 1/30/2014
// assignment: #4 If Statements
// class: CIS 016
 */
public class assignment4 {

	/**
	 * @param args
	 */
	
	/*If a person is younger than 10 and weights less than 80 pounds print the following:
This person needs to ride the black roller coaster.

If a person is younger than 10 and weights between 80 and 200 pounds, print the following:
This person needs to ride the green roller coaster.

If a person is younger than 10 and weights 200 or more pounds, print the following:
This person needs to ride the yellow roller coaster.

If a person is younger than 20 but older than 10 and weights less than 80 pounds, print the following:
This person needs to ride the silver roller coaster.

If a person is younger than 20 but older than 10 and weights between 80 and 200 pounds, print
This person needs to ride the red roller coaster.

if a person is younger than 20 but older than 10 and weights 200 or more pounds, print:
This person needs to ride the purple roller coaster.

Everyone else rides the pink roller coaster, print:
This person needs to ride the pink roller coaster.
*/
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int weight, age;
		System.out.print("This program will determine which roller coaster a person needs to ride.\n\n");
		System.out.print("Please enter age: ");
		age = in.nextInt();
		System.out.print("Please enter weight: ");
		weight = in.nextInt();
		in.close();
		
		if(age < 10){
			if(weight < 80){
				System.out.println("This person needs to ride the black roller coaster.");
			} else if(weight >= 80 && weight < 200){
				System.out.println("This person needs to ride the green roller coaster.");
			} else {
				System.out.println("This person needs to ride the yellow roller coaster.");
			}
		} else if(age >= 10 && age < 20){
			if(weight < 80){
				System.out.println("This person needs to ride the silver roller coaster.");
			} else if(weight >= 80 && weight < 200){
				System.out.println("This person needs to ride the red roller coaster.");
			} else {
				System.out.println("This person needs to ride the purple roller coaster.");
			}
		} else {
			System.out.println("This person needs to ride the pink roller coaster.");
		}

		
	}

}
