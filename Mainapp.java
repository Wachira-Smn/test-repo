class Student {
    String name;
    double marks;

    public Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

class GradeCalculator {
    public String calculateGrade(double marks) {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 75) {
            return "B";
        } else if (marks >= 50) {
            return "C";
        } else {
            return "D";
        }
    }
}

public class MainApp {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student's marks: ");
        double marks = scanner.nextDouble();

        Student student = new Student(name, marks);
        GradeCalculator gradeCalculator = new GradeCalculator();
        String grade = gradeCalculator.calculateGrade(marks);

        student.displayDetails();
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
