package Collection_Framework_____Comparator_Interface;

import java.util.*;

class Employee1 {
    private int empId;
    private String empName;
    private int empSal;

    public Employee1() { }

    public Employee1(int empId, String empName, int empSal) {
        this.empId = empId;
        this.empName = empName;
        this.empSal = empSal;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public int getEmpSal() {
        return empSal;
    }

    @Override
    public String toString() {
        return "Employee Id: " + empId + ", Name: " + empName + ", Salary: " + empSal;
    }
}

// Comparator to sort by Employee ID
class EmployeeSortById implements Comparator<Employee1> 
{
    public int compare(Employee1 emp1, Employee1 emp2) 
    {
        return Integer.compare(emp2.getEmpId(), emp1.getEmpId());
    }
}

// Comparator to sort by Employee Salary
class EmployeeSortBySal implements Comparator<Employee1> 
{
    public int compare(Employee1 emp1, Employee1 emp2) 
    {
        return Integer.compare(emp1.getEmpSal(), emp2.getEmpSal());
    }
}

public class Employee_Sorting_BY_ID_NAME_PER {

    public static void main(String[] args) {
        // Creating a list of employees
        List<Employee1> list = new ArrayList<>();
        list.add(new Employee1(5, "Sanket", 5000));
        list.add(new Employee1(12, "Aniket", 3000));
        list.add(new Employee1(2, "Darshan", 1000));
        list.add(new Employee1(8, "Wasim", 1000));
        list.add(new Employee1(15, "Krishna", 8000));

        // Displaying the list before any sorting
        System.out.println("Before Any Sorting:");
        for (Employee1 employee : list) {
            System.out.println(employee);
        }

        // Sorting by Employee ID
        System.out.println("\nEmployee Data Sorted By ID:");
        Collections.sort(list, new EmployeeSortById());
        for (Employee1 employee : list) {
            System.out.println(employee);
        }

        // Sorting by Employee Salary
        System.out.println("\nEmployee Data Sorted By Salary:");
        Collections.sort(list, new EmployeeSortBySal());
        for (Employee1 employee : list) {
            System.out.println(employee);
        }
    }
}
