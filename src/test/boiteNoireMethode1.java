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
            // possiblement que on pourrait mettre en fait : assert que ça ne retourne pas une valeur >=0 dans le cas
            // ou on veut une erreur. Parce que le but est que le test réussisse, pas fail. Ainsi, il faut mettre
            //le comportement auquel on s'attend
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
            // possiblement que on pourrait mettre en fait : assert que ça ne retourne pas une valeur >=0 dans le cas
            // ou on veut une erreur. Parce que le but est que le test réussisse, pas fail. Ainsi, il faut mettre
            //le comportement auquel on s'attend
            assertEquals(newCurrency, result[i]);
        }

    }

    @Test
    void amount() {
        Double[] T = {-5000.0, -0.1, 0.0, 5000.0, 10000.0, 10000.1, 15000.0};
        ArrayList<Currency> currencies = Currency.init();

        for (int i=0; i<T.length; i++){
            Double newCurrency = currencyConverter.MainWindow.convert("US Dollar", "US Dollar", currencies, T[i]);
            // possiblement que on pourrait mettre en fait : assert que ça ne retourne pas une valeur >=0 dans le cas
            // ou on veut une erreur. Parce que le but est que le test réussisse, pas fail. Ainsi, il faut mettre
            //le comportement auquel on s'attend
            assertEquals(newCurrency, T[i]);
        }

    }
}
