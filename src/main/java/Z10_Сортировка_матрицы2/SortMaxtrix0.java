package Z10_Сортировка_матрицы2;

//  10) В файле, имя которого задается с клавиатуры, записаны размеры матрицы и сама матрица.
//  Известно, что в каждой строке и в каждом столбце есть единственный нулевой элемент.
//  Переставить строки так, чтобы эти элементы оказались на главной диагонали. [4]
//
//  Примечание: "...в каждой строке и в каждом столбце есть единственный нулевой элемент".
//  Исходя из этого можно сделать вывод что матрица квадратная,
//  однако я предусмотрел и работу с прямоугольными матрицами.
//  У них не будет нуля в строках или столбцах за пределами главной диагонали

import java.io.*;

public class SortMaxtrix0 {
    public static void main(String[] args) throws IOException {
        int n;
        int m;
        int[][] a;
        String file;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Введите путь к файлу или нажмите ввод для использования файла по умолчанию \n" +
                    "[src/main/resources/matrix.txt]: ");
            file = reader.readLine();
            if (file.equals(""))
                file = "src/main/resources/matrix.txt";
            if (!new File(file).exists()) {
                throw new FileNotFoundException("Указанный файл не найден");
            }
            reader.close();

            reader = new BufferedReader(new FileReader(file));
            String size = reader.readLine();
            if (size.split(" ").length != 2)
                throw new InvalidFileStructureException
                        ("Неверная структура файла. Неверно задан размер матрицы");
            n = Integer.parseInt(size.split(" ")[0]);
            m = Integer.parseInt(size.split(" ")[1]);
            a = new int[n][m];

            for (int i = 0; i < n; i++) {
                String tmp = reader.readLine();
                String[] line = tmp.split(" ");
                if (line.length != m)
                    throw new InvalidFileStructureException
                            ("Неверная структура файла. Неверное количество элементов в строке " + i);
                for (int j = 0; j < m; j++) {
                    a[i][j] = Integer.parseInt(line[j]);
                }
            }
            if (reader.readLine() != null)
                throw new InvalidFileStructureException
                        ("Неверная структура файла. Лишние строки в конце файла");
            int count0InLine = 0;
            int count0InMatrix = 0;
            int count0InColumn = 0;
            for (int[] i : a) {
                for (int j : i) {
                    if (j == 0) count0InLine++;
                }
                if ((n <= m && count0InLine != 1) || (n > m && count0InLine > 1))
                    throw new InvalidFileStructureException
                            ("Неверная структура файла. Неправильно распределены нули по строкам.");
                count0InMatrix += count0InLine;
                count0InLine = 0;
            }
            if (count0InMatrix > (n <= m ? n : m))
                throw new InvalidFileStructureException
                        ("Неверная структура файла. Не соответствует количество нулей.");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (a[j][i] == 0) count0InColumn++;
                }
                if ((m <= n && count0InColumn != 1) || (m > n && count0InColumn > 1))
                    throw new InvalidFileStructureException
                            ("Неверная структура файла. Неправильно распределены нули по столбцам.");
                count0InColumn = 0;
            }
            reader.close();
        } catch (FileNotFoundException | InvalidFileStructureException e) {
            System.out.println(e.getMessage());
            return;
        } catch (NumberFormatException e) {
            System.out.println("Неверная структура файла. Символы отличные от цифр в массиве");
            return;
        } finally {
            reader.close();
        }

        System.out.println("Исходная матрица:");
        printMatrix(a);

        sort0Matrix(a);

        System.out.println("Отсортированная матрица:");
        printMatrix(a);
    }

    public static int[][] sort0Matrix(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    if (a[j][k] == 0) break;
                    if (a[j + 1][k] == 0) {
                        int[] tmp = a[j + 1];
                        a[j + 1] = a[j];
                        a[j] = tmp;
                        break;
                    }
                }
            }
        }
        return a;
    }

    public static void printMatrix(int a[][]){
        for (int[] i : a) {
            for (int j : i) {
                System.out.printf("%3d ", j);
            }
            System.out.println();
        }
    }
}

