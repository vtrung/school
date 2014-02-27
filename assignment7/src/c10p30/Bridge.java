package c10p30;
/**
* author: Ving Trung
* filename: Bridge.java
* description: chapter 10 project 30
* 		This program creates a bar chart of the lengths of the bridges
* last changed: 2/20/2014
 */
public class Bridge {
	
	private String bridgeName = "";
	private int bridgeLength = 0;
	
	public Bridge(String name, int length){
		bridgeName = name;
		bridgeLength = length;
	}
	
	public int getLength(){
		return bridgeLength;
	}
	
	public String getName(){
		return bridgeName;
	}
}
