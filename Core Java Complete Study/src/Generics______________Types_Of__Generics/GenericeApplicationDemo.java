package Generics______________Types_Of__Generics;


import java.util.*;
class Student
{
	private int rollno;
	private String name;
	private int marks;
	
	
	public Student()
	{
		
	}
	
	public Student(int rollno,String name,int marks)
	{
		this.rollno=rollno;
		this.name=name;
		this.marks=marks;
	}
	
	public int getRollno()
	{
		return rollno;
	}
	public String getName()
	{
		return name;
	}
	public int getMarks()
	{
		return marks;
	}
	
	
}
public class GenericeApplicationDemo {

	public static void main(String[] args) 
	{
		ArrayList<Student> al = new ArrayList<Student>();
		
		al.add(new Student(1,"amit",85));
		
		al.add(new Student(2,"sanket",96));
		
		al.add(new Student(3,"rohan",75));
		
		al.add(new Student(4,"shubham",55));
		
		
		for(Object obj :al)
		{
			Student std =(Student)obj;
			
			System.out.println("Student Rollno : "+std.getRollno()+"   Student Name : "+std.getName()+"   Student Marks : "+std.getMarks());
		}
		
	}
}
