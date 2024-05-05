import java.math.BigDecimal;
import java.util.List;

public class Multiplier {
    public static int multiply(int a, int b) {
        return a * b;
    }
    public static int multiply(int a, int b, int c, int d) {
        return multiply(a, b) * multiply(c, d);
    }
    public static double multiply(double a, double b) {
        return a * b;
    }
    public static BigDecimal multiply(BigDecimal a, BigDecimal b) {
        return a.multiply(b);
    }
    public static int multiply(List<Integer> intList) {
        if (intList.isEmpty()){
            return 0;
        }
        int result = intList.get(0);
        if (intList.size() > 1){
            for (int i = 1; i < intList.size(); i++){
                result *= intList.get(i);
            }
        }
        return result;
    }
}
