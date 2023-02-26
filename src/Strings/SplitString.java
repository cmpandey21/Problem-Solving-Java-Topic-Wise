package Strings;
import java.util.Scanner;

public class SplitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		String[] s1=s.split("(?=[A-Z])");
		Split(s1);
	}
	
	public static void Split(String s[])
	{
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
	}
}
