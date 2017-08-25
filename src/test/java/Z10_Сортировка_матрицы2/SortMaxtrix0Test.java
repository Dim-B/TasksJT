package Z10_Сортировка_матрицы2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SortMaxtrix0Test {
    @Test
    public void sort0Matrix() throws Exception {
        int[][] a = new int[][]{
                {4, 9, 8, 1, 0},
                {1, 1, 8, 0, 3},
                {0, 6, 1, 8, 7},
                {4, 7, 9, 2, 9},
                {2, 0, 8, 4, 1},
                {1, 5, 0, 7, 6}};
        int[][] res = new int[][]{
                {0, 6, 1, 8, 7},
                {2, 0, 8, 4, 1},
                {1, 5, 0, 7, 6},
                {1, 1, 8, 0, 3},
                {4, 9, 8, 1, 0},
                {4, 7, 9, 2, 9}};
        assertEquals(res, SortMaxtrix0.sort0Matrix(a));

    }

}