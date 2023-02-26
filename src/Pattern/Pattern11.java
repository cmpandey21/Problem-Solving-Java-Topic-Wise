/*
    1
   222
  33333
 4444444
555555555
 */

package Pattern;

import java.util.Scanner;

public class Pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number");
		int n=in.nextInt();
		int nsp=n-1,nst=1;
		
		for(int rows=1;rows<=n;rows++)  //rows
		{
			int val=rows;
			for(int csp=1;csp<=nsp;csp++) //work for spaces
			{
				System.out.print(" ");
			}
			for(int cst=1;cst<=nst;cst++) //work for stars
			{
				System.out.print(val);
			}
			
			//Preparation for next line
			System.out.println();
			nsp--;
			nst+=2;
			
		
		}
	}

}
