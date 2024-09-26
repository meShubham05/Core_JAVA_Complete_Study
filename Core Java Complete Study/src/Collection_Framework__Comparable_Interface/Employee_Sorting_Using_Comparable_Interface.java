package Collection_Framework__Comparable_Interface;

import java.util.*;
class Employee implements Comparable 
{
	private int id;
	private String name ;
	private int sal;
	
	public Employee() {

	}

	public Employee(String name, int id, int sal) {
		this.name = name;
		this.id = id;
		this.sal = sal;
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
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	
	public int compareTo(Object o)
	{
		Employee emp =(Employee)o;
		if(this.id>emp.getId())
		{
			return 1;
		}
		else if(this.id<emp.getId())
		{
			return -1;
			
		}
		else
		{
			return 0;
		}
			
		
	}
	
	
	
}
public class Employee_Sorting_Using_Comparable_Interface 
{
	
	public static void main(String[] args) {
		
		Employee emp1 = new Employee("ABC",1,1000);
		Employee emp2 = new Employee("MNO",5,6000);
		Employee emp3 = new Employee("PQR",2,3000);
		Employee emp4 = new Employee("STV",4,9000);
		Employee emp5 = new Employee("XYZ",3,500);

		ArrayList al = new ArrayList();
		al.add(emp1);//id ,name,sal
		al.add(emp2);
		al.add(emp3);
		al.add(emp4);
		al.add(emp5);

		
		
		System.out.println("Employee Data Before Sorting");
		
		for(Object obj :al)
		{
			Employee emp =(Employee)obj;
			System.out.println("Employee id :"+emp.getId()+"Employee Name : "+emp.getName()+ " Employee salary :"+emp.getSal());
		}
		
		
		Collections.sort(al);
		
		
		System.out.println("\nEmployee Data After  Sorting \n");
		
		for(Object obj :al)
		{
			Employee emp =(Employee)obj;
			System.out.println(" Employee id : "+emp.getId()+" Employee Name : "+emp.getName()+ " Employee salary :"+emp.getSal());
		}
	}

	
	
}
