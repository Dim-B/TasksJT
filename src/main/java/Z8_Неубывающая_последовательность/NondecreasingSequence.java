package Z8_Неубывающая_последовательность;

//  8) В массиве B[25] определить начальный и конечный индексы элементов, составляющих максимальную по длине
//  неубывающую последовательность. Вывести на экран массив В и найденную последовательность. [4]

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NondecreasingSequence {
    public static void main(String[] args) throws IOException {

        int[] b = new int[25];

        // ввод ланных
        if (false) {
            b = new int[]{1, 2, 3, 3, 0, 5, 6, 5, 5, 5, 8, 9, 9, 9, 9, 9, 1, 4, 2, 3, 5, 4, 2, 7, 5};
        } else {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            try {
                System.out.print("Введите число n: ");
                System.out.println("Введите элементы массива.");
                for (int i = 0; i < 25; i++) {
                    System.out.printf("Вводится элемент %d из %d: ", i + 1, 25);
                    b[i] = Integer.parseInt(reader.readLine());
                }
                reader.close();
            } catch (NumberFormatException e) {
                System.out.println("Введены неверные данные");
                return;
            }
        }
        // обработка
        System.out.println("Выполняется обработка...");
        int start = 0;
        int end = 0;
        int len = 0;
        int bStart = 0;
        int bLen = 0;
        for (int i = 0; i < 24; i++) {
            if (b[i] <= b[i + 1]) {
                if (bLen == 0) bStart = i;
                bLen++;
            } else {
                if (bLen > len) {
                    len = bLen;
                    start = bStart;
                    end = i;
                }
                bLen = 0;
            }
        }

        // вывод
        System.out.println("Введенный массив:");
        for (int i : b) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Максимальная по длинне неубывающая последовательность в массиве:");
        for (int i = start; i <= end; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
