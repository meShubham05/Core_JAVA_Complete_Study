package Collection_Framework_List_ArrayList;

import java.util.*;

public class Data_Fetching_Using_ArraryList_Demo {
public static void main(String[] args) {
	
	ArrayList al = new ArrayList();
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter the size of data you want to add");
	int size=sc.nextInt();
	for(int i=0;i<size;i++)
	{
		System.out.println("Enter the data in collection :");
		int data =sc.nextInt();
		al.add(data);
	}
	
	//Data fetching using normal for loop:
	int choice ;
	
	Iterator i = al.iterator();
	do
	{
		System.out.println("1 : Data fetching using normal for loop");
		System.out.println("2 : Data Fetching using  Enumeration :");
		System.out.println("3 : Data Fetching using Iterator :");
		System.out.println("Enter your choice for data fetching :");
		choice = sc.nextInt();
		
		switch(choice)
		{
		case 1:
			
			i=al.iterator();
			
			for(int j=0;j<al.size();j++)
			{
				Object obj =al.get(j);
				System.out.println("["+obj+"]");
			}
			
			break;
		case 2:
			
			Vector v = new Vector(al);
			Enumeration e = v.elements();
			System.out.println("Data fetching using Enumeration :");
			while(e.hasMoreElements())
			{
				Object obj = e.nextElement();
				System.out.println(obj);
			}
			
			break;
			
		case 3:
			
			Iterator i2 =al.iterator();
			
			while(i2.hasNext())
			{
				Object obj =i2.next();
				System.out.println(obj);
			}
			break;
			
		case 4:
			ListIterator li = al.listIterator();
			
			while(li.hasPrevious())
			{
				Object obj =li.next();
				System.out.println(obj);
			}
			break;
			
			default:
				System.out.println("Invalid Choice :");
			
		}
		
		
	}while(true);

	
	
}

	
	
	
}
