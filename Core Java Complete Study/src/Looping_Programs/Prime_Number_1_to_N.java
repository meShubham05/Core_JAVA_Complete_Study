package Looping_Programs;

import java.util.*;

public class Prime_Number_1_to_N 
{	
	public static void main(String[] args) 
	{		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit to print the Prime Number :");
		int limit =sc.nextInt();
		int num,count=0;
		for(int i=1;i<=limit ;i++) // 100
		{	num=i;
			count=0;
			for(int j=1;j<=num;j++)
			{				
				if(num%j==0)
				{ 
					count++;
				}
			}
				if(count<=2)
				{				
					System.out.println(" "+num);
				}		
		}
	}
}
