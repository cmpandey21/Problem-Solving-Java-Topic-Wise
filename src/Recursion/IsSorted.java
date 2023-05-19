package Recursion;

import java.util.Scanner;

public class IsSorted {
	private static Scanner in=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     int [] arr= {1,10,3,4,5};
	    System.out.println(isSorted(arr, 0));
	}
	
	public static boolean isSorted(int [] arr, int si) {

		if(si==arr.length-1)
		{
			return true;
		}
	
   if(arr[si]>arr[si+1])
   {
	   return false;
   }
   
   else {
	   boolean result=isSorted(arr,si+1);
	   return result;
   }

	}
}
