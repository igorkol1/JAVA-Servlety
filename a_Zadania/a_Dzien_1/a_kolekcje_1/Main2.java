package a_Zadania.a_Dzien_1.a_kolekcje_1;

import java.util.ArrayList;
import java.util.List;

public class Main2 {

    private static List<Integer> elements = new ArrayList<>();

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            elements.add(i);
        }
        removeDivider(elements, 2);
    }

    public static void removeDivider(List<Integer> list, int divider) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % divider == 0) {
                list.remove(i);
            }
        }
        list.forEach(System.out::println);
    }

}
