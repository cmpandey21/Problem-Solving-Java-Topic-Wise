/*
*                 *
**               **
***             ***
****           ****
*****         *****
******       ******
*******     *******
********   ********
********* *********
*******************
 */
package Pattern;

import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number");
		int n=in.nextInt();
		int nst=1;
		int nsp=2*n-3;
		for(int row=1; row<=n;row++) //row
		{
		  
			//stars
			for(int cst=1;cst<=nst;cst++)
			{
				System.out.print("*");
			}
			
			//space
			for(int csp=1;csp<=nsp;csp++)
			{
				System.out.print(" ");
			}
			
			int cst=1;
			if(row==n)
			{
				cst=2;
			}
			//stars
			for(;cst<=nst;cst++)
			{
				System.out.print("*");
			}
		
		System.out.println("");
		nst=nst+1;
		nsp=nsp-2;
		
		}
	}

	}

