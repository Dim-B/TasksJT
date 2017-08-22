package Z8_Неубывающая_последовательность;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class NondecreasingSequenceTest {
    @Test
    public void getNondecreasingSequence() throws Exception {
        int[] b = new int[]{1, 2, 3, 3, 0, 5, 6, 5, 5, 5, 8, 9, 9, 9, 9, 9, 1, 4, 2, 3, 5, 4, 2, 7, 5};
        ArrayList<Integer> result = new ArrayList<Integer>();
        result.addAll(Arrays.asList(5, 5, 5, 8, 9, 9, 9, 9, 9));
        assertEquals(result, NondecreasingSequence.getNondecreasingSequence(b));
    }

}