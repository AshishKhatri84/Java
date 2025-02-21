class Employee {
    private String name;
    private String address;
    private double salary;
    private String jobTitle;

    public Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getSalary() {
        return salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }
    public double calculateBonus() {
        return 0.05 * salary; // Default bonus calculation for employees
    }
    public void generatePerformanceReport() {
        System.out.println("Performance report for " + name + ": No specific report available.");
    }
    public void manageProjects() {
        System.out.println(name + " is not assigned to manage projects.");
    }
}

class Manager extends Employee {
    public Manager(String name, String address, double salary) {
        super(name, address, salary, "Manager");
    }
    @Override
    public double calculateBonus() {
        return 0.1 * getSalary();
    }
    @Override
    public void generatePerformanceReport() {
        System.out.println("Performance report for " + getName() + ": Excellent performance as a Manager.");
    }
    @Override
    public void manageProjects() {
        System.out.println(getName() + " is managing projects efficiently.");
    }
}

class Developer extends Employee {
    public Developer(String name, String address, double salary) {
        super(name, address, salary, "Developer");
    }
    @Override
    public double calculateBonus() {
        return 0.08 * getSalary();
    }
    @Override
    public void generatePerformanceReport() {
        System.out.println("Performance report for " + getName() + ": Solid contribution as a Developer.");
    }
    @Override
    public void manageProjects() {
        System.out.println(getName() + " is actively working on development projects.");
    }
}

class Programmer extends Employee {
    public Programmer(String name, String address, double salary) {
        super(name, address, salary, "Programmer");
    }
    @Override
    public double calculateBonus() {
        return 0.07 * getSalary();
    }
    @Override
    public void generatePerformanceReport() {
        System.out.println("Performance report for " + getName() + ": Consistent work as a Programmer.");
    }
    @Override
    public void manageProjects() {
        System.out.println(getName() + " is involved in programming tasks.");
    }
}
public class Hierarchy {
    public static void main(String[] args) {
        Manager manager = new Manager("John Doe", "123 Main St", 80000);
        Developer developer = new Developer("Jane Smith", "456 Oak St", 65000);
        Programmer programmer = new Programmer("Bob Johnson", "789 Pine St", 55000);

        System.out.println("Manager Bonus: $" + manager.calculateBonus());
        manager.generatePerformanceReport();
        manager.manageProjects();

        System.out.println("\nDeveloper Bonus: $" + developer.calculateBonus());
        developer.generatePerformanceReport();
        developer.manageProjects();

        System.out.println("\nProgrammer Bonus: $" + programmer.calculateBonus());
        programmer.generatePerformanceReport();
        programmer.manageProjects();
    }
}