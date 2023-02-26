/*
      1
     111
    11111
   1111111
  111111111
 11111111111
1111111111111

 */
package Pattern;

import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number");
		int n=in.nextInt();
		int nsp=n-1,nst=1;
		int val=1;
		for(int rows=1;rows<=n;rows++)  //rows
		{
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
