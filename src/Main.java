import java.util.Scanner;

public class Main {
    // রিকার্সিভ ফাংশন
    public static int sumOfDigits(int x) {
        if (x == 0) {
            return 0;
        }
        return (x % 10) + sumOfDigits(x / 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int x = scanner.nextInt();

        System.out.println("Sum of digits: " + sumOfDigits(x));

        scanner.close();
    }
}