package Collection_Framework_____Comparator_Interface;


import java.util.*;

class Student 
{
	private int id;
	private String name;
	private float  marks;
	
	
	public Student(String name , int id ,float marks)
	{
		this.name=name;
		this.id=id;
		this.marks=marks;
	}
	
	public Student()
	{
		
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}

}

class SortByPer implements Comparator
{

	public int compare(Object o1 ,Object o2)
	{
		Student s1 = (Student)o1;
		Student s2 = (Student)o2;
		
		if(s1.getMarks()>s2.getMarks())
		{
			return -1;
		}
	
		else if(s1.getMarks() <s2.getMarks())
		{
			return 1;
		}
		else
		{
			return 0;
		}
			
	}
}


public class Student_Class_Operation_Using_Comparator_Interface  
{

	public static void main(String[] args) {
		
		Student s1 = new Student("ABC",1,80.5f);
		Student s2 = new Student("MNO",4,60.0f);
		Student s3 = new Student("PQR",3,50.0f);
		Student s4 = new Student("STV",2,90.0f);
		Student s5 = new Student("XYZ",5,50);

		
		ArrayList al = new ArrayList();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);

		System.out.println("ArrayList before sorting");
		for(Object obj:al) {
			Student s=(Student)obj;
			System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getMarks());
		}
		
		
		
		SortByPer sid = new SortByPer();
		
		Collections.sort(al,sid);
		
		System.out.println("ArrayList After sorting");
		for(Object obj:al) {
			Student s=(Student)obj;
			System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getMarks());
		}

		
	}
		
}
