package Looping_Programs;

import java.util.*;

public class Perfect_Number_1_To_N {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number  :");
		int limit = sc.nextInt() ;
		int num,sum=0,temp;
		for(int i=1;i<limit ;i++)
		{
			num=i;
			temp=num;
			sum=0;
			for(int j=1;j<temp;j++)
			{
				if(temp%j==0)
				{
					sum=sum+j;
				}
			}
			
			
			if(sum==num)
			{
				System.out.println(" "+num);
			}
			
			
		}
	}
}
