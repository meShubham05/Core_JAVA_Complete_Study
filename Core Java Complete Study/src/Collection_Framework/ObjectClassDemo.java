package Collection_Framework;

import java.util.*;

public class ObjectClassDemo {

	public static void main(String x[])
	{
		
		Object ob[] = new Object[5];
		
		ob[0]="String";
		ob[1]=1.2f;
		ob[2]=10;
		ob[3]='c';
		ob[4]=false;
	
	for(int i=0;i<ob.length;i++)
	{
		System.out.println(" "+ob[i]);
		
	}
	for(int i=0;i<ob.length;i++)
	{
		System.out.println(ob[i].hashCode());
	}
	
//	" object can store data at runtime using this following program :"
	
	
	Object obj[]= new Object[5];
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Object Data :");
	
	for(int i=0;i<obj.length;i++)
	{
		obj[i]=sc.next();
	}
	
	for(int i=0;i<obj.length;i++)
	{
		System.out.println(obj[i]+" ");
	}
	
	
  }
	
}
