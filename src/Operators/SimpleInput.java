package Operators;

import java.util.ArrayList;
import java.util.Scanner;

public class SimpleInput {

	public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int sum=0,x,i=0;
       int[] arr=new int[9];
      
        while(sc.hasNext())
        {
         x=sc.nextInt();
         arr[i]=x;
         if(sum+arr[i]<0)
                break;
         i++;
        }
        System.out.println();
        for(int j=0;j<i;j++)
        {
            System.out.println(arr[j]);
        }

    }
}
