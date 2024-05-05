import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Multiplier
        System.out.println(Multiplier.multiply(2, 3));
        System.out.println(Multiplier.multiply(2, 3, 4, 5));
        System.out.println(Multiplier.multiply(2.23d, 3d));
        BigDecimal a = BigDecimal.valueOf(2.2354);
        BigDecimal b = BigDecimal.valueOf(5.543554);
        System.out.println(Multiplier.multiply(a, b));
        List<Integer> listaIntow = new ArrayList<>();
        listaIntow.add(5);
        listaIntow.add(2);
        listaIntow.add(3);
        System.out.println( Multiplier.multiply(listaIntow));
        //Add
        System.out.println(Adder.Add(2, 3));
        System.out.println(Adder.Add(a, b));
        //Address
        System.out.println(Address.createAddress("Polska"));
        System.out.println(Address.createAddress("Polska", "Sosnowiec"));
        System.out.println(Address.createAddress("Polska", "Sosnowiec", "01-100"));
        System.out.println(Address.createAddress("Polska", "Sosnowiec", "01-100", "Poznańska"));
        System.out.println(Address.createAddress("Polska", "Sosnowiec", "01-100", "Poznańska", 54));
    }
}