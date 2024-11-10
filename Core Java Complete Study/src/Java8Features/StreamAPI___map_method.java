package Java8Features;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI___map_method {
public static void main(String[] args) {
	
	List list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	
	
	System.out.println("Before performing the operation List is : \n");
	
	System.out.println(list);
	
	Stream stream = list.stream();
	
	Function<Integer,Integer> fun = new Function<Integer,Integer>()
	{
		public Integer apply(Integer n)
		{
			return n*n*n;
		}
	};
	
	
	
		Stream<Integer> stream1 = stream.map(fun);
		
		List newlist = stream1.collect(Collectors.toList());
		
		Consumer<Integer> con = new Consumer<Integer>()
		{
				public void accept(Integer n)
				{
					System.out.println(n);
				}
				
		};
		
		System.out.println("\n After  performing the operation on Collection List is : \n");
				
		newlist.forEach(con);
		
		
		
		
			
			
			
	
			
	
}
}
