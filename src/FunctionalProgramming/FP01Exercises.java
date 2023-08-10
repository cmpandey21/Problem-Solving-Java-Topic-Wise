package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;

public class FP01Exercises {

	public static void main(String[] args) {
		
		//printOddNumbersInListsFunctional(Arrays.asList(12,31,32,43,55,56,12));

		List<String> courses=Arrays.asList("AWS", "AZURE", "GCP", "DevOps","Kubernates", "Microservices","Spring","SpringBoot");
		//courses.stream()
		  //     .forEach(System.out::println);
		
/*		courses.stream()
		   .filter(course -> course.contains("Spring"))
	       .forEach(System.out::println);
		*/
		
	/*	courses.stream()
		   .filter(course -> course.length()>=4)
	       .forEach(System.out::println);
		*/
		
		
		
		//printCubesOfOddNumbersInListsFunctional(Arrays.asList(3,31,32,43,55,56));
		
		courses.stream()
		       .map(course -> course + " " + course.length())
		       .forEach(System.out::println);
	}
	
	private static void printOddNumbersInListsFunctional(List<Integer> numbers) {
	
		//Convert numbers into streams
		numbers.stream()
		.filter(number -> number%2!=0)   //Lambda Expression
		.forEach(System.out::println);
		
	}
	
	private static void printCubesOfOddNumbersInListsFunctional(List<Integer> numbers) {
		
		//Convert numbers into streams
		numbers.stream()
		.filter(number -> number%2!=0)   //Lambda Expression
		.map(number -> number * number * number)
		.forEach(System.out::println);
		
	}

}
