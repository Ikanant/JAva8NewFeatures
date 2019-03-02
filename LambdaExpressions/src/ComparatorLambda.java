import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorLambda {
	public static void main(String...args) {
		List<String> listOfStrings = Arrays.asList("***", "*", "*****", "**");
		
		// Using regular old Anonymous function:
		Comparator<String> comp = new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return Integer.compare(s1.length(), s2.length());
			}
		};
		
		Collections.sort(listOfStrings, comp);
		for (String s: listOfStrings) {
			System.out.println(s);
		}

		// Using regular old Anonymous function:
		listOfStrings = Arrays.asList("***", "*", "*****", "**");
		Comparator<String> compLambda = (String s1, String s2) -> Integer.compare(s2.length(), s1.length()); // Let's build a pyramid why not
		Collections.sort(listOfStrings, compLambda);
		for (String s: listOfStrings) {
			System.out.println(s);
		}
	}
}
