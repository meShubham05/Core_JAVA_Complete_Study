package Java8Features;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StoreEvenNumberFromCollection {

	public static void main(String[] args) {
		
		List<Integer> li = Arrays.asList(10,23,15,41,63,26,74,12,10);
		Predicate<Integer> check = new Predicate<Integer>()
		{
				public boolean test(Integer t)
				{
					return t%2==0;
				}
		};
			
			Consumer<Integer> con = new Consumer<Integer>()
					{
						public void accept(Integer n)
						{
							
							if(check.test(n))
							{
							
							System.out.println(n);
							}
						}
					};
							
				li.forEach(con);	
}
					
	
}
