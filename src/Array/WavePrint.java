package Array;

import java.util.Scanner;

public class WavePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in=new Scanner(System.in);
		//int[][] arr = { { 11, 12, 13, 14 }, { 21, 22, 23, 24 }, { 31, 32, 33, 34 }, { 41, 42, 43, 44 } };
		int row=in.nextInt();
		int col=in.nextInt();
		int[][] arr=new int[row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				arr[i][j]=in.nextInt();
			}
		}
		//wavePrintRowWise(arr);
		wavePrintColumnWise(arr,row,col);

	}

	public static void wavePrintColumnWise(int arr[][],int m,int n) {
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < m; j++) {
					System.out.print(arr[j][i] +","+ " ");
				}
			}

			else {
				for (int j = m - 1; j >= 0; j--) {
					System.out.print(arr[j][i] +","+ " ");
				}
			}

		}
		System.out.print("END");

	}
	
	public static void wavePrintRowWise(int arr[][])
	{
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j] + " ");
				}
			}

			else {
				for (int j = arr[i].length - 1; j >= 0; j--) {
					System.out.print(arr[i][j] + " ");
				}
			}

		}
		System.out.print("END");
	}
}
