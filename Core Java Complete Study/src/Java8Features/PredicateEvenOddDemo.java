package Java8Features;

import java.util.*;
import java.util.function.Predicate;

public class PredicateEvenOddDemo {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number to check it is EVEN or ODD :");
	int num = sc.nextInt();
	
//	Predicate<Integer> check = new Predicate<Integer>()
//			{
//
//				
//				public boolean test(Integer t) {
//					
//					return t%2==0;
//				}
//		
//			};
//			
//			boolean result = check.test(num);
//			if(result)
//			{
//				System.out.println("The Number is Even :");
//			}
//			else
//			{
//				System.out.println("The Number is Odd :");
//			}
	
	 
		
	
	
	String s=(((Predicate<Integer>)(t) ->t % 2 == 0).test(100))?"EVEN":"ODD";
	
	System.out.println(s);
	
	
	
}
}
