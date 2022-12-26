package Loops;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		System.out.println("Enter Number");
		int n = in.nextInt();
		int counter = 1;
		int a = 0;
		int b = 1;
		int sum=0;
		while (counter <= n + 1) {
       System.out.println(a);
		sum=a+b;
        a=b;
        b=sum;
       counter++;
		}
	}

}
