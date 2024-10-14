package Generics;

import java.util.*;
class Data
{
	private int id;
	private String name;
	private float sal;
	
	Data()
	{		
	}
	Data(int id ,String name,float sal)
	{
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	
//	public void setId(int id)
//	{
//		this.id=id;
//	}
	public int getId()
	{
		return id;
	}
	
//	public void setName(String name)
//	{
//		this.name=name;
//	}
	public String getName()
	{
		return name;
	}
//	public void setSal(float sal)
//	{
//		this.sal=sal;
//	}
	public float getSal()
	{
		return sal;
	}	
}


public class Object_Class_Generics_Mul_Data 
{
	public static void main(String[] args) 
	{
		ArrayList <Data> al = new ArrayList<Data>();
		al.add(new Data(1,"Ram",5000));
		al.add(new Data(2,"Shyam",6000));
		al.add(new Data(3,"Sundar",8000));		
		for(Data d:al)
		{
			System.out.println("Data Id :"+d.getId()+"\t Data Name :"+d.getName()+"\t Data Salary :"+d.getSal());
		}		
	}
}
