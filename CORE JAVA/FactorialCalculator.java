import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();
        long factorial = 1;

        if (number < 0) {
            System.out.println("Invalid input. Please enter a non-negative integer.");
        } else {
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            System.out.println("Factorial of " + number + " is: " + factorial);
        }

        scanner.close();
    }
}
