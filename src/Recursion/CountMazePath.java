package Recursion;

import java.util.ArrayList;

public class CountMazePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int c=  countMazePath(0,0,2,2);
         System.out.println(c);
	}
	
	public static int countMazePath(int cr, int cc, int er, int ec)
	{
		if(cr==er && cc==ec)
		{
              
              return 1;
		}
		
		if(cr>er || cc>ec)
		{
			return 0;
		}
		
		int count=0;
		count += countMazePath(cr,cc+1, er,ec);
		count += countMazePath(cr+1,cc, er,ec);
	
		return count;
	}

}
