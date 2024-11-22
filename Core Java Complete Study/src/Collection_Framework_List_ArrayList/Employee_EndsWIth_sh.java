package Collection_Framework_List_ArrayList;

import java.util.*;

class Employee {
    private int id;
    private String name;
    private String department;

    // Constructor
    
    public Employee()
    {
    	
    }
    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }
    

    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	@Override
    public String toString() {
        return "Employee [ID=" + id + ", Name=" + name + ", Department=" + department + "]";
    }
}

public class Employee_EndsWIth_sh {
public static void main(String[] args) 
{
	  ArrayList<Employee> employees = new ArrayList<>();
	  Scanner sc = new Scanner(System.in);
	  
	
	  
	  System.out.println("Enter the no of emloyees you want to add :");
	  int size = sc.nextInt();
	  
	  System.out.println("Enter the Employee details :");
	  
	  Employee emp[] = new Employee[size];
	  
	 for(int i=0;i<size;i++)
	 {
		 
		 System.out.println("Enter the Employee Id :");
		 int empId = sc.nextInt();
		 sc.nextLine();
		 
		 System.out.println("Enter the Employee Name :");
		 String empName= sc.nextLine();
		 
		 System.out.println("Enter the Employee Department :");
		 String empDapartment = sc.nextLine();
		 
		 emp[i]= new Employee();
		 emp[i].setId(empId);
		 emp[i].setName(empName);
		 emp[i].setDepartment(empDapartment);
		 
	 }
	 
	 for(Employee emp2:emp)
	 {
		 System.out.println("Employee Id :" +emp2.getId()+" Employee Name : "+emp2.getName()+"Employee Department : "+emp2.getDepartment());
	 }
		
}
}
