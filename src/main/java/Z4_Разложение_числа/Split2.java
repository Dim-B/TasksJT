package Z4_Разложение_числа;

//  4) Разложение любого числа в сумму степеней двойки. [4]

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Split2 {
    public static void main(String[] args) throws IOException {
        int n;

        // ввод ланных
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Введите число: ");
            n = Integer.parseInt(reader.readLine());
            if (n <= 0) throw new NumberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Введены неверные данные");
            return;
        }

        // обработка
        String result = n + " = ";
        double b = n;
        while (b != 0) {
            int a = 1;
            int i;
            for (i = 0; a <= b; i++) {
                a *= 2;
            }
            if (a > 1) {
                a = a / 2;
                i -= 1;
            }
            result += "2^" + i + " + ";
            b = b - a;
        }

        System.out.println(result.substring(0, result.length() - 3));
    }
}
