package time.space.complexity;
//Power function in O(log(n))

public class PowerFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(power(3,6));
	}

	private static int power(int x, int n) {
		if(n==0)
		{
			return 1;
		}
		int pnb2=power(x,n/2);
		if(n%2==1)
		{
			return pnb2 *pnb2 *x;
		}
		
		else
		{
			return pnb2 * pnb2;
		}
		
	}
	
	

}
