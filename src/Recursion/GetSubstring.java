package Recursion;

import java.util.ArrayList;

/*
input "abc"
output ["","c","b","bc","a","ac","ab","abc"]
 */
public class GetSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="abc";
		System.out.println(getSS(s));
	}
	
	public static ArrayList<String> getSS(String str)
	{
		if(str.length()==0)
		{
		ArrayList<String> baseResult=new ArrayList<>();
		baseResult.add(" ");
		return baseResult;
		}
		
		char cc=str.charAt(0);
		String ros=str.substring(1);
		ArrayList<String> myResult=new ArrayList<String>();
		ArrayList<String> recResult=getSS(ros);
		for(int i=0;i<recResult.size();i++)
		{
			myResult.add(recResult.get(i));
			myResult.add(cc+recResult.get(i));
		}
		
		return myResult;
	}

}
