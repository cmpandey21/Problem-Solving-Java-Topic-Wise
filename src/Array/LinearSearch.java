package Array;

import java.util.Scanner;

public class LinearSearch {

	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = TakeInput();
		System.out.println("Enter element to be searched");
		int item=in.nextInt();
		
		System.out.println("Element is present at index "+linearSearch(arr,item));
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

	public static void display(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] +" ");
		}
		
		System.out.println();	
	}
	
	public static int linearSearch(int arr[], int item)
	{
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==item)
			{
				return i;
			}
		}
		
		return -1;
	}

}
