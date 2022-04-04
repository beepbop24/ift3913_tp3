// Catherine Engert et Blanche Mongeon
import currencyConverter.Currency;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class boiteBlancheMethode1 {
    /**
     * Test sur les spécifications de la méthode A: Couverture des instructions
     */
    @Test
    void methodeA() {
        ArrayList<Currency> currencies = Currency.init();

        //T = {("US Dollar", "Euro", currencies, 5000)};
        Double newCurrency = currencyConverter.MainWindow.convert("US Dollar", "Euro", currencies, 5000.0);
        assertEquals(4650.0, newCurrency);
    }

    /**
     * Test sur les spécifications de la méthode A: Couverture des arcs du graphe de flot de contrôle
     */
    @Test
    void methodeB() {
        ArrayList<Currency> currencies = Currency.init();

        String[][] T = {{"US Dollar", "US Dollar"}, {"British Pound", "New Zealand Dollar"},
                {"New Zealand Dollar", "British Pound"}};
        Double[] results = {5000.0, 0.0, 0.0};

        for (int i=0; i<T.length; i++){
            Double newCurrency = currencyConverter.MainWindow.convert(T[i][0], T[i][1], currencies, 5000.0);
            assertEquals(results[i], newCurrency);
        }
    }

    /**
     * Test sur les spécifications de la méthode A: Couverture des i-chemins
     */
    @Test
    void methodeE() {
        ArrayList<Currency> currencies = Currency.init();

        String[][] T = {{"US Dollar", "US Dollar"}, {"Euro", "Euro"}, {"British Pound", "British Pound"},
                {"Chinese Yuan Renminbi", "Chinese Yuan Renminbi"}, {"Japanese Yen", "Japanese Yen"},
                {"New Zealand Dollar", "New Zealand Dollar"}, {"New Zealand Dollar", "US Dollar"}};
        Double[] results = {5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 0.0, 0.0};

        for (int i=0; i<T.length; i++){
            Double newCurrency = currencyConverter.MainWindow.convert(T[i][0], T[i][1], currencies, 5000.0);
            assertEquals(results[i], newCurrency);
        }
    }
}
