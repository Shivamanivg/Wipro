import java.util.Scanner;

public class StringWeight {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String word = sc.nextLine();

        word = word.toLowerCase();

        int weight = 0;

        for (int i = 0; i < word.length(); i++) {

            char ch = word.charAt(i);

            if (ch >= 'a' && ch <= 'z') {

                int value = ch - 'a' + 1;

                weight = weight + value;
            }
        }

        System.out.println("Weight = " + weight);

        sc.close();
    }
}