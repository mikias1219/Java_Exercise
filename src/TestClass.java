import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the house:");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of the house:");
        double width = scanner.nextDouble();

        House house = new House(length, width);
        house.showData();

        scanner.close();
    }
}
