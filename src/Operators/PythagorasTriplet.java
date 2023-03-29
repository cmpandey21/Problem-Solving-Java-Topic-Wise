package Operators;

import java.io.*;
import java.util.Scanner;

public class PythagorasTriplet
{
static void evaluate( int n)
{
    if (n == 1 || n == 2)
        System.out.println(-1);
  
    else if (n % 2 == 0) 
    {
  
        // Calculating for even case
        int var = 1 * n * n / 4;
        System.out.print(var - 1+ " ");
        System.out.println(var + 1 +" ");
    }
  
    else if (n % 2 != 0) 
    {
  
        int var = 1 * n * n + 1;
        System.out.print(var / 2 - 1 + " ");
        System.out.println(var / 2 + " ");
    }
}
  
// Driver Code
public static void main(String[] args) 
{
	Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    evaluate(n);
}
}
  
