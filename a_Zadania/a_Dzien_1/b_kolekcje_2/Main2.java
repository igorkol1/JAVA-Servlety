package a_Zadania.a_Dzien_1.b_kolekcje_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main2 {

    public static void main(String[] args) {
        Map<String, String> oppositeMap = initializeOppositeMap();
        int score = getUserAnsers(oppositeMap);
        System.out.println("Score: " + score);

    }

    public static Map<String, String> initializeOppositeMap() {
        Map<String, String> oppositeMap = new HashMap<>();
        oppositeMap.put("hot", "cold");
        oppositeMap.put("plus", "minus");
        oppositeMap.put("water", "fire");
        oppositeMap.put("dirty", "clean");
        oppositeMap.put("strong", "weak");
        return oppositeMap;
    }

    private static int getUserAnsers(Map<String, String> oppositeMap) {
        int score = 0;
        String answer;
        Set<String> keys = oppositeMap.keySet();
        Scanner scanner = new Scanner(System.in);
        for (String key : keys) {
            System.out.println("Write opposite to " + key + ": ");
            answer = scanner.nextLine();
            if (oppositeMap.get(key).equals(answer)) {
                System.out.println("Correct answer\n");
                score++;
            } else {
                System.out.println("Incorect answer\n");
            }
        }
        return score;
    }

}
