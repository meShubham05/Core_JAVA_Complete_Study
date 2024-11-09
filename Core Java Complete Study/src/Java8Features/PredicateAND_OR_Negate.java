package Java8Features;

import java.util.*;

import java.util.function.Predicate;

public class PredicateAND_OR_Negate {
public static void main(String[] args) {
	
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number to check it comes int the Praticular range or not :");
	int num = sc.nextInt();
	
	
	Predicate<Integer> p1 = new Predicate<Integer>()
			{
					public boolean test(Integer t)
					{
						return num>10;
					}
			};
			
			
			Predicate <Integer >p2  = new Predicate<Integer>() {
				
				public boolean test(Integer t)
				{
					return num<50;
				}
			};
			
			Predicate<Integer> p3 = p1.and(p2);
	
	
				boolean result = p3.test(num);
				
				if(result)
				{
					System.out.println("The Number comes in the Range :");
				}
				else
				{
					System.out.println("The Number not comes in the requiered Range :");
					
					
				}
}
}
