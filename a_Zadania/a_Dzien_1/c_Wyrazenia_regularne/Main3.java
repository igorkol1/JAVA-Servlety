package a_Zadania.a_Dzien_1.c_Wyrazenia_regularne;

//W pliku Main3.java
//
//        Napisz program, który będzie przyjmował linie z konsoli, do momentu wpisania quit.
//        Przy pomocy metody replaceAll usuń z podanego wyrażenia znaki białe (np. spacje).
//        Program ma sprawdzać czy wpisany napis jest poprawnym działaniem matematycznym, np:
//        2+3 - 1 = 4
//        2 + 2 =4
//        1+ 1 =2
//        3-1 + 2 =122
//        2 * 4- 2 = 6
//        6 / 3 + 10 = 12
//        Możesz dokończyć wyrażenie :
//
//private static final String REGEX = "(\\d[\\/*])*\\d=";
//        Jeżeli wyrażenie jest poprawny działaniem matematycznym zapisz je do pliku o nazwie operations.txt.
//        Pomijamy sprawdzanie poprawności wyniku, istotna jest poprawność składniowa.

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main3 {

    private static final String REGEX = "(\\d[\\/*])*\\d=\\d";

    public static void main(String[] args) {
        getExpresions();
    }

    private static void getExpresions(){
        Scanner scanner = new Scanner(System.in);
        String expresion;
        while (true){
            System.out.println("Write expression: ");
            expresion = scanner.nextLine();
            if (!expresion.equals("exit")) {
                if(checkExpresion(expresion)){
                    saveExpression(expresion);
                }else {
                    System.out.println("This is not math expresion");
                }
            } else {
                break;
            }
        }
    }

    private static boolean checkExpresion(String expresion){
        return expresion.matches(REGEX);
    }

    private static void saveExpression(String expresion){

    }

}
