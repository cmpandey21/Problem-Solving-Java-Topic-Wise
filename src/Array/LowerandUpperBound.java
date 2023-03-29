package Array;

import java.util.Scanner;

public class LowerandUpperBound {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = TakeInput();
		System.out.println("Enter element to be searched");
		int item=in.nextInt();
		
		System.out.println("Element  lower bound "+lowerBound(arr,item));
		System.out.println("Element  upper bound "+upperBound(arr,item));
	}
	
	public static int lowerBound(int arr[], int data)
	{
		int low=0, high=arr.length-1;
		int ans=-1;
		
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(data==arr[mid]) {
			ans=mid;
			high=mid-1;
			}
			else if(data<arr[mid])
			{
				high=mid-1;
			}
			else
			{
				low=mid+1;
			}
		}
		
		return ans;
	}
	
	public static int upperBound(int arr[], int data)
	{
		int low=0, high=arr.length-1;
		int ans=-1;
		
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(data==arr[mid]) {
			ans=mid;
			low=mid+1;
			}
			else if(data<arr[mid])
			{
				high=mid-1;
			}
			else
			{
				low=mid+1;
			}
		}
		
		return ans;
	}
	
	public static int[] TakeInput() {

		System.out.println("Size of array?");
		int n = in.nextInt();

		int arr[] = new int[n];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the value for " + i + " index");
			arr[i] = in.nextInt();
		}

		return arr;
	}
	

}
