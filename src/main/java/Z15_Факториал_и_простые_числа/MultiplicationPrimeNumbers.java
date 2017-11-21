package Z15_Факториал_и_простые_числа;

/*
15) Ввести натуральное число N. Определить можно ли представить N! в виде произведения трех последовательных простых чисел.[5]

В тип данных long вмещается значение факториала чисел до 20 включительно.
Для этих значений не найдены три последовательных простых числа произведение которых давало бы N!.
Поэтому решено было искать числа не для N!, а для N.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class MultiplicationPrimeNumbers {
    public static void main(String[] args) throws IOException {
        int n;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Введите число N: ");
            n = Integer.parseInt(reader.readLine());
            reader.close();
        } catch (NumberFormatException e) {
            System.out.println("Введены неверные данные");
            return;
        }

        long nFact = fact(n);
        System.out.printf("Факториал числа N равен %d%n", nFact);

        ArrayList<Integer> triplePrimeNum = nToProductTriplePrimeNum(n);
        if (triplePrimeNum.isEmpty())
            System.out.printf("Число %d нельзя представить в виде произведения трех последовательных простых чисел", n);
        else
            System.out.printf("Число %d можно представить в виде произведения следующих последовательных простых чисел: %d, %d, %d", n, triplePrimeNum.get(0), triplePrimeNum.get(1), triplePrimeNum.get(2));
    }

    public static long fact(int n) {
        if (n < 0)
            return -1;
        else if (n == 1 || n == 0)
            return 1;
        else
            return n * fact(n - 1);
    }

    public static ArrayList<Integer> nToProductTriplePrimeNum(long n) {
        ArrayList<Integer> triplePrime = new ArrayList<Integer>(Arrays.asList(2, 3, 5));
        long prod = triplePrime.get(0) * triplePrime.get(1) * triplePrime.get(2);
        while (prod < n) {
            int del = triplePrime.remove(0);
            triplePrime.add(nextPrimeNumber(del));
            prod = prod / del * triplePrime.get(2);
        }
        if (prod == n)
            return triplePrime;
        else
            return new ArrayList<Integer>();
    }

    public static int nextPrimeNumber(int n) {
        if (n % 2 == 0 || n == 1)
            n++;
        else
            n += 2;

        while (!isPrimeNumber(n))
            n += 2;
        return n;
    }

    public static boolean isPrimeNumber(int n) {
        if (n <= 1)
            return false;
        else if (n == 2)
            return true;
        else if (n % 2 == 0)
            return false;
        double maxDiv = Math.ceil(Math.sqrt(n));
        for (int i = 3; i <= maxDiv; i += 2)
            if (n % i == 0)
                return false;
        return true;
    }
}
