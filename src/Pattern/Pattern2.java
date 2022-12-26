package Pattern;

import java.util.Scanner;
/*
*
**
***
****
*****
 */
public class Pattern2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number");
		int n=in.nextInt();
		int nst=1;
		for(int rows=1;rows<=n;rows++) //rows
		{
			for(int cst=1;cst<=nst;cst++)//work
			{
				System.out.print("*");
			}
			System.out.println();//preparation
			nst++;
		}
	}
}
