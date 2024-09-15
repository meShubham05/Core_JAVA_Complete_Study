import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Create a scanner object to read from stdin
        Scanner scanner = new Scanner(System.in);
        
        // Read the integers and print them
        for (int i = 0; i < 3; i++) { // Since there are 3 lines of input
            int number = scanner.nextInt();
            System.out.println(number);
        }
        
        // Close the scanner
        scanner.close();
    }
}
