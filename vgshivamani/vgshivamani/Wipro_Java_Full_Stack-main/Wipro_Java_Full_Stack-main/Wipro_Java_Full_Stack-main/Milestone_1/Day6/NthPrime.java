import java.util.Scanner;

public class NthPrime {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int count = 0;
        int number = 1;

        while (count < n) {

            number++;

            int factorCount = 0;

            for (int i = 1; i <= number; i++) {

                if (number % i == 0) {
                    factorCount++;
                }
            }

            if (factorCount == 2) {
                count++;
            }
        }

        System.out.println("Nth Prime = " + number);

        sc.close();
    }
}