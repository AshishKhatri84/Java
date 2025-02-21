import java.util.Scanner;
class Employee {
    private int empID;
    private String name;
    private double salary;
    private double pf;
    private double hra;
    public Employee(int empID, String name, double salary, double pf, double hra) {
        this.empID = empID;
        this.name = name;
        this.salary = salary;
        this.pf = pf;
        this.hra = hra;
    }
    public int getEmpID() {
        return empID;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    public double getPf() {
        return pf;
    }
    public double getHra() {
        return hra;
    }
    public double calculateTotalSalary() {
        return salary + hra - pf;
    }}
public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();
        Employee[] employees = new Employee[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1) + ":");            
            System.out.print("Enter employee ID: ");
            int empID = scanner.nextInt();            
            System.out.print("Enter employee name: ");
            String name = scanner.next();            
            System.out.print("Enter employee salary: ");
            double salary = scanner.nextDouble();            
            System.out.print("Enter PF amount: ");
            double pf = scanner.nextDouble();            
            System.out.print("Enter HRA amount: ");
            double hra = scanner.nextDouble();
            employees[i] = new Employee(empID, name, salary, pf, hra);
            scanner.close();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("\nDetails for Employee " + (i + 1) + ":");
            System.out.println("Employee ID: " + employees[i].getEmpID());
            System.out.println("Name: " + employees[i].getName());
            System.out.println("Salary: " + employees[i].getSalary());
            System.out.println("PF: " + employees[i].getPf());
            System.out.println("HRA: " + employees[i].getHra());
            System.out.println("Total Salary: " + employees[i].calculateTotalSalary());
        }}}