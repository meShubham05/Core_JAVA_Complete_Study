 package Collection_Framework_____Comparator_Interface;

import java.util.*;

class Employee {
    private int id;
    private String name;
    private float salary;

    public Employee(String name, int id, float salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public Employee() { }

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

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}


class SortBySalary implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        if (e1.getSalary() < e2.getSalary()) {
            return -1;
        } else if (e1.getSalary() > e2.getSalary()) {
            return 1;
        } else {
            return 0;
        }
    }
}

class SortByName implements Comparator<Employee>
{
	public int compare(Employee emp1,Employee emp2)
	{
		if(emp1.getName().compareTo(emp2.getName())<0)
		{
			return -1;
		}
		else if(emp1.getName().compareTo(emp2.getName())>0)
		{
			return 1;
		}
		else
		{
			return 0;
		}
			
	}
	
}


class SortById implements Comparator<Employee> 
{
    public int compare(Employee e1, Employee e2) 
    {
        if (e1.getId() < e2.getId()) {
            return -1;
        } else if (e1.getId() > e2.getId()) {
            return 1;
        } else {
            return 0;
        }
    }
}

public class Employee_Class_Operation_Using_Comparator_Interface {

    public static void main(String[] args) {
       
        Employee e1 = new Employee("Wasim", 1, 60000.0f);
        Employee e2 = new Employee("Gopal", 2, 50000.0f);
        Employee e3 = new Employee("Charlie", 3, 70000.0f);
        Employee e4 = new Employee("Aniket", 4, 50000.0f);
        Employee e5 = new Employee("Sanket", 5, 45000.0f);

       
        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);

      
        System.out.println("Employee List before sorting by Salary:");
        for (Employee emp : employeeList) {
            System.out.println(emp.getId() + "\t" + emp.getName() + "\t" + emp.getSalary());
        }

    
        Collections.sort(employeeList, new SortBySalary());

        System.out.println("\nEmployee List after sorting by Salary:");
        for (Employee emp : employeeList) {
            System.out.println(emp.getId() + "\t" + emp.getName() + "\t" + emp.getSalary());
        }

        Collections.sort(employeeList, new SortByName());
       
        System.out.println("\nEmployee List after sorting by Name:");
        for (Employee emp : employeeList) 
        {
            System.out.println(emp.getId() + "\t" + emp.getName() + "\t" + emp.getSalary());
        }
        
        Collections.sort(employeeList, new SortById());
       
        System.out.println("\nEmployee List after sorting by ID:");
        for (Employee emp : employeeList) {
            System.out.println(emp.getId() + "\t" + emp.getName() + "\t" + emp.getSalary());
        }
    }
}
