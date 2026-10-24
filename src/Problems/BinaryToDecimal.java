package Problems;

public class BinaryToDecimal {
    public static void main(String[] args) {

        int num = 1010;
        int decimal = 0;
        int rem;
        int place = 1;

        while (num > 0) {
            rem = num % 10;
            decimal = decimal + rem * place;
            place = place * 2;
            num = num / 10;
        }

        System.out.println("Decimal number: " + decimal);
    }
}



