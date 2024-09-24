package Collection_Framework.Vector;

import java.util.*;

class Student2
{
	private int id;
	private String name;
	private float per;
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
	public float getPer() {
		return per;
	}
	public void setPer(float per) {
		this.per = per;
	}
	
	
}

public class Student_Sort_Vector_App {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number of Student you want to add:");
		int size =sc.nextInt();
		
		Student2 std[] = new Student2[size];
		Vector v= new Vector();
		
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter id ");
			int id = sc.nextInt();
			
			sc.nextLine();
			
			System.out.println("Enter Name :");
			String name =sc.nextLine();
			
			System.out.println("Enter percentage :");
			float per =sc.nextFloat();
			
			std[i]= new Student2();
			
			std[i].setId(id);
			std[i].setName(name);
			std[i].setPer(per);
			
			v.add(std[i]);
		}
		
		
		Iterator i= v.iterator();
		
		System.out.println("Student Data Before Sorting : \n\n\n");
		
		while(i.hasNext())
		{
			Object obj=i.next();
			Student2 std2=(Student2)obj;
			System.out.println("Student Id :"+std2.getId()+" Student Name : "+std2.getName()+" Student Percentage : "+std2.getPer());
		}
		
		for(int i1=0;i1<v.size();i1++)
		{
			for(int j=0;j<v.size();j++)
			{
				Student2 previousId =(Student2)v.get(i1);
				Student2 nextId =(Student2)v.get(j);
				
				if(previousId.getId()<nextId.getId())
				{
					v.set(i1, nextId);
					v.set(j, previousId);
				}
			}
		}
		
		System.out.println("Data After Sorting ");
			
		Vector v2 = new Vector();
		v2.add(std);
		
		while(i.hasNext())
		{
			Iterator i2 = v2.iterator();
			Object obj = i2.next();
			Student std2=(Student)obj;
			System.out.println("Student Id :"+std2.getId()+" Student Name : "+std2.getName()+" Student Percentage : "+std2.getPer());
	
		}
		
	}
}
