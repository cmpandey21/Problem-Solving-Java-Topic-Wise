package Recursion;

import java.util.ArrayList;

public class PrintMazePathDiagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printMazePathD(0, 0, 2, 2, "");
	}

	public static void printMazePathD(int cr,int cc,int er,int ec,String ans)
	{
	if(cr==er && cc ==ec)
	
	{
		System.out.println(ans);
		return;
	}
	
	if(cr>er || cc>ec)
	{
		ArrayList<String> br=new ArrayList<>();
		return; 
	}
printMazePathD(cr,cc+1,er,ec,ans+"H");
printMazePathD(cr+1,cc,er,ec,ans+"V");
printMazePathD(cr+1,cc+1,er,ec,ans+"D");
	
	}
}
