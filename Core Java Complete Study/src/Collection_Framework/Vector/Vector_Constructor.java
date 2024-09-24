package Collection_Framework.Vector;

import java.util.*;

public class Vector_Constructor {

	public static void main(String[] args) {
		
		Vector v = new Vector(3);
		int defaultcapacity = v.capacity();
		
		System.out.println("The default capacity of vector is :"+defaultcapacity);
		
		v.add(10);
	
		v.add(20);
		v.add(30);
		v.add(40);
		
		System.out.println(v);
		
		int currentcapacity =v.capacity();
		System.out.println("The current  capacity of vector is :"+currentcapacity);
		
		v.add(10);
		
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(10);
		
		v.add(20);
		v.add(60);
		
		
		System.out.println(v);

		int currentcapacity2 =v.capacity();
		System.out.println("The current  capacity of vector is :"+currentcapacity2);
		
		
		v.add(10);
		
		v.add(20);
		v.add(30);
		v.add(40);
		
		
		System.out.println(v);

		int currentcapacity3 =v.capacity();
		System.out.println("The current  capacity of vector is :"+currentcapacity3);
		
// ***************************** 2nd Constructor : ***************************************************
		
		
		Vector v1 = new Vector(5); //Vector(int initialCapacity);
		int capacityVector=v1.capacity();
		
		System.out.println("i am changing the default capacity using this constructor :");
		System.out.println("Now the current capacity of the vector is :"+capacityVector);
		
//*********************** 3 Constructor : *******************************//
		
		
		Vector v2 = new Vector(2,1) ; // Vector(int initialCapacity ,int incrementCapacity);
		int iCapacity=v2.capacity();
		
		v2.add(20);
		v2.add(50);
		v2.add(90);
		v2.add(100);
		System.out.println("Initial capacity :"+v2.capacity());
		
		System.out.println(v2);
		System.out.println("current capacity :"+v2.capacity());
		
		// **************************** 4 Constuctor : ****************************
		
		
		ArrayList al = new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(30);
		
		Vector v3 = new Vector(al); // Vector(Collection)
		
		System.out.println("After inserting the arraylist in vector:");
		System.out.println(v3);
		
	}
}
