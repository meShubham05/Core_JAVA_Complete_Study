package Array_Programs;

import java.util.Scanner;

public class Occurence_of_Element {

	public static void main(String[] args) {
		
		int num[] = new int [5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element in array :");
		
		for(int i=0;i<num.length;i++)
		{
			num[i]=sc.nextInt();
			 
		}
		for(int i=0;i<num.length;i++)
		{
			for(int j=i+1;j<num.length;j++)
			{
				if(num[i]>num[j])
				{
					int temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
				
			}
			 
		}
		int count=1;
		for(int i=0;i<num.length-1;i++)
		{
			
				if(num[i]==num[i+1])
				{
					count++;
					
				}
				else
				{
					System.out.println("Occurence of :"+num[i]+"is :"+count);
					count=1;
				}
			}
		}
		
		
	

}
