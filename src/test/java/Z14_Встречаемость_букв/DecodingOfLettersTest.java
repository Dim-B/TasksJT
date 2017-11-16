package Z14_Встречаемость_букв;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class DecodingOfLettersTest {

    @Test
    public void countingOfLettersTest() throws Exception {
        String s = "";
        List<Character> list = Collections.emptyList();
        assertEquals(list, DecodingOfLetters.countingOfLetters(s));
        s = "фыва";
        list = new ArrayList<Character>(Arrays.asList('ф','ы','в','а'));
        assertEquals(list, DecodingOfLetters.countingOfLetters(s));
        s = "Когда человек сознательно или интуитивно выбирает себе в жизни какую-то цель, жизненную задачу, он невольно дает себе оценку. По тому, ради чего человек живет, можно судить и о его самооценке - низкой или высокой. Если человек живет, чтобы приносить людям добро, облегчать их страдания, давать людям радость, то он оценивает себя на уровне этой своей человечности. Он ставит себе цель, достойную человека. Только такая цель позволяет человеку прожить свою жизнь с достоинством и получить настоящую радость. Да, радость! Подумайте: если человек ставит себе задачей увеличивать в жизни добро, приносить людям счастье, какие неудачи могут его постигнуть? Не тому помочь? Но много ли людей не нуждаются в помощи? Если жить только для себя, своими мелкими заботами о собственном благополучии, то от прожитого не останется и следа. Если же жить для других, то другие сберегут то, чему служил, чему отдавал силы. Можно по-разному определять цель своего существования, но цель должна быть. Надо иметь и принципы в жизни. Одно правило в жизни должно быть у каждого человека, в его цели жизни, в его принципах жизни, в его поведении: надо прожить жизнь с достоинством, чтобы не стыдно было вспоминать. Достоинство требует доброты, великодушия, умения не быть эгоистом, быть правдивым, хорошим другом, находить радость в помощи другим. Ради достоинства жизни надо уметь отказываться от мелких удовольствий и немалых тоже… Уметь извиняться, признавать перед другими ошибку - лучше, чем врать. Обманывая, человек прежде всего обманывает самого себя, ибо он думает, что успешно соврал, а люди поняли и из деликатности промолчали. Жизнь - прежде всего творчество, но это не значит, что каждый человек, чтобы жить, должен родиться художником, балериной или ученым. Можно творить просто добрую атмосферу вокруг себя. Человек может принести с собой атмосферу подозрительности, какого-то тягостного молчания, а может внести сразу радость, свет. Вот это и есть творчество.";
        list = new ArrayList<Character>(Arrays.asList('о', 'е', 'и', 'т', 'н', 'с', 'а', 'в', 'л', 'д', 'р', 'ь', 'м', 'у', 'ч', 'ж', 'к', 'п', 'б', 'г', 'я', 'з', 'ы', 'ю', 'й', 'ц', 'х', 'ш', 'э', 'щ', 'ф'));
        assertEquals(list, DecodingOfLetters.countingOfLetters(s));
    }

}