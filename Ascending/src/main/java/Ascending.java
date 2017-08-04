import java.math.BigInteger;

public class Ascending {

    public BigInteger findNumber(BigInteger number) {
        String numberString = String.valueOf(number);
        int length = numberString.length();

        for (int i = 0; i < length - 1; i++) {
            if (numberString.charAt(i) > numberString.charAt(i + 1)) {
                number = number.subtract(new BigInteger("1"));
            }
        }
        return number;
    }
}
