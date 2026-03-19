import java.util.Scanner;

class Car {
    String brandName;
    String model;
    double cost;

    void accept() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Brand Name: ");
        brandName = sc.nextLine();

        System.out.print("Enter Model: ");
        model = sc.nextLine();

        System.out.print("Enter Cost: ");
        cost = sc.nextDouble();
    }

    void display() {
        System.out.println("Brand Name: " + brandName);
        System.out.println("Model: " + model);
        System.out.println("Cost: " + cost);
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.accept();
        c.display();
    }
}
