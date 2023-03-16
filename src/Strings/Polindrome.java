package Strings;

import java.util.Scanner;

/*
 * A string is said to be palindrome if reverse of the string is same as string. 
 * For example, “abba” is palindrome as it's reverse is "abba", 
 * but “abbc” is not palindrome as it's reverse is "cbba".
 */
public class Polindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		
		boolean Result=isPolindrome(s);

		System.out.println(Result);
	}
	
	public static boolean isPolindrome(String s)
	{
		String s1="";
		for(int i=s.length()-1;i>=0;i--)
		{
			s1=s1+s.charAt(i);
		}
		
		if(s.equals(s1))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}

}
