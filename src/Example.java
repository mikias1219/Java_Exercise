import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept three integers from the user
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Create an Example object
        Example example = new Example();

        // Check if the second number is higher than the first number
        // and if the third number is larger than the second number
        boolean result = example.checkNumbers(num1, num2, num3);

        // Display the result
        System.out.println("Result: " + result);

        scanner.close();
    }

    public boolean checkNumbers(int num1, int num2, int num3) {
        return num2 > num1 && num3 > num2;
    }
}
