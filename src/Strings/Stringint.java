package Strings;
import java.util.Scanner;

/*
  * input = aabbbc
  * output = a2b3c1
  */
public class Stringint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter String");
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		String s1="";
		int i=0;
		int j=s.length();
		for (i=0;i<j;)
		{
			int count=1;
			int x=i+1;
			while(x<j)

		{
				if(s.charAt(i)==s.charAt(x))
				{
					count++;
					x++;
				}
				else
					break;
		}
			if(count==1)
			{
				s1=s1+s.charAt(i);
			}
			else
			{
			s1=s1+s.charAt(i)+count;
			}
			i=x;
		}
		
		System.out.print(s1);
	}

}
