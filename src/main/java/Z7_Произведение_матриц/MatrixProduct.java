package Z7_Произведение_матриц;

//  7) В main ввести две матрицы A[n][k] и B[k][m] вещественных чисел.
//  В функции вычислить произведение этих матриц – матрицу C[n][m]. Результат произведения вывести в main. [4]

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

public class MatrixProduct {
    public static void main(String[] args) throws IOException {
        double[][] a;
        double[][] b;
        double[][] c;
        int n, k, m;

        // ввод ланных
        if (false) { // взять готовые массивы или вводить
            a = new double[][]{
                    {2, 0, -1},
                    {0, -2, 2}};
            b = new double[][]{
                    {4, 1, 0},
                    {3, 2, 1},
                    {0, 1, 0}};
            //a*b =  8  1  0
            //      -6 -2 -2
            n = a.length;
            m = b[0].length;
        } else {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            try {
                System.out.print("Введите число n: ");
                n = Integer.parseInt(reader.readLine());
                System.out.print("Введите число k: ");
                k = Integer.parseInt(reader.readLine());
                System.out.print("Введите число m: ");
                m = Integer.parseInt(reader.readLine());
                if (n < 1 || k < 1 || m < 1) {
                    throw new NumberFormatException(); // по хорошему можно создать свой Exception
                }
                a = new double[n][k];
                b = new double[k][m];
                System.out.println("Введите элементы матрицы A:");
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < k; j++) {
                        System.out.printf("Введите элемент A[%d][%d]: ", i, j);
                        a[i][j] = Integer.parseInt(reader.readLine());
                    }
                }
                System.out.println("Введите элементы матрицы B:");
                for (int i = 0; i < k; i++) {
                    for (int j = 0; j < m; j++) {
                        System.out.printf("Введите элемент B[%d][%d]: ", i, j);
                        b[i][j] = Integer.parseInt(reader.readLine());
                    }
                }
                reader.close();
            } catch (NumberFormatException e) {
                System.out.println("Введены неверные данные");
                return;
            }
        }
        //вычисление
        System.out.println("Выполняется вычисление...");
        c = productMatrix(a, b);

        //вывод
        System.out.println("Произведение матриц А и В равно:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf(" %4.2f ", c[i][j]);
            }
            System.out.println();
        }
    }

    private static double[][] productMatrix(double a[][], double b[][]) {
        int n = a.length;
        int k = a[0].length;
        int m = b[0].length;
        double[][] c = new double[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int l = 0; l < k; l++) {
                    c[i][j] += a[i][l] * b[l][j];
                }
            }
        }
        return c;
    }
}
