import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class FlatMapExample {
	public static void main(String...args) {
		List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7);
		List<Integer> list2 = Arrays.asList(2,4,6);
		List<Integer> list3 = Arrays.asList(5,6,7);
		
		List<List<Integer>> list = Arrays.asList(list1, list2, list3);
		
		// Function that takes a list of whatever element, and that returns an Integer
		// We are naming this function size
		Function <List<?>, Integer> size = List::size;
		
		//  Let's build a function for a flat map.
		Function <List<Integer>, Stream<Integer>> flatmapper = l -> l.stream();
		
		list.stream()
			.flatMap(flatmapper)
			.forEach(System.out::println);
		
	}
}
