package myPackage;

public class myFirst {
	
	static int x = 5;
	
	public static int myMethod2(double f){
		System.out.println("Hi! im in myMethod2");
		System.out.println(f);
		return (x*5);
	}
	
	public static void myMethod(int value, int value2){
		System.out.println("Hi! im in myMethod");
		System.out.println(value);
		System.out.println(value2);
		int z = myMethod2(2.013);
		
		if(myMethod2(1.33) > 50){
			System.out.println("myMethod2 is greater than 50");
		} else {
			System.out.println("myMethod2 is less than 50");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(x);
		System.out.println(x+5);
		myMethod(7,4);
	}	//main

}	//myFirst
