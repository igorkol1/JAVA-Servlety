import com.google.common.base.Converter;
import com.google.common.math.IntMath;
import org.apache.log4j.Logger;

import java.math.RoundingMode;

import static com.google.common.math.IntMath.pow;

public class Main {

    public static void main(String[] args) {
//        LogExample logExample = new LogExample();
//        logExample.runExample();
//
//        JsoupExample jsoupExample = new JsoupExample();
//        jsoupExample.runExample();

        //guava example

        System.out.println("Log2(2): " + IntMath.log2(2, RoundingMode.HALF_EVEN));

        System.out.println("Log10(10): " + IntMath.log10(10, RoundingMode.HALF_EVEN));

        System.out.println("sqrt(100): " + IntMath.sqrt(IntMath.pow(10, 2), RoundingMode.HALF_EVEN));

        System.out.println("gcd(100,50): " + IntMath.gcd(100, 50));

        System.out.println("modulus(100,50): " + IntMath.mod(100, 50));

        System.out.println("factorial(5): " + IntMath.factorial(5));


    }
}
