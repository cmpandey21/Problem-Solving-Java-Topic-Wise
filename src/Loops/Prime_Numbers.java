package Loops;

import java.util.Scanner;

/*
 * @Author Mohan Pandey
 */
public class Prime_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		int number, divisor=2;
		boolean flag= true;
		number = in.nextInt();
		while(divisor<=number-1)
		{
			if(number%divisor==0)
			{
				flag=false;
			}
			divisor=divisor+1;
		}
		
		if(flag==true)
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Not Prime");
		}
	}

}

