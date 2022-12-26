package Operators;

import java.util.Scanner;

public class ElseIfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		System.out.println("Please enter your age");
		int age=in.nextInt();
		if(age>=0 && age<=11)
		{
			System.out.println("You are Child");
			
		}
		else if(age>=12 && age<=17)
		{
			System.out.println("You are teeneger");
			
		}
		
		else if(age>=18 && age<=60)
		{
			System.out.println("You are Adult");
		}
		
		else {
			System.out.println("You are old");
		}
		
	}

}
