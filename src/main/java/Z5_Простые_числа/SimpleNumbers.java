package Z5_Простые_числа;

//  5) Ввести целые числа N и M. Определить являются ли они взаимно простыми, то есть не имеют общих делителей. [4]

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleNumbers {
    public static void main(String[] args) throws IOException {
        int n;
        int m;

        // ввод ланных
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Введите число n: ");
            n = Integer.parseInt(reader.readLine());
            System.out.print("Введите число m: ");
            m = Integer.parseInt(reader.readLine());
            reader.close();
        } catch (NumberFormatException e) {
            System.out.println("Введены неверные данные");
            return;
        }

        // обработка
        if (nod(n, m) == 1)
            System.out.printf("Числа %d и %d являются взаимно простыми.", n, m);
        else
            System.out.printf("Числа %d и %d НЕ являются взаимно простыми. НОД = %d", n, m, nod(n, m));
    }

    public static int nod(int a, int b) {
        if (b == 0)
            return Math.abs(a);
        return nod(b, a % b);
    }
}
