import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ChainConsumers {
	public static void main (String... args) {
		
		// Simple string list
		List<String> strings = Arrays.asList("one", "two", "three", "four", "five");
		
		// An empty result list that we are going to fill in
		List<String> result = new ArrayList<>();
		
		// We are creating a Consumer of Strings and it will just print out the String that gets passed to it as a parameter.
		// Remember that Consumer type Takes in an object and doesn't return anything back
		Consumer<String> c1 = s -> System.out.println(s);
		Consumer<String> c2 = System.out::println; // Same as above... but using a method reference instead
		
		strings.forEach(c1);
		strings.forEach(c2);
	}
}
