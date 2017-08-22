package Z1_Натуральные_числа;

//  1) Даны натуральное число n, неупорядоченная последовательность действительных чисел a1,…,an.
//  Получить все натуральные числа k (2≤k≤n-1), для которых ak-1<ak<ak+1. [2]

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class NaturalIntegers {
    public static void main(String[] args) throws IOException {
        int n;
        int[] nums;
        int[] result;

        // ввод ланных
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Введите число n: ");
            n = Integer.parseInt(reader.readLine());
            if (n < 3) {
                throw new NumberFormatException(); // по хорошему можно создать свой Exception
            }
            nums = new int[n];
            System.out.println("Введите последовательность чисел.");
            for (int i = 0; i < n; i++) {
                System.out.printf("Вводится число %d из %d: ", i + 1, n);
                nums[i] = Integer.parseInt(reader.readLine());
            }
            reader.close();
        } catch (NumberFormatException e) {
            System.out.println("Введены неверные данные");
            return;
        }

        // обработка
        System.out.println("Выполняется обработка...");
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i < n - 1; i++) {
            if (nums[i - 1] < nums[i] && nums[i] < nums[i + 1])
                list.add(nums[i]);
        }
        result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        // вывод
        System.out.println("Результат:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
