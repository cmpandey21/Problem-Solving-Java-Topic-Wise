package time.space.complexity;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
 int [] arr= {20,10,30,50,60,5,80,25};
 
 int [] ans=mergesort(arr,0,arr.length-1);
 
 for(int i:ans)
 {
	 System.out.print(i+ " ");
 }
	}
	
	public static int [] mergeTwoSortedArray(int [] arr1,int [] arr2)
	{
		int [] merged=new int[arr1.length+arr2.length];
		int i=0,j=0,k=0;
		
		while(i< arr1.length && j<arr2.length)
		{
			if(arr1[i]<=arr2[j])
			{
				merged[k]=arr1[i];
				i++;
				k++;
			}
			else
			{
				merged[k]=arr2[j];
				j++;
				k++;
			}
			
			
		}
		
		if(i==arr1.length)
		{
			while(j<arr2.length)
			{
				merged[k]=arr2[j];
				j++;
				k++;
			}
			
		}
		
		if(j==arr2.length)
		{
			while(i<arr1.length)
			{
				merged[k]=arr1[i];
				i++;
				k++;
			}
			
		}
	
		
		
		return merged;
		
	}
	
	public static int [] mergesort(int [] arr,int lo, int hi)
	{
		if(lo==hi)
		{
			int [] br=new int [1];
			br[0]=arr[lo];
			
			return br;
		}
		int mid=(lo+hi)/2;
		int [] fh=mergesort(arr,lo,mid);
		int [] sh=mergesort(arr,mid+1,hi);
		
		int [] merge=mergeTwoSortedArray(fh,sh);
		
		return merge;
	}

}
