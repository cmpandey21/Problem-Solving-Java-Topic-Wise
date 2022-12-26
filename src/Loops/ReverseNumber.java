package Loops;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		System.out.println("Enter Number");
		int num = in.nextInt();
		int rem, reverse=0;
		while(num!=0)
		{
			rem=num%10;
			reverse=reverse*10+rem;
			num=num/10;

		}
		System.out.println(reverse);
	}

}
