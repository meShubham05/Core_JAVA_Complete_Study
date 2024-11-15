package Java8Features;

import java.util.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ConvertingIntArraytoStream {
    public static void main(String[] args) {
        int array[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values in array:");

        for (int i = 0; i < 5; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("Display array elements after converting through the stream:");

        // Convert int array to IntStream
        IntStream intStream = Arrays.stream(array);

        // Collect the IntStream into a List<Integer>
        List<Integer> list = intStream.boxed().collect(Collectors.toList());

        // Print each element in the list using forEach
       

        // Close the scanner
        sc.close();
    }
}
