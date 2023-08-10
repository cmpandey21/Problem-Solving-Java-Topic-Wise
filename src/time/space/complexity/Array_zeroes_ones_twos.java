package time.space.complexity;
//Sort array of 0s 1s 2s with time complexity O(n) and Space complexity O(1)
public class Array_zeroes_ones_twos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,1,0,2,1,0,2};
		int [] result=sort(arr);
		display(result);

	}

	private static void display(int[] result) {
	
		for(int i=0;i<result.length;i++)
		{
			System.out.println(result[i]);
		}
		
	}

	private static int[] sort(int[] arr) {
		int mid=0, low=0, high=arr.length-1;
		
		while(mid <= high)
		{
			if(arr[mid]==0)
			{
				//swap elements at low and mid index,then increment low and mid
				swap(arr,low,mid);
				low++;
				mid++;
			}
			
			else if(arr[mid]==1)
			{
				//increment mid only
				mid++;
			}
			
			else
			{
				//swap elements at mid and high index,then decrement high
				swap(arr,mid,high);
				high--;
			}
		}
		
		return arr;
	}
	
	
	public static void swap(int[] arr, int i, int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	

}
