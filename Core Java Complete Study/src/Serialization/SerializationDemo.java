package Serialization;

import java.io.*;


class Dog implements Serializable
{
	int i=10;
	int j=20;
}

public class SerializationDemo {

	public static void main(String[] args) throws Exception {
	
		Dog d = new Dog();
		
		System.out.println("Serialization started :");
		
		FileOutputStream fos = new FileOutputStream("abc.ser");
		
		ObjectOutputStream  oos = new ObjectOutputStream(fos);
		
		oos.writeObject(d);

		System.out.println("Serialization ends :");
		
		
		System.out.println("Deserialization started :");
		
		FileInputStream fis = new FileInputStream("abc.ser");
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Dog d1 = (Dog)ois.readObject();
		
		System.out.println("Deserialization Ended :");
		
		System.out.println("d1 i :"+d1.i+"  d1 j :"+d1.j);
		
		
	}

}
