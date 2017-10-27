package Z13_Поиск_строки;

/*
* 13) Ввести строку из n (n≤6) знаков и строку из k (k≤80) знаков.
* Определить количество вхождений строки из n знаков в строку из k знаков. [5]
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindString {
    public static void main(String[] args) {
        String text = "";
        String str = "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Введите текст. Длина [0,80]:");
            text = reader.readLine();
            System.out.print("Введите слово для поиска. Длина [0,6]:");
            str = reader.readLine();
            if (str.length() > 6 || text.length() > 80)
                throw new IOException("Введенные данные не сответствуют условию задачи");
            reader.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return;
        }

        System.out.printf("Искомая строка встречается в тексте %d раз(а)", numberOfEntries(text, str));
    }

    public static int numberOfEntries(String text, String str) {
        if (str.isEmpty() || text.isEmpty() || str.length() > text.length())
            return 0;
        int count = 0;
        int curIndex;
        for (int i = 0; i < text.length(); ) {
            curIndex = text.indexOf(str, i);
            if (curIndex == -1)
                return count;
            else {
                count++;
                i = ++curIndex;
            }
        }
        return count;
    }
}
