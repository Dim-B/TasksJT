package Z16_Римская_система;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class DigitalToRomanConverterTest {
    HashMap<Integer, String> numRes = new HashMap<Integer, String>();

    @Before
    public void initialize() {
        numRes.put(1, "I");
        numRes.put(2, "II");
        numRes.put(3, "III");
        numRes.put(4, "IV");
        numRes.put(5, "V");
        numRes.put(6, "VI");
        numRes.put(7, "VII");
        numRes.put(8, "VIII");
        numRes.put(9, "IX");
        numRes.put(10, "X");
        numRes.put(11, "XI");
        numRes.put(14, "XIV");
        numRes.put(18, "XVIII");
        numRes.put(19, "XIX");
        numRes.put(99, "XCIX");
        numRes.put(299, "CCXCIX");
        numRes.put(875, "DCCCLXXV");
        numRes.put(875, "DCCCLXXV");
        numRes.put(1396, "MCCCXCVI");
        numRes.put(3566, "MMMDLXVI");
    }

    @Test
    public void digitalToRoman() throws Exception {
        for (HashMap.Entry<Integer, String> n : numRes.entrySet()) {
            assertEquals(DigitalToRomanConverter.digitalToRoman(n.getKey()), n.getValue());
        }
    }

    @Test
    public void romanToDigital() throws Exception {
        for (HashMap.Entry<Integer, String> n : numRes.entrySet()) {
            assertEquals(DigitalToRomanConverter.romanToDigital(n.getValue()), n.getKey());
        }
    }
}