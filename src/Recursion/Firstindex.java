//Find the first index where the element occurs first and return -1 if element is not present
package Recursion;

public class Firstindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr= {1,10,3,4,5,67};
	    System.out.println(firstindex(arr, 0,10));
	}

	public static int firstindex(int [] arr, int si, int data)
	{
		if(si==arr.length)
		{
			return -1;
		}
		
		if(arr[si]==data){
			return si;
			}
		
		else
		{
			int result=firstindex(arr,si+1,data);
			return result;
		}
	}
}
