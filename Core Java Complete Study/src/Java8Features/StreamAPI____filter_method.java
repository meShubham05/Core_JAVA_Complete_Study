package Java8Features;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI____filter_method {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Ramesh", "Rohan", "Sanket", "Ganesh", "Piyush", "Om");

		System.out.println("Before Checking the Names : ");

		System.out.println(list);

		Stream<String> stream = list.stream();

		Predicate<String> predicate = new Predicate<String>() {
			public boolean test(String str) {
				return str.endsWith("sh");
			}

		};

		Stream<String> stream1 = stream.filter(predicate);

		List<String> newlist = stream1.collect(Collectors.toList());

		Consumer<String> con = new Consumer<String>() {
			public void accept(String str) {
				System.out.println(str);
			}
		};

		System.out.println("\n\nAfter Checking the Name that ends with " + "sh \n");

		newlist.forEach(con);

	}

}
