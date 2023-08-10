package time.space.complexity;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {20,10,30,50,60,5,80,25};
		 
		 quicksort(arr,0,arr.length-1);
		 
		 for(int i:arr)
		 {
			 System.out.print(i+ " ");
		 }

	}
	
	public static void quicksort(int [] arr, int lo, int hi) 
	{
		if(lo >= hi)
		{
			return;
		}
		
		//Partitioning
		
		int mid=(lo+hi)/2;
		int pivot=arr[mid];
		int left=lo;
		int right=hi;
		
		while(left<=right)
		{
			while(arr[left]< pivot)
			{
				left++;
			}
			
			while(arr[right] > pivot)
			{
				right--;
			}
		
			if(left <= right) {
			int temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			
			left++;
			right--;
			}
		}
		
		//smaller problems
		quicksort(arr, lo, right);
		quicksort(arr, left, hi);
		
		
	}

}
