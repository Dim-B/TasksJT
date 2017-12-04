package Z16_Римская_система;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DigitalToRomanConverterTest {
    @Test
    public void digitalToRoman() throws Exception {
        int num = 1;
        String res = "I";
        assertEquals(DigitalToRomanConverter.digitalToRoman(num), res);
        num = 2;
        res = "II";
        assertEquals(DigitalToRomanConverter.digitalToRoman(num), res);
        num = 3;
        res = "III";
        assertEquals(DigitalToRomanConverter.digitalToRoman(num), res);
        num = 4;
        res = "IV";
        assertEquals(DigitalToRomanConverter.digitalToRoman(num), res);
        num = 5;
        res = "V";
        assertEquals(DigitalToRomanConverter.digitalToRoman(num), res);
        num = 6;
        res = "VI";
        assertEquals(DigitalToRomanConverter.digitalToRoman(num), res);
        num = 7;
        res = "VII";
        assertEquals(DigitalToRomanConverter.digitalToRoman(num), res);
        num = 8;
        res = "VIII";
        assertEquals(DigitalToRomanConverter.digitalToRoman(num), res);
        num = 9;
        res = "IX";
        assertEquals(DigitalToRomanConverter.digitalToRoman(num), res);
        num = 10;
        res = "X";
        assertEquals(DigitalToRomanConverter.digitalToRoman(num), res);
        num = 11;
        res = "XI";
        assertEquals(DigitalToRomanConverter.digitalToRoman(num), res);
        num = 18;
        res = "XVIII";
        assertEquals(DigitalToRomanConverter.digitalToRoman(num), res);
        num = 19;
        res = "XIX";
        assertEquals(DigitalToRomanConverter.digitalToRoman(num), res);
        num = 99;
        res = "XCIX";
        assertEquals(DigitalToRomanConverter.digitalToRoman(num), res);
        num = 299;
        res = "CCXCIX";
        assertEquals(DigitalToRomanConverter.digitalToRoman(num), res);
        num = 875;
        res = "DCCCLXXV";
        assertEquals(DigitalToRomanConverter.digitalToRoman(num), res);
        num = 1396;
        res = "MCCCXCVI";
        assertEquals(DigitalToRomanConverter.digitalToRoman(num), res);
        num = 3566;
        res = "MMMDLXVI";
        assertEquals(DigitalToRomanConverter.digitalToRoman(num), res);
    }

    @Test
    public void romanToDigital() throws Exception {
        Integer res = 1;
        String str = "I";
        assertEquals(DigitalToRomanConverter.romanToDigital(str), res);
        res = 2;
        str = "II";
        assertEquals(DigitalToRomanConverter.romanToDigital(str), res);
        res = 3;
        str = "III";
        assertEquals(DigitalToRomanConverter.romanToDigital(str), res);
        res = 4;
        str = "IV";
        assertEquals(DigitalToRomanConverter.romanToDigital(str), res);
        res = 5;
        str = "V";
        assertEquals(DigitalToRomanConverter.romanToDigital(str), res);
        res = 6;
        str = "VI";
        assertEquals(DigitalToRomanConverter.romanToDigital(str), res);
        res = 7;
        str = "VII";
        assertEquals(DigitalToRomanConverter.romanToDigital(str), res);
        res = 8;
        str = "VIII";
        assertEquals(DigitalToRomanConverter.romanToDigital(str), res);
        res = 9;
        str = "IX";
        assertEquals(DigitalToRomanConverter.romanToDigital(str), res);
        res = 10;
        str = "X";
        assertEquals(DigitalToRomanConverter.romanToDigital(str), res);
        res = 11;
        str = "XI";
        assertEquals(DigitalToRomanConverter.romanToDigital(str), res);
        res = 18;
        str = "XVIII";
        assertEquals(DigitalToRomanConverter.romanToDigital(str), res);
        res = 19;
        str = "XIX";
        assertEquals(DigitalToRomanConverter.romanToDigital(str), res);
        res = 99;
        str = "XCIX";
        assertEquals(DigitalToRomanConverter.romanToDigital(str), res);
        res = 299;
        str = "CCXCIX";
        assertEquals(DigitalToRomanConverter.romanToDigital(str), res);
        res = 875;
        str = "DCCCLXXV";
        assertEquals(DigitalToRomanConverter.romanToDigital(str), res);
        res = 1396;
        str = "MCCCXCVI";
        assertEquals(DigitalToRomanConverter.romanToDigital(str), res);
        res = 3566;
        str = "MMMDLXVI";
        assertEquals(DigitalToRomanConverter.romanToDigital(str), res);

    }

}