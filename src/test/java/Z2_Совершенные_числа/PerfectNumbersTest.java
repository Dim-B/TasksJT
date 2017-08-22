package Z2_Совершенные_числа;

import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

public class PerfectNumbersTest {
    @Test
    public void getPerfectEmpty() throws Exception {
        ArrayList<Long> list = new ArrayList<Long>();
        assertEquals(list, PerfectNumbers.getPerfect(7, 27));

    }

    @Test
    public void getPerfect() throws Exception {
        ArrayList<Long> list = new ArrayList<Long>();
        list.add((long) 6);
        list.add((long) 28);
        list.add((long) 496);
        assertEquals(list, PerfectNumbers.getPerfect(-8, 500));
    }

}