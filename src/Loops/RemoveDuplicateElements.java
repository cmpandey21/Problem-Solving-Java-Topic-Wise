package Loops;

import java.util.Arrays;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 2, 3, 3, 4, 5, 6, 5 };
		Arrays.sort(array);
		int k = 0;
		int length = 0;
		int n = array.length;
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {

				if (array[i] == array[j]) {
					k++;
				}

			}
			if (k == 1) {
				array[length++] = array[i];

			}
			k = 0;
		}

		for (int i = 0; i < length; i++) {
			System.out.println(array[i]);
		}
	}

}
