package a_Zadania.a_Dzien_1.c_Wyrazenia_regularne;

public class Main1 {

    private static final String EMAIL_REGEX = "[_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*\\.([a-zA-Z]{2,}){1}";

    public static void main(String[] args) {
        String[] emails = {"test", "test @", "@test", "@@test", "test@@test", "test@test", "test.pl", "test@test.pl"};
        for (String email : emails) {
            System.out.println("Email " + email + " " + verifyEmail(email));
        }
    }

    private static boolean verifyEmail(String email) {
        return email.matches(EMAIL_REGEX);
    }
}
