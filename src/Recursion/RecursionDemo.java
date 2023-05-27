package Recursion;

import java.util.Scanner;

public class RecursionDemo {
private static Scanner in=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=in.nextInt();
        //PrintDecreasing(n);
        PrintIncreasing(n);


	}
	
	public static void PrintDecreasing(int n)
	{
		if(n==0)
		{
			return;
		}
		System.out.print(n);
		PrintDecreasing(n-1);
		
	}
	
	public static void PrintIncreasing(int n)
	{
		
		if(n==0)
		{
			return;
		}
		
		PrintIncreasing(n-1);
		System.out.print(n);
	}
}
