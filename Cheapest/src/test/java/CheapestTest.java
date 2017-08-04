import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CheapestTest {
    Cheapest cheapest;

    @Test
    public void case_A1() {
        cheapest = new Cheapest(list(1, 0, 0, 0, 0));
        double expectedValue = 100;
        double actualValue = cheapest.calculatePrice();
        assertEquals(expectedValue, actualValue, 0);
    }

    @Test
    public void case_A1_B1() {
        cheapest = new Cheapest(list(1, 1, 0, 0, 0));
        double expectedValue = 190;
        double actualValue = cheapest.calculatePrice();
        assertEquals(expectedValue, actualValue, 0);
    }

    @Test
    public void case_A1_B1_C1() {
        cheapest = new Cheapest(list(1, 1, 1, 0, 0));
        double expectedValue = 270;
        double actualValue = cheapest.calculatePrice();
        assertEquals(expectedValue, actualValue, 0);
    }

    @Test
    public void case_A1_B1_C1_D1() {
        cheapest = new Cheapest(list(1, 1, 1, 1, 0));
        double expectedValue = 320;
        double actualValue = cheapest.calculatePrice();
        assertEquals(expectedValue, actualValue, 0);
    }

    @Test
    public void case_A1_B1_C1_D1_E1() {
        cheapest = new Cheapest(list(1, 1, 1, 1, 1));
        double expectedValue = 375;
        double actualValue = cheapest.calculatePrice();
        assertEquals(expectedValue, actualValue, 0);
    }


    @Test
    public void case_A2() {
        cheapest = new Cheapest(list(2, 0, 0, 0, 0));
        double expectedValue = 200;
        double actualValue = cheapest.calculatePrice();
        assertEquals(expectedValue, actualValue, 0);
    }

    @Test
    public void case_A2_B1() {
        cheapest = new Cheapest(list(2, 1, 0, 0, 0));
        double expectedValue = 290;
        double actualValue = cheapest.calculatePrice();
        assertEquals(expectedValue, actualValue, 0);
    }

    @Test
    public void case_A2_B1_C1() {
        cheapest = new Cheapest(list(2, 1, 1, 0, 0));
        double expectedValue = 370;
        double actualValue = cheapest.calculatePrice();
        assertEquals(expectedValue, actualValue, 0);
    }

    @Test
    public void case_A2_B1_C1_D1() {
        cheapest = new Cheapest(list(2, 1, 1, 1, 0));
        double expectedValue = 420;
        double actualValue = cheapest.calculatePrice();
        assertEquals(expectedValue, actualValue, 0);
    }

    @Test
    @Ignore
    public void case_A2_B2_C2_D1_E1() {
        cheapest = new Cheapest(list(2, 2, 2, 1, 1));
        double expectedValue = 640;
        double actualValue = cheapest.calculatePrice();
        assertEquals(expectedValue, actualValue, 0);
    }

    private List<Integer> list(int... input) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i : input) {
            list.add(i);
        }
        return list;
    }

}
