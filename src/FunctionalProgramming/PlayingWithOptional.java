package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class PlayingWithOptional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> fruits= Arrays.asList("apple","banana","mango");
		
		Predicate<? super String> predicate=fruit-> fruit.startsWith("b");
		Optional<String> optional=fruits.stream().filter(predicate).findFirst();
		System.out.println(optional);
		System.out.println(optional.isPresent());
		System.out.println(optional.get());
		
		Optional<String> fruit=Optional.of("banana");
		Optional<String> empty=Optional.empty();
		
	}

}
