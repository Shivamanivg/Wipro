import java.util.Scanner;

public class SecondWordUppercase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");

        if (words.length >= 2) {

            String secondWord = words[1];

            System.out.println(secondWord.toUpperCase());

        } else {

            System.out.println("Second word does not exist");
        }

        sc.close();
    }
}