// wap to check the given number is strong or not


package Looping_Programs;

import java.util.*;

public class CheckStrongNumber {
	

		public static void main(String x[])
		{
			Scanner sc = new Scanner(System.in);
			
			int num =sc.nextInt(),rem=0,fact=1,sum=0,temp=num;
			
			while(temp!=0) //145
			{
				
				System.out.println("===");
				rem = temp%10;
				fact=1;
				
				for(int i=1;i<=rem;i++)
				{
					fact=fact*i;
					System.out.println("fact ===>"+fact);
				}					
				sum = sum+fact;
				System.out.println("Sum is :"+sum);
				
				temp=temp/10;
			}

			if(sum==num)
			{
				System.out.println("The Number is Strong Number :");
			}
			else
			{
				System.out.println("The Number is not Strong Number :");
			}
		}
	}
			
				
						
