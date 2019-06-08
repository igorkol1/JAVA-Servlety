package a_Zadania.a_Dzien_1.a_kolekcje_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main1 {


    public static void main(String[] args) {
        List<Integer> elements = new ArrayList<>();
        for (int i = 10; i < 20; i++) {
            elements.add(i);
        }

        System.out.println("\nWypisanie za pomocą for");
        for (int i = 0; i < elements.size(); i++) {
            System.out.println(elements.get(i));
        }

        Iterator<Integer> iterator = elements.iterator();

        System.out.println("\nWypisanie za pomocą while (iterator");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        iterator = elements.iterator();
        System.out.println("\nWypisanie za pomocą for (iterator)");
        for (int i = 0; i < elements.size(); i++) {
            System.out.println(iterator.next());
        }

        System.out.println("\nWypisanie za pomocą foreach");
        elements.forEach(System.out::println);


    }
}
