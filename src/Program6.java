import java.util.Scanner;

public class Program6 {
    private int number1;
    private int number2;

    public Program6(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public int checkNearest() {
        if (Math.abs(100 - number1) < Math.abs(100 - number2)) {
            return number1;
        } else if (Math.abs(100 - number1) > Math.abs(100 - number2)) {
            return number2;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        Program6 program = new Program6(num1, num2);

        System.out.println(program.checkNearest());

        scanner.close();
    }
}
