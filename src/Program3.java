import java.util.Scanner;

public class Program3 {
    private int number1;
    private int number2;
    private int number3;

    public Program3(int number1, int number2, int number3) {
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
    }

    public boolean checkIfPossible() {
        return (number1 + number2 == number3 || number1 + number3 == number2 || number2 + number3 == number1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        Program3 program = new Program3(num1, num2, num3);

        System.out.println(program.checkIfPossible() ? "True" : "False");

        scanner.close();
    }
}
