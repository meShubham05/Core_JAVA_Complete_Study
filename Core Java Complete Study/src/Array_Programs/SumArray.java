package Array_Programs;

import  java.util.*;

public class SumArray {

	public static void main(String[] args) {
		
		int num[] = new int [5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element in array :");
		int sum =0;
		for(int i=0;i<num.length;i++)
		{
			num[i]=sc.nextInt();
			 sum =num[i]+sum;
		}
		System.out.println("Sum is "+sum);
	}
}
