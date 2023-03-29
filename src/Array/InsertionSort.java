package Array;

import java.util.Scanner;

public class InsertionSort {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		int arr[] = TakeInput();

		insertionSort(arr);
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

	public static void insertionSort(int arr[]) {

		for (int counter = 1; counter <= arr.length - 1; counter++) {
			int val = arr[counter];
			int j = counter - 1;
			while (j >= 0 && arr[j] > val) {

				arr[j + 1] = arr[j];
				j--;

			}
			arr[j + 1] = val;
		}
	}
}
