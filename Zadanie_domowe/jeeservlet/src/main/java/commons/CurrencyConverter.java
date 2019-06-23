package commons;

public class CurrencyConverter {

    private static final double EURUSD = 1.1368;
    private static final double USDEUR = 0.87933;
    private static final double EURPLN = 4.25420;
    private static final double PLNEUR = 0.23506;
    private static final double USDPLN = 3.74085;
    private static final double PLNUSD = 0.26732;

    public static double convert(double amount, String conversionType) {
        switch (conversionType) {
            case "EURUSD":
                return amount * EURUSD;
            case "USDEUR":
                return amount * USDEUR;
            case "EURPLN":
                return amount * EURPLN;
            case "PLNEUR":
                return amount * PLNEUR;
            case "USDPLN":
                return amount * USDPLN;
            case "PLNUSD":
                return amount * PLNUSD;
            default:
                return -1;
        }
    }

}
