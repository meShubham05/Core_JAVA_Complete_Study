package Looping_Programs;

import java.util.*;

public class One_to_N_Natural_Number {

	public static void main(String[] args) {
		
		
		int num,i=1;
		System.out.println("Enter the limit for which you want to print the list :");
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		
		while(i<=num)
		{
			System.out.print(i+" ");
			i++;
		}
		
	}

}
