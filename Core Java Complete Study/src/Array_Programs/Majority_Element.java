package Array_Programs;

import java.util.*;

public class Majority_Element {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a[]= new int[10];
		
		System.out.println("Enter array element :");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
//		int count=1;
		
//		
//		for(int i=0;i<9;i++)
//		{
//			for(int j=i+1;j<a.length;j++)
//			{
//				if(a[i]==a[j])
//				{
//					count++;
//				}
//				else
//				{
//					System.out.println("count :"+a[i]+" "+count);
//					
//					if(count>a.length/2)
//					{
//						System.out.println("Majority element is :"+a[i]);
//					}
//				}
//			} 
//  	}
			
		int count;
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			 count=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					
					count++;
				}
			}
				
					
					System.out.println("count of :"+a[i]+" "+count);
					
				
				if(count>a.length/2)
				{
					System.out.println("Majority element is : "+a[i]);
					flag=true;
					break;
					
				}
			}
		
		if(!flag)
		{
			System.out.println("No majority element  find :");
		}
		
			
			
		
		
		
	}

}
