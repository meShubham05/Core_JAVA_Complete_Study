package Looping_Programs;

import java.util.*;

public class ArmStrong_1_To_N {

	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit :");
		int limit = sc.nextInt(),count=0,rem=0,sum=0;
		
		System.out.println("\n Amrstrong number are :\n");
		for(int i=1;i<limit;i++)
		{
			int num =i;
			int temp=num;
			sum=0;
			count=0;
				 while(temp!=0)
				 {
					 temp=temp/10;
					 count++;
				 }
				 temp=num;
				 while(temp!=0)
				 {
					 rem=temp%10;
					 
					 sum=sum+ (int)Math.pow(rem,count);
					 temp=temp/10;
				 }
				 
				 if(sum==num)
				 {
					 System.out.println(" "+num);
				 }
			
		}
		
	}
}
