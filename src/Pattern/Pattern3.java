package Pattern;

import java.util.Scanner;
/*
*****
****
***
**
*
 */
public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number");
		int n=in.nextInt();
		int nst=n;
		for(int rows=1;rows<=n;rows++) //rows
		{
			for(int cst=1;cst<=nst;cst++) //work
			{
				System.out.print("*");
			}
			System.out.println(); // Preparation for next line
			nst--;
		}
	}

}
