package Recursion;

import java.util.Scanner;

public class Power {

	private static Scanner in=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter no:");
		int n = in.nextInt();
		System.out.println("Enter power:");
		int p = in.nextInt();
	    System.out.println(power(n,p));
	}

	public static int power(int n, int p) {

		if(p==0) {
			return 1;
		}
		
		int pnm1=power(n,p-1);
		int pn=n*pnm1;
		return pn;

	}

}
