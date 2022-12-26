package Loops;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
	
		System.out.println("Enter divident");
		int divident=in.nextInt();
		System.out.println("Enter divisor");
		int divisor=in.nextInt();
		int rem;
		while(divident%divisor!=0) {
			rem=divident%divisor;
			divident=divisor;
			divisor=rem;
			
		}
		System.out.println("HCF is : "+ divisor);
	}

}
