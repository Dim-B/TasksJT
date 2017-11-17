package Z14_Встречаемость_букв;

/*
* 14) Введите строку из N символов. В функции определить и вывести на экран частоту встречаемости каждой буквы русского
* алфавита. Определить 5 наиболее часто встречающихся букв. Далее, по предоставленному шифру (вы знаете, что каждой
* букве русского языка соответствует 1 символ в шифре), попробовать расшифровать изначальный текст. [5]
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class DecodingOfLetters {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите строку: ");
        String str = reader.readLine();

        List<Character> listKey = countingOfLetters(str);

        String strEncrypt = encrypt(str);
        System.out.println(strEncrypt);
        String strDecrypt = decrypt(strEncrypt, listKey, 5);
        System.out.println(strDecrypt);
        reader.close();
    }

    public static String encrypt(String str) {
        List<Character> characters = new ArrayList<>(Arrays.asList('а', 'б', 'в', 'г', 'д', 'е', 'ж', 'з', 'и', 'й', 'к',
                'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'));
        Collections.shuffle(characters);

        String strEncrypt = "";

        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            if (characters.contains(ch))
                strEncrypt += characters.get((ch - 'а'));
            else if (characters.contains(Character.toLowerCase(ch)))
                strEncrypt += Character.toUpperCase(characters.get((ch - 'А')));
            else
                strEncrypt += ch;
        }
        return strEncrypt;
    }

    public static String decrypt(String strEncrypt, List<Character> listKey, int precision) {
        List<Character> listEncrypt = countingOfLetters(strEncrypt);
        if (precision < listKey.size()) {
            listKey = listKey.subList(0, precision);
            listEncrypt = listEncrypt.subList(0, precision);
        }

        String strDecrypt = "";

        for (int i = 0; i < strEncrypt.length(); i++) {
            Character ch = strEncrypt.charAt(i);
            if (listEncrypt.contains(ch))
                strDecrypt += listKey.get(listEncrypt.indexOf(ch));
            else if (listEncrypt.contains(Character.toLowerCase(ch)))
                strDecrypt += Character.toUpperCase(listKey.get(listEncrypt.indexOf(Character.toLowerCase(ch))));
            else if ((ch >= 'а' && ch <= 'я') || (ch >= 'А' && ch <= 'Я'))
                strDecrypt += '_';
            else
                strDecrypt += ch;

        }
        return strDecrypt;
    }

    public static List<Character> countingOfLetters(String str) {

        Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

        for (Character ch : str.toCharArray()) {
            ch = Character.toLowerCase(ch);
            if ((ch >= 'а' && ch <= 'я') || (ch >= 'А' && ch <= 'Я'))
                if (map.containsKey(ch))
                    map.put(ch, map.get(ch) + 1);
                else
                    map.put(ch, 1);
        }

        ArrayList<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        List<Character> listCh = new ArrayList<>();

        for (Map.Entry<Character, Integer> e : list) {
            listCh.add(e.getKey());
        }
        System.out.println(map);
        return listCh;
    }
}
