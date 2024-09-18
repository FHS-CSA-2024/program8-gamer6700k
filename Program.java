//import stuff here

//Your code here
import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        // Create a scanner object for input
        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("Enter number 1: ");
        int num1 = input.nextInt();

        System.out.print("Enter number 2: ");
        int num2 = input.nextInt();

        // Output the original numbers
        System.out.println("\nOriginal numbers are " + num1 + " and " + num2);

        // Calculations
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        double average = (num1 + num2) / 2.0;  // Ensure floating-point division
        int distance = Math.abs(difference);  // Absolute value of the difference

        // Calculate maximum and minimum without using built-in functions
        int maximum = (num1 + num2 + Math.abs(num1 - num2)) / 2;
        int minimum = (num1 + num2 - Math.abs(num1 - num2)) / 2;

        // Output
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + difference);
        System.out.println("Product = " + product);
        System.out.println("Average = " + average);
        System.out.println("Absolute value = " + distance);
        System.out.println("Maximum = " + maximum);
        System.out.println("Minimum = " + minimum);

        input.close();
    }
}

//Paste console output below:
/*


*/
