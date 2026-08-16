public class AddLastDigits {
    public static int addLastDigits(int input1, int input2) {
        input1 = Math.abs(input1);
        input2 = Math.abs(input2);
        int lastDigit1 = input1 % 10;
        int lastDigit2 = input2 % 10;
        int sum = lastDigit1 + lastDigit2;
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(addLastDigits(267, 154));
        System.out.println(addLastDigits(267, -154));
        System.out.println(addLastDigits(-267, 154));
        System.out.println(addLastDigits(-267, -154));
    }
}