package Operators;

/* 
 * @author Mohan Pandey
 */

public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int principle = 1000;
		int rate = 5;
		int time = 2;
		int Simple_Interest;

		Simple_Interest = (principle * rate * time) / 100;
		System.out.println("Simple Interest is: " + Simple_Interest);

	}

}
