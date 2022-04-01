import currencyConverter.Currency;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;

public class boiteNoireMethode2 {
    @Test
    void amount() {
        Double[] T = {-5000.0, -0.1, 0.0, 5000.0, 10000.0, 10000.1, 15000.0};

        for (int i=0; i<T.length; i++){
            Double newCurrency = currencyConverter.Currency.convert(T[i], 0.1);

            Double price = T[i] * 0.1;
            price = Math.round(price * 100d) / 100d;
            assertEquals(newCurrency, price);
        }

    }
}
