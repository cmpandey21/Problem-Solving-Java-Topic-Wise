package Array;

import java.util.Scanner;

public class SelectionSort {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		int arr[] = TakeInput();

		arr= selectionSort(arr);
		display(arr);
	}

	public static int[] TakeInput() {

		System.out.println("Size of array?");
		int n = in.nextInt();

		int arr[] = new int[n];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the value for " + i + " index");
			arr[i] = in.nextInt();
		}

		return arr;
	}

	public static void display(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		System.out.println();
	}

	public static int[] selectionSort(int arr[]) {

		for (int i = 0; i < arr.length - 1; i++) {
			{
				int min=i;
				for (int j = i+1; j <=arr.length - 1; j++) {
					if (arr[j] < arr[min]) {
						min=j;


					}
					
					int temp = arr[min];
					arr[min] = arr[i];
					arr[i] = temp;

				}
			}

		}

		return arr;
	}
}
