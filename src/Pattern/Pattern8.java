package Pattern;
/*
   *
  ***
 *****
*******
 *****
  ***
   *
 */
import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number");
		int n=in.nextInt();
		int nst=1;
		int nsp=n/2;
		for(int row=1; row<=n;row++) //row
		{
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
		if(row<=n/2)
		{
			nsp=nsp-1;
			nst=nst+2;
		}
		else
		{
			nsp=nsp+1;
			nst=nst-2;
		}
		
		System.out.println("");
		
		}
	}

}
