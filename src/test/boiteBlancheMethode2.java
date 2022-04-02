import currencyConverter.Currency;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class boiteBlancheMethode2 {
    @Test
    void methodeA() {
        Double[] T = {5000.0, 0.2};
        Double newCurrency = currencyConverter.Currency.convert(T[0], T[1]);
        Double price = Math.round((T[0] * T[1]) * 100d) / 100d;
        assertEquals(newCurrency, price);
    }
}
