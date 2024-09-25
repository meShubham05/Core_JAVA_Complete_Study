package Looping_Programs;

import java.util.*;

public class InsertElementIntoArray {
public static void main(String[] args) {
	
	int a[]= new int[6];
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter element in array :");
	for(int i=0;i<a.length-1;i++)
	{
		a[i]=sc.nextInt();
	}
	
	System.out.println("Enter the index where you want to add element :");
	int index = sc.nextInt();
	
	System.out.println("Enter the Value :");
	int value =sc.nextInt();
	
	a[index]=value;
	
	for(int i=a.length-2;i>index;i--)
	{
		
		a[i+1]=a[i];
		
	}
	System.out.println("After shifting :");
	
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
}
}
