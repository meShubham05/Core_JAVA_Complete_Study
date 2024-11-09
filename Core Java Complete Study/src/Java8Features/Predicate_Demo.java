package Java8Features;

import java.util.*;
import java.util.function.Predicate;
public class Predicate_Demo {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		Predicate<Integer> check = new Predicate<Integer>()
				{
					public boolean test(Integer obj)
					{
						return (obj>10);
					}
				};
				
				
				System.out.println("Enter the number to check Greater than 10");
				int num =sc.nextInt();
				
		boolean result = check.test(num);
		
			if(result)
			{
				System.out.println("The number is greater than 10 :");
			}
			else
			{
				System.out.println("The Number is not greater than 10 :");
			}
	}

}
