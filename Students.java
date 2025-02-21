import java.util.Scanner;

class Student {
    String name, gender;
    int rollNo, age, sub1, sub2;

    void initialize(Scanner scanner) {
        scanner.nextLine();  // Consume the newline
        System.out.print("Enter name: "); name = scanner.nextLine();
        System.out.print("Enter roll number: "); rollNo = scanner.nextInt();
        System.out.print("Enter age: "); age = scanner.nextInt();
        System.out.print("Enter gender: "); gender = scanner.next();
        System.out.print("Enter marks for subject 1: "); sub1 = scanner.nextInt();
        System.out.print("Enter marks for subject 2: "); sub2 = scanner.nextInt();
    }

    void display() {
        System.out.println("\nStudent Details:\nName: " + name + "\nRoll No: " + rollNo + 
            "\nAge: " + age + "\nGender: " + gender + "\nMarks: " + sub1 + ", " + sub2);
        System.out.println("Total: " + calculateTotal() + "\nPercentage: " + calculatePercentage() + 
            "%\nGrade: " + calculateGrade());
    }

    int calculateTotal() { return sub1 + sub2; }
    float calculatePercentage() { return (float) calculateTotal() / 2; }
    char calculateGrade() {
        float percentage = calculatePercentage();
        if (percentage >= 80) return 'A';
        else if (percentage >= 60) return 'B';
        else if (percentage >= 40) return 'C';
        return 'D';
    }
}

public class Students {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            students[i] = new Student();
            System.out.println("\nEnter details for Student " + (i + 1) + ":");
            students[i].initialize(scanner);
        }
        
        for (Student student : students) student.display();

        scanner.close();
    }
}