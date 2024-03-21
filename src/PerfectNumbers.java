public class PerfectNumbers {
    public static void main(String[] args) {
        System.out.println("Perfect numbers from 0 to 500:");
        for (int i = 0; i <= 500; i++) {
            if (isPerfectNumber(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPerfectNumber(int number) {
        if (number <= 1) {
            return false;
        }

        int sum = 1;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                sum += i;
                if (i * i != number) {
                    sum += number / i;
                }
            }
        }

        return sum == number;
    }
}
