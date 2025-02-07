public class bonus 2 {
    
}
class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class SalaryCalculator {
    public double calculateBonus(double salary) {
        return salary * 0.10;
    }
}

public class MainApp {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter employee's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter employee's salary: ");
        double salary = scanner.nextDouble();

        Employee employee = new Employee(name, salary);
        SalaryCalculator salaryCalculator = new SalaryCalculator();
        double bonus = salaryCalculator.calculateBonus(salary);

        employee.displayDetails();
        System.out.println("Bonus: " + bonus);

        scanner.close();
    }
}
