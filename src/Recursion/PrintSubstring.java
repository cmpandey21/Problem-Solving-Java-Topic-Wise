package Recursion;

import java.util.ArrayList;

public class PrintSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="abc";
		PrintSS(s,"");
	}

	public static void PrintSS(String str,String result){
		if(str.length()==0)
		{
			System.out.println(result);
			return;
		}
		
		char cc=str.charAt(0);
		String ros=str.substring(1);
		
		PrintSS(ros,result);
		PrintSS(ros,result+cc);
	}
}