package Pattern;

import java.util.Scanner;

/*
 ******
 ******
 ******
 ******
 ******
 ******
 */
public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number");
		int n=in.nextInt();
		for(int row=1;row<=n;row++) //no of rows
		{
			for(int column=1;column<=n;column++)//work to be done in every row
			{
				System.out.print("*");
			}
			System.out.println();// Preparation for the next row
		}
	}

}
