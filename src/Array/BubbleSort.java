package Array;

import java.util.Scanner;

public class BubbleSort {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		int arr[] = TakeInput();

		bubbleSort(arr);
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

	public static int[] bubbleSort(int arr[]) {

		for (int i = 0; i < arr.length - 1; i++) {
			{
				for (int j = 0; j < arr.length - 1 - i; j++) {
					if (arr[j] > arr[j + 1]) {
						int temp = 0;

						temp = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = temp;

					}

				}
			}

		}

		return arr;
	}
}
