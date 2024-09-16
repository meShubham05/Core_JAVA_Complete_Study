package Array_Programs;

import java.util.Scanner;

public class Array_Occurence_Element {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a[]= new int[10];
		
		System.out.println("Enter array element :");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp =a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		int count=1;
		
		
		
		for(int i=0;i<a.length-1;i++)
		{
			
				if(a[i]==a[i+1])
				{
					count++;
				}
				else
				{
					System.out.println("count :"+a[i]+" "+count);
					
					if(count>a.length/2)
					{
						System.out.println("majority element is :"+a[i]);
					}
					count=1;
					
				}
		}
			
	}
}
