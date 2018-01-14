package Z2_Совершенные_числа;

//  2) Найти совершенные числа на отрезке [n1, n2].
//  Число называется со-вершенным если оно равно сумме своих делителей, включая 1, но не включая самого себя.[3]

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PerfectNumbers {
    public static void main(String[] args) throws IOException {
        long n1;
        long n2;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Введите число n1: ");
            n1 = Long.parseLong(reader.readLine());
            System.out.print("Введите число n2: ");
            n2 = Long.parseLong(reader.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Введены неверные данные");
            return;
        }

        // обработка и вывод
        System.out.println("Выполняется обработка...");
        ArrayList<Long> result = getPerfect(n1, n2);
        if (result.isEmpty())
            System.out.println("На данном интервале нет совершенных чисел.");
        else {
            System.out.println("На данном интервале найдены следующие совершенные числа:");
            for (long l : result) {
                System.out.println(l);
            }
        }
    }

    public static ArrayList<Long> getPerfect(long n1, long n2) {
        ArrayList<Long> list = new ArrayList<Long>();
        for (long i = n1; i <= n2; i++) {
            long s = 0;
            for (long j = 1; j < i; j++) {
                if (i % j == 0) s += j;
            }
            if (i != 0 && s == i) {
                list.add(i);
            }
        }
        return list;
    }
}
