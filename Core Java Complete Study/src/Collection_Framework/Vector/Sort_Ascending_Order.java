package Collection_Framework.Vector;

import java.util.*;

public class Sort_Ascending_Order {

    public static void main(String[] args) {
        
        Vector<Integer> v = new Vector<>();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of elements you want to add:");
        int size = sc.nextInt();
        
        for (int i = 0; i < size; i++) {
            System.out.println("Enter data in Collection:");
            v.add(sc.nextInt());
        }
        
        // Display vector without sorting
        System.out.println("Display vector without sorting:");
        for (Object obj : v) {
            System.out.println(obj);
        }
        
        
        
        for (int i = 0; i < v.size(); i++) {
            for (int j = i + 1; j < v.size(); j++) {
                if (v.get(i) > v.get(j)) {
                    // Swap elements
                    int temp = v.get(i);
                    v.set(i, v.get(j));
                    v.set(j, temp);
                }
            }
        }
        
        
        System.out.println("Display the collection after sorting:");
        for (Object obj : v) {
            System.out.println(obj);
        }
        
        sc.close();
    }
}
