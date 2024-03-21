import java.util.Scanner;

public class Program5 {
    private double length;
    private double width;

    public double calculateArea() {
        return length * width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Program5 rectangle = new Program5();

        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        rectangle.setLength(length);

        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();
        rectangle.setWidth(width);

        System.out.println("******************************");
        System.out.println("The length of the rectangle is: " + rectangle.getLength());
        System.out.println("The width of the rectangle is: " + rectangle.getWidth());
        System.out.println("The area of the rectangle is: " + rectangle.calculateArea());

        scanner.close();
    }
}
