package a_Zadania.a_Dzien_1.c_Wyrazenia_regularne;

import java.util.regex.Pattern;

public class Main2 {

    public static void main(String[] args) {
        String[] passwords = {"test", "testTesttest1234", "testtesttest1", "TESTTESTTEST1", "testTesttest1", "TTstTesttest1", "Testtesttest1"};
        for (String password : passwords) {
            System.out.println("Password " + password + " " + verifyPassword(password));
        }
    }

    private static boolean verifyPassword(String password) {
        boolean isCorrect = true;

        //Check lenght
        isCorrect = isCorrect && Pattern.matches(".{10,15}", password);

        //Check small letter exist
        isCorrect = isCorrect && Pattern.matches(".*[a-z].*", password);

        //Check big letter exist
        isCorrect = isCorrect && Pattern.matches(".*[A-Z].*", password);

        //Check two small letters at beggining
        isCorrect = isCorrect && !Pattern.matches("[a-z][a-z].*", password);

        //Check two big letters at beggining
        isCorrect = isCorrect && !Pattern.matches("[A-Z][A-Z].*", password);

        return isCorrect;
    }

}
