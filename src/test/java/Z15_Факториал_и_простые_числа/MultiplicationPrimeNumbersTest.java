package Z15_Факториал_и_простые_числа;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class MultiplicationPrimeNumbersTest {

    @Test
    public void fact() throws Exception {
        int n = 1;
        int nFact = 1;
        assertEquals(nFact, MultiplicationPrimeNumbers.fact(n));
        n = 2;
        nFact = 2;
        assertEquals(nFact, MultiplicationPrimeNumbers.fact(n));
        n = 6;
        nFact = 720;
        assertEquals(nFact, MultiplicationPrimeNumbers.fact(n));
        n = 0;
        nFact = 1;
        assertEquals(nFact, MultiplicationPrimeNumbers.fact(n));

    }

    @Test
    public void nToProductTriplePrimeNum() throws Exception {
        int n = 30;
        ArrayList<Integer> res = new ArrayList<Integer>(Arrays.asList(2, 3, 5));
        assertEquals(res, MultiplicationPrimeNumbers.nToProductTriplePrimeNum(n));
        n = 1001;
        res = new ArrayList<Integer>(Arrays.asList(7, 11, 13));
        assertEquals(res, MultiplicationPrimeNumbers.nToProductTriplePrimeNum(n));
        n = 2431;
        res = new ArrayList<Integer>(Arrays.asList(11, 13, 17));
        assertEquals(res, MultiplicationPrimeNumbers.nToProductTriplePrimeNum(n));
        n = 2430;
        res = new ArrayList<Integer>();
        assertEquals(res, MultiplicationPrimeNumbers.nToProductTriplePrimeNum(n));
    }

    @Test
    public void nextPrimeNumber() throws Exception {
        int n = 1;
        int res = 2;
        assertEquals(res, MultiplicationPrimeNumbers.nextPrimeNumber(n));
        n = 2;
        res = 3;
        assertEquals(res, MultiplicationPrimeNumbers.nextPrimeNumber(n));
        n = 3;
        res = 5;
        assertEquals(res, MultiplicationPrimeNumbers.nextPrimeNumber(n));
        n = 5;
        res = 7;
        assertEquals(res, MultiplicationPrimeNumbers.nextPrimeNumber(n));
        n = 8;
        res = 11;
        assertEquals(res, MultiplicationPrimeNumbers.nextPrimeNumber(n));
        n = 100;
        res = 101;
        assertEquals(res, MultiplicationPrimeNumbers.nextPrimeNumber(n));
        n = 10110;
        res = 10111;
        assertEquals(res, MultiplicationPrimeNumbers.nextPrimeNumber(n));
        n = 1100100;
        res = 1100101;
        assertEquals(res, MultiplicationPrimeNumbers.nextPrimeNumber(n));
    }


    @Test
    public void isPrimeNumber() throws Exception {
        int n = 1;
        boolean res = false;
        assertEquals(res, MultiplicationPrimeNumbers.isPrimeNumber(n));
        n = 2;
        res = true;
        assertEquals(res, MultiplicationPrimeNumbers.isPrimeNumber(n));
        n = 3;
        res = true;
        assertEquals(res, MultiplicationPrimeNumbers.isPrimeNumber(n));
        n = 4;
        res = false;
        assertEquals(res, MultiplicationPrimeNumbers.isPrimeNumber(n));
        n = 5;
        res = true;
        assertEquals(res, MultiplicationPrimeNumbers.isPrimeNumber(n));
        n = 6;
        res = false;
        assertEquals(res, MultiplicationPrimeNumbers.isPrimeNumber(n));
        n = 7;
        res = true;
        assertEquals(res, MultiplicationPrimeNumbers.isPrimeNumber(n));
        n = 8;
        res = false;
        assertEquals(res, MultiplicationPrimeNumbers.isPrimeNumber(n));
        n = 9;
        res = false;
        assertEquals(res, MultiplicationPrimeNumbers.isPrimeNumber(n));
        n = 101;
        res = true;
        assertEquals(res, MultiplicationPrimeNumbers.isPrimeNumber(n));
        n = 10111;
        res = true;
        assertEquals(res, MultiplicationPrimeNumbers.isPrimeNumber(n));
        n = 1011001;
        res = true;
        assertEquals(res, MultiplicationPrimeNumbers.isPrimeNumber(n));
        n = 1100100;
        res = false;
        assertEquals(res, MultiplicationPrimeNumbers.isPrimeNumber(n));
        n = 1100101;
        res = true;
        assertEquals(res, MultiplicationPrimeNumbers.isPrimeNumber(n));
    }
}