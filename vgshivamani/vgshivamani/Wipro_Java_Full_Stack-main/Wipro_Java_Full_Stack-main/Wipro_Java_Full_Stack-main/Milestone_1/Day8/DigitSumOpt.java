import java.util.Scanner;

public class DigitSumOpt {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.print("Enter choice (even/odd): ");
        String choice = sc.next();

        number = Math.abs(number);

        int sum = 0;

        while (number > 0) {

            int digit = number % 10;

            if (choice.equalsIgnoreCase("even")) {

                if (digit % 2 == 0) {
                    sum = sum + digit;
                }

            } else if (choice.equalsIgnoreCase("odd")) {

                if (digit % 2 != 0) {
                    sum = sum + digit;
                }
            }

            number = number / 10;
        }

        System.out.println("Sum = " + sum);

        sc.close();
    }
}