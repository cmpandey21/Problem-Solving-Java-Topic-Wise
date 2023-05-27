package Recursion;

import java.util.ArrayList;

public class GetMazePathDiagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(getMazePathD(0,0,2,2));
	}

	public static ArrayList<String> getMazePathD(int cr,int cc,int er,int ec)
	{
	if(cr==er && cc ==ec)
	{
		ArrayList<String> br=new ArrayList<>();	
		br.add("");
		return br;
	}
	
	if(cr>er || cc>ec)
	{
		ArrayList<String> br=new ArrayList<>();
		return br;
	}
		
	ArrayList<String> mr=new ArrayList<>();	
	ArrayList<String> rrr=getMazePathD(cr+1,cc,er,ec);
	for(String rrrh:rrr)
	{
		mr.add("H"+rrrh);
	}
	
	ArrayList<String> rrc=getMazePathD(cr,cc+1,er,ec);
	for(String rrch:rrc)
	{
		mr.add("V"+rrch);
	}
	
	ArrayList<String> rrd=getMazePathD(cr+1,cc+1,er,ec);
	for(String rrcd:rrd)
	{
		mr.add("D"+rrcd);
	}
	return mr;
	}
}
