public class SecondLastDigit {
    public static int secondLastDigit(int number) {
        number = Math.abs(number);
        if (number < 10) {
            return -1;
        }
        number = number / 10;
        return number % 10;
    }
    public static void main(String[] args) {
        System.out.println(secondLastDigit(197));
        System.out.println(secondLastDigit(-197));
        System.out.println(secondLastDigit(5));
        System.out.println(secondLastDigit(45));
    }
}