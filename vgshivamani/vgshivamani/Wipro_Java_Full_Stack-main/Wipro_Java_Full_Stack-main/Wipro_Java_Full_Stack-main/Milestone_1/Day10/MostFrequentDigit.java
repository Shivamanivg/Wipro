import java.util.Scanner;

public class MostFrequentDigit {

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

        int mostFrequentDigit = 0;
        int highestCount = digitCount[0];

        for (int i = 1; i < 10; i++) {

            if (digitCount[i] > highestCount) {

                highestCount = digitCount[i];

                mostFrequentDigit = i;
            }
        }

        System.out.println("Most frequent digit: " + mostFrequentDigit);

        sc.close();
    }
}