package ana_zosidze;
import ana_zosidze.CalculatorService;
public class main {
    public static void main(String[] args) {


        double x=15;
        double y=20;

        CalculatorService dsum = new CalculatorService();
        double z = dsum.sum(x, y);
        System.out.println(z);
        z = dsum.divide(x, y);
        System.out.println(z);
    }
}