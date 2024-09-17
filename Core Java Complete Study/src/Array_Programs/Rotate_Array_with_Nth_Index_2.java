package Array_Programs;

import java.util.*;

public class Rotate_Array_with_Nth_Index_2 {

  public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];

        System.out.println("Enter array elements:");

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the index from which you want to rotate the array:");
        int index = sc.nextInt();


        for(int i = 0; i < index; i++) 
        {
            int temp = a[0]; // Store the first element

            // Step 2: Shift the remaining elements one position to the left
            for (int j = 0; j < a.length - 1; j++) 
            {
                a[j] = a[j + 1];
            }

            // Step 3: Place the stored element at the end of the array
            a[a.length - 1] = temp;
        }

        System.out.println("Final Rotated Array is:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

		 
