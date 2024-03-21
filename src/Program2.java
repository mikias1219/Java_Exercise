import java.util.Scanner;

public class Program2 {
    private int number1;
    private int number2;

    public Program2(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public boolean checkIf5() {
        return (number1 == 5 || number2 == 5 || number1 + number2 == 5 || Math.abs(number1 - number2) == 5);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        Program2 program = new Program2(num1, num2);

        System.out.println(program.checkIf5() ? "True" : "False");

        scanner.close();
    }
}
