package Strings;

import java.util.Scanner;

public class LowerUpper {

	public static void main(String[] args) {
	// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		String s=in.next();
		String result=Charactertype(s);

		System.out.println(result);
}
	
	public static String Charactertype(String s)
	{
		String a ="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				a="lowercase";
			}
			
			else if(s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
				a="UPPERCASE";
			}
			
			else
			{
				a="Invalid";
			}
		}
		return a;
	}
}
