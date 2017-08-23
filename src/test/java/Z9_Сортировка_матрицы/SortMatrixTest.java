package Z9_Сортировка_матрицы;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SortMatrixTest {
    @Test
    public void sortAboveDiagonal() throws Exception {
        int[][] a = new int[][]{
                { 1,  2,  3,  4,  5,  6},
                { 7,  8,  9, 10, 11, 12},
                {13, 14, 15, 16, 17, 18},
                {19, 20, 21, 22, 23, 24},
                {25, 26, 27, 28, 29, 30},
                {31, 32, 33, 34, 35, 36}};
        int[][] res = new int[][]{
                { 1, 30, 24, 23, 18, 17},
                { 7,  8, 16, 12, 11, 10},
                {13, 14, 15,  9,  6,  5},
                {19, 20, 21, 22,  4,  3},
                {25, 26, 27, 28, 29,  2},
                {31, 32, 33, 34, 35, 36}};
        assertEquals(res, SortMatrix.sortAboveDiagonal(a));
    }

}