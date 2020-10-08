
package ana_zosidze;

public class CalculatorService {
    static double z;

    public static double sum(double x, double y) {
        z = x + y;
        return z;
    }

    public static double divide(double x, double y) {
        z = x / y;
        return z;
    }
}

