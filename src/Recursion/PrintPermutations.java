package Recursion;

import java.util.ArrayList;

public class PrintPermutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="abc";
		printPermutations(str,"");
		
	}
	
	public static void printPermutations(String str, String result){
		
		if(str.length()==0)
		{
			System.out.println(result);
			return;
		}	
	
		
            for(int i=0; i<str.length();i++)
			{
            	char cc=str.charAt(i);
            	String ros=str.substring(0,i)+str.substring(i+1);
            	printPermutations(ros,result+cc);
			}
	
	}

}
