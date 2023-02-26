/*
*** ***
**   **
*     *
       
*     *
**   **
*** ***
 */
package Pattern;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number");
		int n=in.nextInt();
		int nst=n/2;
		int nsp=1;
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
			
			
			//stars
			for(int cst=1;cst<=nst;cst++)
			{
				System.out.print("*");
			}
		
			if(row<=n/2) {
				nsp=nsp+2;
				nst=nst-1;
			}
			else {
				nsp=nsp-2;
				nst=nst+1;
			}
		System.out.println("");
		
		
		}
	}

	}

