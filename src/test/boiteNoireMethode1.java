import currencyConverter.Currency;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;

public class boiteNoireMethode1 {

    @Test
    void currency1() {
        String[] T = {"US Dollar", "allo"};
        Double[] result = {1.0, 0.0};
        ArrayList<Currency> currencies = Currency.init();

        for (int i=0; i<T.length; i++){
            Double newCurrency = currencyConverter.MainWindow.convert("US Dollar", T[i], currencies, 1.0);
            assertEquals(newCurrency, result[i]);
        }

    }

    @Test
    void currency2() {
        String[] T = {"US Dollar", "allo"};
        Double[] result = {1.0, 0.0};
        ArrayList<Currency> currencies = Currency.init();

        for (int i=0; i<T.length; i++){
            Double newCurrency = currencyConverter.MainWindow.convert(T[i], "US Dollar", currencies, 1.0);
            assertEquals(newCurrency, result[i]);
        }

    }

    @Test
    void amount() {
        Double[] T = {-5000.0, -0.1, 0.0, 5000.0, 10000.0, 10000.1, 15000.0};
        ArrayList<Currency> currencies = Currency.init();

        for (int i=0; i<T.length; i++){
            Double newCurrency = currencyConverter.MainWindow.convert("US Dollar", "US Dollar", currencies, T[i]);
            assertEquals(newCurrency, T[i]);
        }

    }
}
