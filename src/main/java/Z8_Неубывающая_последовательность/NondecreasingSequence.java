package Z8_Неубывающая_последовательность;

//  8) В массиве B[25] определить начальный и конечный индексы элементов, составляющих максимальную по длине
//  неубывающую последовательность. Вывести на экран массив В и найденную последовательность. [4]

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class NondecreasingSequence {
    public static void main(String[] args) throws IOException {

        int[] b = new int[25];

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

        // вывод
        System.out.println("Введенный массив:");
        for (int i : b) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Максимальная по длинне неубывающая последовательность в массиве:");
        ArrayList<Integer> result = getNondecreasingSequence(b);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public static ArrayList<Integer> getNondecreasingSequence(int[] b) {
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
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = start; i <= end; i++) {
            result.add(b[i]);
        }
        return result;
    }
}
