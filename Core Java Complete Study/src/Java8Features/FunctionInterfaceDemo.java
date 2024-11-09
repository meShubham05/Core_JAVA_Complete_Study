package Java8Features;

import java.util.*;
import java.util.function.Function;

public class FunctionInterfaceDemo {
public static void main(String[] args) {
	
	Function<Integer,Integer> fun = new Function<Integer, Integer>()
			{
				public Integer apply(Integer n)
				{
					return n*n*n;
				}
			};
			
			
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the nuber to perform the operation :");
		
		int num = sc.nextInt();
		
		int result = fun.apply(num);
		
		System.out.println("The result is :"+result);
		
	
}
}
