package Strings;
import java.util.Scanner;

public class StringReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		String s1="";
		int i=0;
		int j=s.length();
		while(i<j)
		{
			
			int x=i+1;
			while(x<j) {
				if(s.charAt(i)!=s.charAt(x))
				{
					s1=s1+ s.replace(s.charAt(x), s.charAt(i));
					
				}
				else 
				break;
					
			}
			
				s1=s1+s.charAt(i);
		
			
			i=x;
		}
		System.out.print(s1);
	}

}
