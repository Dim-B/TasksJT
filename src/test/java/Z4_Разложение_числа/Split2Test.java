package Z4_Разложение_числа;

import org.junit.Test;

import static org.junit.Assert.*;

public class Split2Test {
    @Test
    public void getSplit() throws Exception {
        String result = "999 = 2^9 + 2^8 + 2^7 + 2^6 + 2^5 + 2^2 + 2^1 + 2^0";
        assertEquals(result, Split2.getSplit(999));
    }

}