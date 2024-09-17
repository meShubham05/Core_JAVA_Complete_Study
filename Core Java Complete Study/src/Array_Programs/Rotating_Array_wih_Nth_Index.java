package Array_Programs;

import java.util.Scanner;

public class Rotating_Array_wih_Nth_Index {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a[]= new int[5];
		
		System.out.println("Enter array element :");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter the index from which you want to rotate the array :");
		int index=sc.nextInt();
		
		for(int i=0;i<index;i++)
		{
			int temp=a[0];
			
			for(int j=0;j<a.length-1;j++)
			{
				a[j]=a[j+1];
			}
			
			a[a.length-1]=temp;
					
		}
		
		System.out.println("Final Array is :");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(" "+a[i]);
		}
		
	}

}
