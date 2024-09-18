package Collection_Framework.Vector;

import java.util.*;

class Employee
{
	int id;
	String name;
	String designation;
	int salary;
	String company;
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
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}

}
public class Employee_Vector {

	public static void main(String x[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number of Employee you want to add :");
		
		int size = sc.nextInt();
		
		Employee emp [] = new Employee[size];
		
		Vector v = new Vector();
		for(int i=0;i<size;i++)
		{
			emp[i]= new Employee();
			
			System.out.println("Enter employee id :");
			
			int id =sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Employee Name :");
			String name = sc.nextLine();
			
			System.out.println("Enter Employee Designation ");
			String designation = sc.nextLine();
			
			System.out.println("Enter Employee Salary :");
			int salary = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter Employee Company :");
			String company = sc.nextLine();
			
			emp[i].setId(id);
			emp[i].setName(name);
			emp[i].setDesignation(designation);
			emp[i].setSalary(salary);
			emp[i].setCompany(company);
			
			v.add(emp[i]);
			
		}
		
			Iterator i=v.iterator();
			
		
			System.out.println("Display All Employee Details ");
			while(i.hasNext())
			{
				Object obj = i.next();
				Employee emp2 = (Employee)obj;
				System.out.println("Employee id :"+emp2.getId());
				System.out.println("Employee Name :"+emp2.getName());
				System.out.println("Employee Designation :"+emp2.getDesignation());
				System.out.println("Employee Salary :"+emp2.getSalary());
				System.out.println("Employee Company :"+emp2.getCompany());	
			}
	}
}
