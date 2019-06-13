package pl.coderslab.commons;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.*;

public class Censor {

    //TODO: Get out of path
    private static final String BAD_WORDS_PATH = "/Users/igorkolodziejczyk/Projects/WAR_JEE_W_09_Servlety/servletjee/src/main/java/pl/coderslab/commons/bad_words.txt";

    public String censorString(String text) {
        List<String> badWordsList = loadBadWords();
        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (badWordsList.contains(words[i])) {
                words[i] = replaceWord(words[i]);
            }
        }
        return String.join(" ", words);
    }

    private List<String> loadBadWords() {
        File directory = new File("./");
        System.out.println(directory.getAbsolutePath());
        URL url = getClass().getResource(BAD_WORDS_PATH);
        System.out.println(url);
        File file = new File(BAD_WORDS_PATH);
        List<String> readLines = new ArrayList<String>();
        try (Scanner scan = new Scanner(file)) {
            while (scan.hasNextLine()) {
                String tempStr = scan.nextLine();
                readLines.add(tempStr);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return readLines;
    }

    private String replaceWord(String word) {
        String replacedWord = "";
        for (int i = 0; i < word.length(); i++) {
            replacedWord += "*";
        }
        return replacedWord;
    }
}
