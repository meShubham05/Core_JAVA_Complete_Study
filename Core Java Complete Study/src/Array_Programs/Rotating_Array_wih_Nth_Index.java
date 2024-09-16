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
		
		for(int i=index;i<a.length;i++)
		{

			System.out.print(a[i]);
			for(int j=0;j<=index;j++)
			{
				a[j]=a[index];
				index++;
			}
		}
		
	}

}
