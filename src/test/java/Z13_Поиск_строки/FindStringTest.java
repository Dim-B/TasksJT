package Z13_Поиск_строки;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindStringTest {
    @Test
    public void numberOfEntries() throws Exception {
        String text = "    123   1111  123   ";
        String str = "123";
        int res = 2;
        assertEquals(FindString.numberOfEntries(text, str), res);

        str = "111";
        res = 2;
        assertEquals(FindString.numberOfEntries(text, str), res);

        str = "";
        res = 0;
        assertEquals(FindString.numberOfEntries(text, str), res);

        str = "    123   1111  123   ";
        res = 1;
        assertEquals(FindString.numberOfEntries(text, str), res);

        str = "0    123   1111  123   ";
        res = 0;
        assertEquals(FindString.numberOfEntries(text, str), res);

        text = "";
        str = "1";
        res = 0;
        assertEquals(FindString.numberOfEntries(text, str), res);

    }

}