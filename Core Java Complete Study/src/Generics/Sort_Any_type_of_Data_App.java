package Generics;

import java.util.*;

class DataSorting<E>
{
    public static <T extends Comparable<T>> void sortCollection(List<T> collection) 
    {
        Collections.sort(collection);
    }
}

class CustomerSorting implements Comparable<CustomerSorting> 
{
    private int custId;
    private String cusName;
    private int custSalary;

    public CustomerSorting() {}

    public CustomerSorting(int custId, String cusName, int custSalary) 
    {
        this.custId = custId;
        this.cusName = cusName;
        this.custSalary = custSalary;
    }

    public int getCustId() 
    {
        return custId;
    }

    public String getCustName() 
    {
        return cusName;
    }

    public int getcustSalary() 
    {
        return custSalary;
    }

    @Override
    public int compareTo(CustomerSorting other) 
    {
        return Integer.compare(this.custId, other.custId); // Compare by custId
    }

    @Override
    public String toString() 
    {
        return "Customer ID: " + custId + ", Name: " + cusName + ", Salary: " + custSalary;
    }
}

public class Sort_Any_type_of_Data_App 
{
    public static void main(String[] args) 
    {
        
    	
        List<Integer> list1 = new ArrayList<>(Arrays.asList(5, 2, 9, 1, 5, 6));
        System.out.println("Befor Sorting :\n");
        
        System.out.println(list1);
        
        
        List<String> list2 = new ArrayList<>(Arrays.asList("banana", "apple", "orange", "grape", "kiwi"));

        System.out.println(list2);
        
        
        List<CustomerSorting> list3 = new ArrayList<>(Arrays.asList(
                new CustomerSorting(1, "Alice", 5000),
                new CustomerSorting(3, "Bob", 8000),
                new CustomerSorting(8, "Charlie", 100000),
                new CustomerSorting(10, "David", 12000)
        ));

        System.out.println(list3);
        
        
        System.out.println("\n\nAfter sorting : \n");
        
        DataSorting.sortCollection(list1); 
        DataSorting.sortCollection(list2);
        DataSorting.sortCollection(list3);

       
        System.out.println("Sorted list1: " + list1);
        System.out.println("Sorted list2: " + list2);
        System.out.println("Sorted list3: " + list3);
        
    }
}
