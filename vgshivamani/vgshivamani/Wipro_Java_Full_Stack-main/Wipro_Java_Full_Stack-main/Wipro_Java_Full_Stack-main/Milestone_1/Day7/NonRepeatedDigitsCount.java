import java.util.Scanner;

public class NonRepeatedDigitsCount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        number = Math.abs(number);

        int[] digitCount = new int[10];

        if (number == 0) {
            digitCount[0] = 1;
        }

        while (number > 0) {

            int digit = number % 10;

            digitCount[digit]++;

            number = number / 10;
        }

        int count = 0;

        for (int i = 0; i < 10; i++) {

            if (digitCount[i] == 1) {
                count++;
            }
        }

        System.out.println("Non-repeated digits: " + count);

        sc.close();
    }
}