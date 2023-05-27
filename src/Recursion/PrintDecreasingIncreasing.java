package Recursion;

import java.util.Scanner;

public class PrintDecreasingIncreasing {
	private static Scanner in=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=in.nextInt();
        PrintDecreasing(n);
        
	}
	
	public static void PrintDecreasing(int n)
	{
		if(n==0)
		{
			return;
		}
		System.out.println(n);
		PrintDecreasing(n-1);
		System.out.println(n);	
	}
}
