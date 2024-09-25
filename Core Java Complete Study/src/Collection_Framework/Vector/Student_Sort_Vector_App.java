package Collection_Framework.Vector;

import java.util.*;

class Student2 {
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

        System.out.println("Enter the Number of Students you want to add:");
        int size = sc.nextInt();

        Vector v = new Vector();

       
        for (int i = 0; i < size; i++) {
            System.out.println("Enter id:");
            int id = sc.nextInt();
            sc.nextLine(); 

            System.out.println("Enter Name:");
            String name = sc.nextLine();

            System.out.println("Enter percentage:");
            float per = sc.nextFloat();

            Student2 student = new Student2();
            student.setId(id);
            student.setName(name);
            student.setPer(per);

            v.add(student);  // Add the student to the vector
        }

        // Display student data before sorting
        System.out.println("\nStudent Data Before Sorting:\n");
        for (int i = 0; i < v.size(); i++) {
            Student2 std = (Student2) v.get(i);  // Typecasting since no generics
            System.out.println("Student Id: " + std.getId() + 
                               " Student Name: " + std.getName() + 
                               " Student Percentage: " + std.getPer());
        }

        // Sorting the vector using bubble sort (by Student ID)
        for (int i = 0; i < v.size(); i++) {
            for (int j = i + 1; j < v.size(); j++) {
                Student2 student1 = (Student2) v.get(i);  // Typecasting
                Student2 student2 = (Student2) v.get(j);  // Typecasting

                if (student1.getId() > student2.getId()) {
                    // Swap students based on ID
                    v.set(i, student2);
                    v.set(j, student1);
                }
            }
        }

        // Display student data after sorting
        System.out.println("\nStudent Data After Sorting (by ID):\n");
        for (int i = 0; i < v.size(); i++) {
            Student2 std = (Student2) v.get(i);  // Typecasting since no generics
            System.out.println("Student Id: " + std.getId() + 
                               " Student Name: " + std.getName() + 
                               " Student Percentage: " + std.getPer());
        }

        sc.close();
    }
}
