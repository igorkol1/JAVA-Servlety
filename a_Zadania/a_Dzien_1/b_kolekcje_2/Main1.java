package a_Zadania.a_Dzien_1.b_kolekcje_2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main1 {

    private static int count = 0;

    public static void main(String[] args) {
        Set<String> userStrings = getUserStrings();
        printResult(userStrings);
    }

    private static Set<String> getUserStrings() {
        Set<String> userStrings = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        String userString;
        while (true) {
            System.out.println("Add word: ");
            userString = scanner.nextLine();
            if (!userString.equals("exit")) {
                userStrings.add(userString);
                count++;
            } else {
                return userStrings;
            }
        }
    }

    private static void printResult(Set<String> stringSet) {
        System.out.println("Entered strings: ");
        stringSet.forEach(System.out::println);
        System.out.println("Entered words number: " + count);
        System.out.println("Size of colection: " + stringSet.size());

    }

}
