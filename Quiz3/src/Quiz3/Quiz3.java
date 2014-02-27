// author: Ving Trung
// date: 2/4/2014
// assignment: Quiz 3
// class: CIS 016

package Quiz3;

public class Quiz3 {

	public static int MyMethodTwo(int value){
		System.out.println(value);
		return 20;
	}
	
	public static void MyMethodOne(int value){
		System.out.println(value);
		int value2 = MyMethodTwo(10);
		System.out.println(value2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMethodOne(5);
	}

}
