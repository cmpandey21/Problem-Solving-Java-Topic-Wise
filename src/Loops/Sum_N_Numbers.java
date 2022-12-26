package Loops;
/*
 * Author Mohan pandey
 */

import java.util.Scanner;

//Sum of first N natural numbers

public class Sum_N_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		int n,sum=0;
		System.out.println("Enter number");
		n = in.nextInt();
        int counter=1;
        while(counter<=n)
        {
        	sum=sum+counter;
        	counter=counter+1;
        }
        System.out.println(sum);
        
	}

}
