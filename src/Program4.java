import java.util.Scanner;

public class Program4 {
    private int number1;
    private int number2;
    private int number3;

    public Program4(int number1, int number2, int number3) {
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
    }

    public boolean checkRightmostDigit() {
        int digit1 = number1 % 10;
        int digit2 = number2 % 10;
        int digit3 = number3 % 10;

        return (digit1 == digit2 || digit1 == digit3 || digit2 == digit3);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        Program4 program = new Program4(num1, num2, num3);

        System.out.println(program.checkRightmostDigit() ? "True" : "False");

        scanner.close();
    }
}
