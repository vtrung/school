package assignment6;

/*
* author: Ving Trung
* filename: c8p29mainResistor.java
* description: chapter 8 project 29
* 		This program uses a resistor class and call the actual resistance and the color bands
* last changed: 2/9/2014
*/

public class c8p29mainResistor {
	
	public static void main(String[] args) {
		Resistor myResistor = new Resistor(300,0.5);
		System.out.printf("Actual Resistance is %.2f.\n", myResistor.getResistance());
		myResistor.getBands(); //print the resistence band color

	}
}
