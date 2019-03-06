import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReductionExample {
	public static void main(String... args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		
		Integer red = 
		list.stream()
			.reduce(0, (i1, i2) -> i1 + i2); // This lambda expression can be reduced to a method call: Integer::sum
			
		Optional<Integer> blue =
		list.stream()
			.reduce(Integer::max);
		
		System.out.println("Red: " + red);
		System.out.println("Blue: " + blue);
	}
}
