package Operators;

import java.util.Scanner;

/*
 * @Author Mohan Pandey
 */
public class Even_Odd {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		if (n % 2 == 0) {
			System.out.println(n + " is Even");
		} else {
			System.out.println(n + " is odd");
		}

	}
}