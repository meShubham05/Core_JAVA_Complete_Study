package Collection_Framework.Vector;

import java.util.*;

public class VectorDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("Enter the size of data you  want to add :");
		size = sc.nextInt();
		
		Vector v = new Vector();
		
		for(int i=0;i<size;i++)
		{
			v.add(sc.nextInt());
		}
		
		
		System.out.println(v);
	}
	
}
