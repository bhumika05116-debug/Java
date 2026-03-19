import java.util.Scanner;

class Rectangle {
    double length;
    double breadth;

    void accept() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        length = sc.nextDouble();

        System.out.print("Enter breadth: ");
        breadth = sc.nextDouble();
    }

    void calculateArea() {
        double area = length * breadth;
        System.out.println("Area of Rectangle = " + area);
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.accept();
        r.calculateArea();
    }
}
