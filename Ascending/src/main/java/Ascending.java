import java.math.BigInteger;

public class Ascending {

    public BigInteger findNumber(BigInteger N) {
        BigInteger number = N;
        while (!isAscending(number)) {
            number = number.subtract(new BigInteger("1"));
        }
        return number;
    }

    public boolean isAscending(BigInteger number) {
        String numberString = String.valueOf(number);
        int length = numberString.length();
        for (int i = 0; i < length - 1; i++) {
            if (numberString.charAt(i) > numberString.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }
}
