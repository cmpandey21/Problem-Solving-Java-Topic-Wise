package Recursion;

import java.util.Scanner;

public class Factorial {
	
	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter no:");
		int n = in.nextInt();
		

		System.out.println(Fact(n));
	}

	public static int Fact(int n) {

		if(n==1) {
			return 1;
		}
		
		int fnm1=Fact(n-1);
		int fn=n*fnm1;
		return fn;

	}


}
