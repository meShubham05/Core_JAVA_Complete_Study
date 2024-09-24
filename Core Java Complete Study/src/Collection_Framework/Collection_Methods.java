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
		System.out.println("2: add single data at a time  :");
		System.out.println("3: Add multiple data at a time :");
		System.out.println("4: Display the size of Data :");
		System.out.println("5: Enter the index you want remove :");
		System.out.println("6: Check the data is empty or not :");
		System.out.println("7: Check the specific data is present or not :");
		System.out.println("8: Check mutiple data is present in collection or not :");
		System.out.println("9: Clear all the data :");
		System.out.println("10: exit :");
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
			
			
		case 3 : 
			System.out.println("Enter the size of data you want to add :");
			int size4 = sc.nextInt();
			ArrayList al5 = new ArrayList();
			
			for(int k=0;k<size4;k++)
			{
				int data5 = sc.nextInt();
				al5.add(data5);
			}
			boolean ad = a.addAll(al5);
			
			if(ad)
			{
				System.out.println("Data added Successfully :");
				
			}
			else
			{
				System.out.println("Some problem Occured !!!");
			}
			
			break;
			
			
		case 4:
			
			int size = a.size();
			
			System.out.println("Size of all data is :"+size);
		
			break;
			
		case 5:
			
			System.out.println("Enter the index you want to remove :");
			
			int index=0;
			index = sc.nextInt();
			
			a.remove(index);
			
			System.out.println("Removed data successfully :");
		
			break;
			
		case 6:
			
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
			
		case 7:
			
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
			
			
		case 8 :
			
			System.out.println("Enter the size and multiple data to check it is present in the collection or not :");
			ArrayList al2 = new ArrayList();
			System.out.println("Enter size of data you want to check :");
			
			int size3=sc.nextInt();
			System.out.println("Enter the data "+size3+" times for checking :");
			
			if(size3<=a.size())
			{
				for(int j=0;j<size3;j++)
				{
					int data4 =sc.nextInt();
					al2.add(data4);
				}
						
			}
			
		
			if(a.containsAll(al2))
			{
				System.out.println("All data is Present in the Collection :");
			}
			else
			{
				System.out.println("Data is not present in the collection :");
			}
			
			break;
			
			
		case 9:
			
			a.clear();
			System.out.println("Data cleared successfully :");
			break;
			
		case 10:
			
			sc.close();
			break;
			
		default :
			System.out.println("Invalid choice :");
			
	}
		
	}while(choice!=0);

  }
	
}
