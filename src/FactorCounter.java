import java.util.Scanner;

public class FactorCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept an integer from the user
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Create a FactorCounter object
        FactorCounter factorCounter = new FactorCounter();

        // Count the factors of the input number
        int factorCount = factorCounter.countFactors(number);

        // Display the result
        System.out.println("The number of factors of " + number + " is: " + factorCount);

        scanner.close();
    }

    public int countFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        return count;
    }
}
