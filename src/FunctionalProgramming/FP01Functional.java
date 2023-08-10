package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;

public class FP01Functional {

	public static void main(String[] args) {
		
		//printAllNumbersInListsFunctional(Arrays.asList(12,31,32,43,55,56,12));
		printSquaresEvenNumbersInListsFunctional(Arrays.asList(12,31,32,43,55,56,12));
	}

	/*
	private static void print(int number)
	{
	System.out.println(number);	
	}*/
	
	//private static boolean isEven(int number)
	//{
	 //return number%2==0;	
	//}
	
	private static void printAllNumbersInListsFunctional(List<Integer> numbers) {
	
		//Convert numbers into streams
		numbers.stream()
		//.forEach(FP01Functional::print); //method reference
		//.filter(FP01Functional::isEven) //Filter - Allow only even numbers
		.filter(number -> number%2==0)   //Lambda Expression
		.forEach(System.out::println);
		
	}
	
	private static void printSquaresEvenNumbersInListsFunctional(List<Integer> numbers) {
	
numbers.stream()
		.filter(number -> number%2==0)   //Lambda Expression
		//mapping x-> x * x 
		.map(number -> number*number)
		.forEach(System.out::println);
		
	}

}
