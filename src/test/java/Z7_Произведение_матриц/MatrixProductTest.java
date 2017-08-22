package Z7_Произведение_матриц;

import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixProductTest {
    @Test
    public void productMatrixTest() throws Exception {
        double[][] a = new double[][]{
                {2, 0, -1},
                {0, -2, 2}};
        double[][] b = new double[][]{
                {4, 1, 0},
                {3, 2, 1},
                {0, 1, 0}};
        double[][] res = new double[][]{
                {8, 1, 0},
                {-6, -2, -2}};
        assertEquals(res, MatrixProduct.productMatrix(a, b));
    }

}