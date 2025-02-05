import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input years of service
        System.out.println("Enter the number of years of service:");
        int yearsOfService = scanner.nextInt();

        // Input salary
        System.out.println("Enter the salary:");
        double salary = scanner.nextDouble();

        // Calculate bonus
        double bonus = calculateBonus(yearsOfService, salary);

        // Print bonus
        System.out.println("The bonus is: " + bonus);
    }

    public static double calculateBonus(int yearsOfService, double salary) {
        double bonus;

        if (yearsOfService >= 10) {
            bonus = salary * 0.12; // 10% of the salary for 5 or more years of service
        } else if (yearsOfService >= 6) {
            bonus = salary * 0.05; // 5% of the salary for 3 to 4 years of service
        } else {
            bonus = salary * 0.02; // 2% of the salary for less than 3 years of service
        }

        return bonus;
    }
}
