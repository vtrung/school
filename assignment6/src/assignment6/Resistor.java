/**
 * 
 */
package assignment6;

/**
* author: Ving Trung
* filename: c8p29mainResistor.java
* description: chapter 8 project 29
* 		This program creates the Resistor class
* last changed: 2/9/2014
 */
public class Resistor {

	/**
	 * @param args
	 */
	private double actualResistance = 0;
	private double Resistance = 0;
	private double Tolerance = 0;
	private String bands[] = {"Black","Brown","Red","Orange","Yellow","Green","Blue","Violet","Gray","White","Gold","Silver","None"};
	//list all possible colors
	private String band1 = "";
	private String band2 = "";
	private String band3 = "";
	private String band4 = "";
	
	
	public Resistor(double resistance, double tolerance){
		Resistance = resistance;
		Tolerance = tolerance;
		tolerance = tolerance/100; //convert to decimal for multiplying
		actualResistance = (resistance - (tolerance * resistance)) + (resistance*(Math.random()*(2*tolerance)));
	}	//Resistor
		//set the actualResistance using a random number
		//set Resistance and Tolerance variable
	
	private void setBands(double resistance, double tolerance){
		int MultiplierIndex = 0;
		for(int power = -2; power < 10; power++){
			if((int)(resistance/Math.pow(10, power)) < 10 && (int)(resistance/Math.pow(10, power)) > 0){
				MultiplierIndex = power;
			} //determines the multiplier of the resistance value
		}
		if(MultiplierIndex < 10 && MultiplierIndex > 0){
			band3 = bands[MultiplierIndex];
		}
		//band3 is set
		
		int bandIndex = (int)(resistance/Math.pow(10, MultiplierIndex));
		band1 = bands[bandIndex];
		//band1 is set
		
		bandIndex = (int)(resistance/Math.pow(10, MultiplierIndex-1))%10;
		band2 = bands[bandIndex];
		//band2 is set
		
		int IntegerTolerance = (int)(tolerance * 100);
		switch(IntegerTolerance){
			case 100:
				band4 = bands[1];
				break;
			case 200:
				band4 = bands[2];
				break;
			case 50:
				band4 = bands[5];
				break;
			case 25:
				band4 = bands[6];
				break;
			case 10:
				band4 = bands[7];
				break;
			case 5:
				band4 = bands[8];
				break;
			case 500:
				band4 = bands[10];
				break;
			case 1000:
				band4 = bands[11];
				break;
			case 2000:
				band4 = bands[12];
				break;
			default:
				band4 = bands[12];
		} //band4 is set
	}
	
	
	public double getResistance(){
		return actualResistance;
	}	//getResistance
		//return the actualResistance generated randomly

	public void getBands(){
		setBands(Resistance, Tolerance);
		System.out.println(band1 + ", " + band2 + ", " + band3 + ", " + band4);
	}	//getBands
		//print out the band color of the resister in order
	
	
}
