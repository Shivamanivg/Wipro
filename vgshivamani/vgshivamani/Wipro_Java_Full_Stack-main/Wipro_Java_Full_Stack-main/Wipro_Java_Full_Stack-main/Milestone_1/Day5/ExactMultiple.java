import java.util.Scanner;
public class ExactMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        System.out.print("Enter M: ");
        int m = sc.nextInt();
        if (n % m == 0) {
            System.out.println("Exact Multiple");
        } else {
            System.out.println("Not an Exact Multiple");
        }
        sc.close();
    }
}