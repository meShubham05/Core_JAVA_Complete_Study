package Collection_Framework_List_ArrayList;

import java.util.*;

public class ArrayList_Operation {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no of elements you want to add :");
		int size = sc.nextInt();
		
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter data in Collection :");
			int data = sc.nextInt();
			al.add(data);
		}
		
		
		System.out.println("Enter the index which you want to update in the collection :");
		int index= sc.nextInt();
		System.out.println("Enter the value :");
		int value= sc.nextInt();
		
		boolean isupdate= al.set(index,value) != null;
		
		if(isupdate)
		{
			System.out.println("Updated data successfully :");
		}
		else
		{
			System.out.println("Some problem occured :");
		}
		
		System.out.println("Display after update :");
		for(Object obj :al)
		{
			System.out.println("["+obj+"]");
		}
		
		 
	}
}
