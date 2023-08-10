package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;

public class FP01Structured {

	public static void main(String[] args) {
		
		//printAllNumbersInListsStructured(Arrays.asList(12,31,32,43,55,56,12));
		printAllEvenNumbersInListsStructured(Arrays.asList(12,31,32,43,55,56,12));
	}

	private static void printAllEvenNumbersInListsStructured(List<Integer> numbers) {
	  for(int number:numbers)
	  {
		  if(number%2==0)
		  {
			  System.out.println(number);
		  }
	  }
	}

	private static void printAllNumbersInListsStructured(List<Integer> numbers) {
		
		for(int number:numbers)
		{
			System.out.println(number);
		}
		
	}

}
