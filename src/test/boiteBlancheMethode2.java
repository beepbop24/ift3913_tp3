// Catherine Engert et Blanche Mongeon
import currencyConverter.Currency;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class boiteBlancheMethode2 {
    /**
     * Test sur les spécifications de la méthode A: Couverture des instructions
     */
    @Test
    void methodeA() {
        Double[] T = {5000.0, 0.2};
        Double newCurrency = currencyConverter.Currency.convert(T[0], T[1]);
        Double price = Math.round((T[0] * T[1]) * 100d) / 100d;
        assertEquals(price, newCurrency);
    }
}
