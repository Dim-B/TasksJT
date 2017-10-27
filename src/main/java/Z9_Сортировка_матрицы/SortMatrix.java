package Z9_Сортировка_матрицы;

//  В main ввести матрицу X[n][n]. В функции рассортировать все элементы лежащие выше главной диагонали в порядке убывания. [4]

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SortMatrix {
    public static void main(String[] args) throws IOException {
        int n;
        int[][] x;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Введите число n: ");
            n = Integer.parseInt(reader.readLine());
            if (n < 1) {
                throw new NumberFormatException();
            }
            x = new int[n][n];
            System.out.println("Введите элементы матрицы X:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.printf("Введите элемент A[%d][%d]: ", i, j);
                    x[i][j] = Integer.parseInt(reader.readLine());
                }
            }
            reader.close();
        } catch (NumberFormatException e) {
            System.out.println("Введены неверные данные");
            return;
        }

        System.out.println("Исходная матрица: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d ", x[i][j]);
            }
            System.out.println();
        }

        x = sortAboveDiagonal(x);
        System.out.println("Отсортированная матрица: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d ", x[i][j]);
            }
            System.out.println();
        }

    }

    public static int[][] sortAboveDiagonal(int[][] x) {
        int n = x.length;
        int[] a = new int[(n * n - n) / 2];
        int m = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j > i) a[m++] = x[i][j];
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m-1 - i; j++) {
                if (a[j] < a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }
            }
        }
        m = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j > i) x[i][j] = a[m++];
            }
        }
        return x;
    }
}
