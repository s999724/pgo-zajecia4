import java.math.BigDecimal;

public class Adder {
    public static int Add(int a, int b){
        return a + b;
    }
    public static BigDecimal Add(BigDecimal a, BigDecimal b){
        return a.add(b);
    }
}
