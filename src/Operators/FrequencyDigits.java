package Operators;

import java.util.Scanner;

public class FrequencyDigits {
	static int frequencyDigits(int n, 
            int d)
{ 
// Counter variable to 
// store the frequency
int c = 0;

// iterate till number
// reduces to zero
while (n > 0) 
{

// check for equality
if (n % 10 == d)
c++;
// reduce the number
n = n / 10;
}
return c;
}

//Driver Code
public static void main(String args[])
{

	Scanner in=new Scanner(System.in);
    int N=in.nextInt();
    int D=in.nextInt();

System.out.println(frequencyDigits(N, D));
}
}


