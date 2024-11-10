package Java8Features;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI____collect_method {

	public static void main(String[] args) {
		
		List list = Arrays.asList("Ramesh", "Rohan", "Sanket", "Ganesh", "Piyush", "Om");

		Stream <String> stream = list.stream();
		
		List<String> newList =  stream.collect(Collectors.toList());
		
		
		
		System.out.println("\nPrinting the list we have in the Stream Api : \n");
		Consumer<String> con = new Consumer<String>()
				{
					public void accept(String str)
					{
						System.out.println(str);
					}
				};
		
				newList.forEach(con);
		
	}

}
