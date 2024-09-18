package Collection_Framework.Vector;

import java.util.*;


class Student
{
	int id;
	String name;
	int std;
	float per;
	
	public void setID(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setStd(int std)
	{
		this.std=std;
	}
	
	public int getStd()
	{
		return std;
	}
	public void setPer(float per)
	{
		this.per=per;
	}
	
	public float getPer()
	{
		return per;
	}
}


public class Student_Vector {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
	
		
		int id,std;
		String name;
		float percentage;
		
		
		System.out.println("Enter the student data :");
		
		int size;
		
		System.out.println("Enter the size of student you want to add :");
		
		size = sc.nextInt();
		
		Student student[] = new Student[size]; 
		Vector v =new Vector();
		for(int i=0;i<student.length;i++)
		{
			student[i]= new Student();
			
			System.out.println("Enter student id :");
			id =sc.nextInt();
			
			sc.nextLine();
			System.out.println("Enter student name :");
			name = sc.nextLine();
			
			System.out.println("Enter student standard :");
			std =sc.nextInt();
			
			System.out.println("Enter student percentage :");
			percentage = sc.nextFloat();
			
			student[i].setID(id);
			student[i].setName(name);
			student[i].setStd(std);
			student[i].setPer(percentage);
			
		
			v.add(student[i]);
		}
		
		
		
		
		
 
		Iterator i =v.iterator();
		
		while(i.hasNext())
		{
			Object obj= i.next();
			Student student2=(Student)obj;
			System.out.println(student2.getId()+student2.getName()+student2.getPer()+student2.getStd());
		}
		
		
		
	}

}
