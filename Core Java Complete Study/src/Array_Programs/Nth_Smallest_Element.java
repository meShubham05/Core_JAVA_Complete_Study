package Array_Programs;

import java.util.*;

public class Nth_Smallest_Element {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		
		System.out.println("Enter array element :");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("After sorting :");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		int index ;
		
		System.out.println("\n Enter which smallest element you want to find :");
		
		index=sc.nextInt();
		int count=0;
		
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]==a[i+1])
			{ count++;
			}
		}
		
		for(int i=0;i<a.length-count-1;i++)
		{
			if(a[i]==a[i+1])
			{
				a[i+1]=a[i+2];		
			}
		}
		System.out.println("count :"+count);
		
		System.out.println("After removing the duplicate ");
		for(int i=0;i<a.length-count;i++)
		{
			System.out.println(" "+a[i]);
		}
		
		System.out.println(index+"th element is :"+a[index-1]);
	}

}
