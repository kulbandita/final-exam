import org.junit.Ignore;
import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class AscendingTest {

    Ascending ascending = new Ascending();

    @Test
    public void case_N_8() {
        BigInteger expectedValue = new BigInteger("8");
        BigInteger actualValue = ascending.findNumber(new BigInteger("8"));
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void case_N_10() {
        BigInteger expectedValue = new BigInteger("9");
        BigInteger actualValue = ascending.findNumber(new BigInteger("10"));
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void case_N_20() {
        BigInteger expectedValue = new BigInteger("19");
        BigInteger actualValue = ascending.findNumber(new BigInteger("20"));
        assertEquals(expectedValue, actualValue);
    }

    @Test
    @Ignore
    public void case_N_132() {
        BigInteger expectedValue = new BigInteger("129");
        BigInteger actualValue = ascending.findNumber(new BigInteger("132"));
        assertEquals(expectedValue, actualValue);
    }

    @Test
    @Ignore
    public void case_N_111111111111111110() {
        BigInteger expectedValue = new BigInteger("99999999999999999");
        BigInteger actualValue = ascending.findNumber(new BigInteger("111111111111111110"));
        assertEquals(expectedValue, actualValue);
    }

    @Test
    @Ignore
    public void case_N_989999999999999999() {
        BigInteger expectedValue = new BigInteger("99999999999999999");
        BigInteger actualValue = ascending.findNumber(new BigInteger("989999999999999999"));
        assertEquals(expectedValue, actualValue);
    }

    @Test
    @Ignore
    public void case_N_653161544328834085() {
        BigInteger expectedValue = new BigInteger("599999999999999999");
        BigInteger actualValue = ascending.findNumber(new BigInteger("653161544328834085"));
        assertEquals(expectedValue, actualValue);
    }
}
