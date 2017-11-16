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
        String text = "Когда человек сознательно или интуитивно выбирает себе в жизни какую-то цель, жизненную задачу, он невольно дает себе оценку. По тому, ради чего человек живет, можно судить и о его самооценке - низкой или высокой. Если человек живет, чтобы приносить людям добро, облегчать их страдания, давать людям радость, то он оценивает себя на уровне этой своей человечности. Он ставит себе цель, достойную человека. Только такая цель позволяет человеку прожить свою жизнь с достоинством и получить настоящую радость. Да, радость! Подумайте: если человек ставит себе задачей увеличивать в жизни добро, приносить людям счастье, какие неудачи могут его постигнуть? Не тому помочь? Но много ли людей не нуждаются в помощи? Если жить только для себя, своими мелкими заботами о собственном благополучии, то от прожитого не останется и следа. Если же жить для других, то другие сберегут то, чему служил, чему отдавал силы. Можно по-разному определять цель своего существования, но цель должна быть. Надо иметь и принципы в жизни. Одно правило в жизни должно быть у каждого человека, в его цели жизни, в его принципах жизни, в его поведении: надо прожить жизнь с достоинством, чтобы не стыдно было вспоминать. Достоинство требует доброты, великодушия, умения не быть эгоистом, быть правдивым, хорошим другом, находить радость в помощи другим. Ради достоинства жизни надо уметь отказываться от мелких удовольствий и немалых тоже… Уметь извиняться, признавать перед другими ошибку - лучше, чем врать. Обманывая, человек прежде всего обманывает самого себя, ибо он думает, что успешно соврал, а люди поняли и из деликатности промолчали. Жизнь - прежде всего творчество, но это не значит, что каждый человек, чтобы жить, должен родиться художником, балериной или ученым. Можно творить просто добрую атмосферу вокруг себя. Человек может принести с собой атмосферу подозрительности, какого-то тягостного молчания, а может внести сразу радость, свет. Вот это и есть творчество.";

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите строку: ");
        String str = reader.readLine();
        if (str.equals("")) {
            str = text;
            System.out.println(str);
        }

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
