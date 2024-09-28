package Collection_Framework_List_ArrayList;

import java.util.ArrayList;

public class ArrayListInternalCapacityCheckingApp {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5); // Initial capacity is 5
        
        // Add elements
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        
        // Since we can't access the internal capacity directly,
        // we can assume that ArrayList will grow based on certain rules
        System.out.println("Size of ArrayList: " + list.size());
        System.out.println("Simulated capacity: " + getSimulatedCapacity(list));
    }

    // Function to simulate the capacity tracking (based on the size and growth rules)
    private static int getSimulatedCapacity(ArrayList<?> list) {
        int size = list.size();
        
        // Initial capacity is 10 if not specified
        int capacity = 10;
        if (size > 0) {
            while (capacity < size) {
                capacity = (capacity * 3) / 2 + 1; // Grow by 50% rule
            }
        }
        return capacity;
    }
}
