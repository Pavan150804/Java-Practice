
package Problems;

public class OctalToDecimal {
    public static void main(String[] args) {

        int num = 120;
        int decimal = 0;
        int rem;
        int place = 1;

        while (num > 0) {
            rem = num % 10;
            decimal = decimal + rem * place;
            place = place * 8;
            num = num / 10;
        }

        System.out.println("Decimal number: " + decimal);
    }
}

