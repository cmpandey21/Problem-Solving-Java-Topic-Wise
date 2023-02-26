package Strings;
import java.util.Scanner;

/*
  * input = a2b3c1
  * output = aabbbc
  */
public class StringCharint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter String");
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		String s1="";
		for (int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				int x=s.charAt(i)-'0';
				while(x>0)
				{
					s1=s1+s.charAt(i-1);
					x--;
				}
			}
		}
		
		System.out.print(s1);
	}

}
