package Strings;

import java.util.Scanner;

public class CharacterType {

	public static void main(String[] args) {
	// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		char result=Charactertype(s);

		System.out.println(result);
}
	
	public static char Charactertype(String s)
	{
		char a = 0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				a='L';
			}
			
			else if(s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
				a='U';
			}
			
			else
			{
				a='I';
			}
		}
		return a;
	}
	
}

