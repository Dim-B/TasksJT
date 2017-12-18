package Z16_Римская_система;

/*
16) Перевод числа в цифровой записи в римскую систему и назад. [6]
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;

public class DigitalToRomanConverter {
    public static void main(String[] args) throws IOException {
        String str;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите число: ");
        str = reader.readLine();
        reader.close();

        if (str.matches("^\\d+$"))
            if (Integer.parseInt(str) > 3999 || Integer.parseInt(str) < 1)
                System.out.println("Поддерживаются только числа в диапазоне от 1 до 3999");
            else
                System.out.printf("Число %s в римской системе счисления: %s%n", str, digitalToRoman(Integer.parseInt(str)));
        else if (str.matches("^(M{0,3})(D?C{0,3}|C[DM])(L?X{0,3}|X[LC])(V?I{0,3}|I[VX])$"))
            System.out.printf("Число %s в десятичной системе счисления: %d%n", str, romanToDigital(str));
        else
            System.out.println("Введенная строка не является числом");
    }

    public static String digitalToRoman(int num) {
        StringBuilder result = new StringBuilder();
        String[] rom = new String[]{"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        int[] dig = new int[]{1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        for (int i = rom.length - 1; i >= 0; i--) {
            while (num >= dig[i]) {
                result.append(rom[i]);
                num -= dig[i];
            }
        }
        return result.toString();
    }

    public static Integer romanToDigital(String str) {
        Integer result = 0;
        LinkedHashMap<Character, Integer> dict = new LinkedHashMap<>();
        dict.put('I', 1);
        dict.put('V', 5);
        dict.put('X', 10);
        dict.put('L', 50);
        dict.put('C', 100);
        dict.put('D', 500);
        dict.put('M', 1000);
        int max = 1000;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (dict.get(ch) > max) {
                result -= 2 * max;
            }
            result += dict.get(ch);
            max = dict.get(ch);
        }
        return result;
    }

}
