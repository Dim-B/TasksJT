package Z5_Простые_числа;

import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleNumbersTest {
    @Test
    public void nodTest() throws Exception {
        assertEquals(5, SimpleNumbers.nod(10,15));
        assertEquals(1, SimpleNumbers.nod(15,32));
    }

}