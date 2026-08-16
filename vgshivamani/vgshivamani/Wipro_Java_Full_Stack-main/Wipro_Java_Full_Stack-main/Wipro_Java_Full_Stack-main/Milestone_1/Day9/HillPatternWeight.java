import java.util.Scanner;

public class HillPatternWeight {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        int weight = 0;

        for (int i = 1; i <= n; i++) {

            int number = 0;

            for (int j = 1; j <= i; j++) {

                number = number * 10 + i;
            }

            weight = weight + number;
        }

        System.out.println("Weight = " + weight);

        sc.close();
    }
}