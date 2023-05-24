package Recursion;

import java.util.ArrayList;

public class GetPermutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="abc";
		ArrayList<String> result=getPermutations(str);
		System.out.println(result);
	}
	
	public static ArrayList<String> getPermutations(String str){
		
		if(str.length()==0)
		{
			ArrayList<String>  br=new ArrayList<>();
			br.add("");
			return br;
		}
		char cc=str.charAt(0);
		String ros=str.substring(1);
		
		ArrayList<String> rr=getPermutations(ros);
		ArrayList<String>  mr=new ArrayList<>();
		
		for(String rrs: rr)
		{
			for(int i=0; i<=rrs.length();i++)
			{
				String val=rrs.substring(0,i)+cc+rrs.substring(i);
				mr.add(val);
			}
		}
		
		return mr;
	}

}
