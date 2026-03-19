import java.util.Scanner;

class Employee {
    int empId;
    String empName;
    double salary;

    void accept() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        empId = sc.nextInt();

        System.out.print("Enter Employee Name: ");
        empName = sc.next();

        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();
    }

    void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.accept();
        e.display();
    }
}
