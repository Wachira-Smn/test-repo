import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();  // Read the first number from user input

        // Prompt the user to enter the second number
        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();  // Read the second number from user input

        // Calculate the sum of the two numbers
        int sum = num1 + num2;

        // Print the sum of the two numbers to the console
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}
