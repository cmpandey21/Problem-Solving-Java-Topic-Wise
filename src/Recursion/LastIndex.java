package Recursion;
//Find the last index where the element occurs last and return -1 if element is not present
public class LastIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,10,3,4,10,67};
	    System.out.println(lastindex(arr, 0,10));
	}

	private static int count=0;
	public static int lastindex(int [] arr, int si, int data)
	{
		if(si==arr.length)
		{
			return -1;
		}
		
		
		    int index=lastindex(arr,si+1,data);
	        if(index==-1)
	        {
	        	if(arr[si]==data){
	    			return si;
	    		}
	        	else {
	        		return -1;
	        	}
	        	
	        	
	        	}
	        else
        	{
        		return index;
    		}
	        
	        }
			
	}


