package Recursion;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr= {100,5,4,1,8,70};
		int si=0;
		int li=arr.length-1; 
		bubblesort(arr,si,li);
		display(arr);
	}
	
	public static void bubblesort(int [] arr, int si,int li)
	{
		if(li==0)
		{
			return;
		}
		
		if(si==li)
		{
			bubblesort(arr,0,li-1);
			return;
		}
		
		if(arr[si]>arr[si+1])
		{
			int temp=arr[si];
			arr[si]=arr[si+1];
			arr[si+1]=temp;
		}
		
		bubblesort(arr, si+1,li);
		
       	
	}
	
	public static void display(int []arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
}
