package Recursion;

import java.util.Scanner;

public class PDISKIP {

	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter no:");
		int n = in.nextInt();
		PrintPDISKIP(n);

	}

	public static void PrintPDISKIP(int n) {

		if (n == 0) {
			return;
		}

		if (n % 2 == 1) {
			System.out.println(n);
		}

		PrintPDISKIP(n - 1);

		if (n % 2 == 0) {
			System.out.println(n);
		}

	}

}
