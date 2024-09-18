package Collection_Framework;

import java.util.*;

public class Collection_Methods {

	
	
	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		
	ArrayList a = new ArrayList();
	
	a.add(10);
	a.add(20);
	a.add(30);
	a.add(40);
	a.add(50);
	
	Iterator i=null;
	
	
	int choice ;
	
	do
	{
		System.out.println("\n\n1: Display all Data :");
		System.out.println("2: add new data :");
		System.out.println("3: Display the size of Data :");
		System.out.println("4: Enter the index you want remove :");
		System.out.println("5: Check the data is empty or not :");
		System.out.println("6 : Check the specific data is present or not :");
		System.out.println("7: Clear all the data :");
		
		System.out.println("\n Enter Your choice :");
		
		choice = sc.nextInt();
		
	switch(choice)
	{	
		
		case 1: 
			
			i= a.iterator();
			
			while(i.hasNext())
			{
				System.out.print("["+i.next()+"]");
			}
			
			break;

		case 2:
			
			int data;
			
			System.out.println("Enter the Data :");
			data=sc.nextInt();
			a.add(data);
		
			System.out.println("Data added successfuly :");
			
			break;
			
		case 3:
			
			int size = a.size();
			
			System.out.println("Size of all data is :"+size);
		
			break;
			
		case 4:
			
			System.out.println("Enter the index you want to remove :");
			
			int index=0;
			index = sc.nextInt();
			
			a.remove(index);
			
			System.out.println("Removed data successfully :");
		
			break;
			
		case 5:
			
			boolean check = a.isEmpty();
			
			if(check)
			{
				System.out.println("The data is Empty :");
			}
			else
			{
				System.out.println("The data is  Not empty :");
			}
			
			break;
			
		case 6:
			
			int checkData ;
			
			System.out.println(" Enter the data to Check data is present or not :");
			checkData =sc.nextInt();
			
			boolean check2 =a.contains(checkData);
			
			if(check2)
			{
				System.out.println("Data is present :");
			}
			else
			{
				System.out.println("Data is not present :");
			}
			
			break;
			
			
		case 7:
			
			a.clear();
			System.out.println("Data cleared successfully :");
			
	}
		
	}while(choice!=0);

  }
	
}
