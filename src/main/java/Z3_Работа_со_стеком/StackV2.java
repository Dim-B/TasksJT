package Z3_Работа_со_стеком;

//  3) Написать класс для работы со стеком:
//     -добавление элемента в стек;
//     -удаление элемента из стека.
//  На примере продемонстрировать работу с этим классом. [3]

import java.util.Stack;

public class StackV2<E> extends Stack<E>{
    public StackV2() {
    }

    // Не понял суть задания. В кслассе Stack есть методы для добавления элементов унаследованные из класса Vector

    public static void main(String[] args) {
        StackV2<String> stackV2 = new StackV2<String>();
        System.out.println(stackV2);
        String s1 = "Я";
        String s2 = "будущий";
        String s3 = "программист";
        stackV2.add(s1);
        stackV2.add(s2);
        stackV2.add(s3);
        System.out.println(stackV2);
        stackV2.remove(s2);
        System.out.println(stackV2);
    }
}
