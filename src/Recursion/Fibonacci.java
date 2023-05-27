package Recursion;

import java.util.Scanner;

public class Fibonacci {
	private static Scanner in=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter no:");
		int n = in.nextInt();
	    System.out.println(fibonacci(n));
	}
	
	public static int fibonacci(int n) {

		if(n==0 || n==1) {
			return n;
		}
		
		int fnm1=fibonacci(n-1);
		int fnm2=fibonacci(n-2);
		int fn=fnm1+fnm2;
		return fn;

	}

}
