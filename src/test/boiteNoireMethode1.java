// Catherine Engert et Blanche Mongeon
import currencyConverter.Currency;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

public class boiteNoireMethode1 {

    /**
     * Test sur les spécifications de currency1
     */
    @Test
    void currency1() {
        String[] T = {"US Dollar", "allo"};
        Double[] result = {1.0, null};
        ArrayList<Currency> currencies = Currency.init();

        for (int i=0; i<T.length; i++){
            Double newCurrency = currencyConverter.MainWindow.convert(T[i], "US Dollar", currencies, 1.0);
            assertEquals(newCurrency, result[i]);
        }

    }

    /**
     * Test sur les spécifications de currency2
     */
    @Test
    void currency2() {
        String[] T = {"US Dollar", "allo"};
        Double[] result = {1.0, null};
        ArrayList<Currency> currencies = Currency.init();

        for (int i=0; i<T.length; i++){
            Double newCurrency = currencyConverter.MainWindow.convert("US Dollar", T[i], currencies, 1.0);
            assertEquals(newCurrency, result[i]);
        }

    }

    /**
     * Test sur les spécifications de amount
     */
    @Test
    void amount() {
        Double[] T = {-5000.0, -0.1, 0.0, 5000.0, 10000.0, 10000.1, 15000.0};
        ArrayList<Currency> currencies = Currency.init();

        for (int i=0; i<T.length; i++) {
            Double newCurrency = currencyConverter.MainWindow.convert("US Dollar", "US Dollar", currencies, T[i]);
            if (T[i] > 10000.0 || T[i] < 0) {
                assertNull(newCurrency);
            }

            else {
                assertEquals(newCurrency, T[i]);
            }
        }
    }
}
