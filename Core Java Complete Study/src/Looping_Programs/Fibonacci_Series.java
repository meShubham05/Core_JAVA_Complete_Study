package Looping_Programs;

import java.util.*;

public class Fibonacci_Series {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Limit :");
		int limit = sc.nextInt();
		int a=0,b=1;
		System.out.print(a+" ");
		System.out.print(b+" ");
		for(int i=0;i<limit;i++)
		{
			 int c=a+b;
			 System.out.print(c+" ");
			 a=b;
			 b=c;					
		}
		
		sc.close();
		
	}

}
