/*  
*
** 
*** 
**** 
***** 
****** 
***** 
**** 
*** 
** 
*
*/
package Pattern;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number");
		int n=in.nextInt();
		int nr=2*n-1;
		int nst=1;
		for (int row = 1; row<=nr;row++)
		{
			for(int cst=1; cst<=nst;cst++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
			if(row<=nr/2)
			{
				nst=nst+1;
			}
			else
			{
				nst=nst-1;
			}
		}
	}

}
