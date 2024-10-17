package Object_Class;

import java.util.*;

class Product
{
	private int pid;
	private String pName;
	
	public Product()
	{
		
	}
	public Product(int pid,String pName)
	{
		this.pid=pid;
		this.pName=pName;
	}
	
	public int getpId()
	{
		return pid;
	}
		
	public String getName()
	{
		return pName;
	}
	
	public boolean equals(Object obj)
	{
		Product p1 = (Product)obj;
		if(this.pid==p1.pid)
		{
			return true;
		}
		else
		{
			return false;
		}
			
	}
	
	public int hashCode()
	{
		return Integer.hashCode(pid);
	}
}


public class LinkedHashSet_Demo 
{
	public static void main(String[] args) 
	{
		LinkedHashSet <Product> set =new LinkedHashSet<Product>();
		
		set.add(new Product(1,"laptop"));
		set.add(new Product(2,"Mobile"));
		set.add(new Product (1,"laptop"));
		set.add(new Product(2,"Mobile"));
		set.add(new Product(3,"Watch"));
		set.add(new Product (4,"Bike"));
		set.add(new Product(4,"Bike"));
		
		
		
		for(Product p:set)
		{
			System.out.println("Product Id :"+p.getpId()+"\t"+"Prodict Name :"+p.getName());
		}
		
	}

}
