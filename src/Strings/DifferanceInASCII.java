package Strings;

import java.util.Scanner;

public class DifferanceInASCII {
    public static void main(String args[]) {
        // Your Code Here
			Scanner in=new Scanner(System.in);
		String s=in.nextLine();
	//String s1="";
		int r=1,l=0;
		System.out.print(s.charAt(l));
		for (int i=0;i<s.length()-1;i++)
		{
			int x=s.charAt(r)-s.charAt(l);
			System.out.print(x);
			System.out.print(s.charAt(r));
		l=r;
		r=l+1;
			
		}
		
    }
}