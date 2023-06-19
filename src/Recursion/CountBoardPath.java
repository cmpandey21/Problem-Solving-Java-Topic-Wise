package Recursion;

import java.util.ArrayList;

public class CountBoardPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count =printBoardPath(0,10);
		System.out.println(count);
	}

	public static int printBoardPath(int curr,int end) {
		
		if(curr==end)
		{
			
			return 1;
		}
		
		if(curr>end)
		{
			return 0;
		}
		int count=0;
		for(int dice=1;dice<=6;dice++)
		{
		count +=printBoardPath(curr+dice,end);
		}
		
		return count;
	}
}
