package Z1_Натуральные_числа;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class NaturalIntegersTest {
    @Test
    public void getNums() throws Exception {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(4);
        list.add(8);
        list.add(2);
        int[] nums = new int[]{1, 4, 5, 4, 8, 9, 1, 2, 3};
        assertEquals(list, NaturalIntegers.getNums(nums));
    }

}