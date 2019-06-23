package commons;

import java.util.Optional;

public class Parsers {

    public static Optional<Double> doubleParameterParser(String parameter) {
        try {
            Double temp = Double.valueOf(parameter);
            return Optional.of(temp);
        } catch (NumberFormatException e) {
            return Optional.empty();
        }
    }

    public static Optional<Integer> intParameterParser(String parameter) {
        try {
            Integer temp = Integer.valueOf(parameter);
            return Optional.of(temp);
        } catch (NumberFormatException e) {
            return Optional.empty();
        }
    }
}
