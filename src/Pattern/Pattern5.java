package Pattern;
/*
*****
 ****
  ***
   **
    *
 */
import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number");
		int n=in.nextInt();
		int nsp=0,nst=n;
		for(int rows=1;rows<=n;rows++)  //rows
		{
			for(int csp=1;csp<=nsp;csp++) //work for spaces
			{
				System.out.print(" ");
			}
			for(int cst=1;cst<=nst;cst++) //work for stars
			{
				System.out.print("*");
			}
			
			//Preparation for next line
			System.out.println();
			nsp++;
			nst--;
		}
		
	}

	}

