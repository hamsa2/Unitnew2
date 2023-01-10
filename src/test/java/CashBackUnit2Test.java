import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashBackUnit2Test {

    @Test
    public void checkCash1() {
        CashBackUnit2 cashBackUnit2 = new CashBackUnit2();
        int amount = 700;
        int expected = 300;
        int actual = cashBackUnit2.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void checkCash2() {
        CashBackUnit2 cashBackUnit2 = new CashBackUnit2();
        int amount = 1100;
        int expected = 900;
        int actual = cashBackUnit2.remain(amount);

        assertEquals(actual, expected);
    }
}