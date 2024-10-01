package Looping_Programs;

import java.util.Scanner;

public class Number_Occurence_App {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check it is Occurence or Frequency of each digits  :");
		int num =sc.nextInt(),count=0,rem,temp=0;
		temp=num;
		for(int i=0;i<9;i++)
		{
			num=temp;
			
			count =0;
			
			while(num!=0) 
			{
				rem=num%10;
				
				if(rem==i)
				{
					count++;
				}
				num=num/10;				
			}			
			if(count>=1)
			{
				System.out.println(i+"==>"+count);
			}
		}
		
	
		
			
			
					
	}		
}

