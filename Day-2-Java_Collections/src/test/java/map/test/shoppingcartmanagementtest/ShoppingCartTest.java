package map.test.shopping.cart.test;

import static org.junit.jupiter.api.Assertions.*;

import map.shopping.cart.ShoppingCart;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.*;

class ShoppingCartTest {
    private ShoppingCart cart;

    @BeforeEach
    void setUp() {
        cart = new ShoppingCart();
    }

    @Test
    void testAddProductAndRetrieve() {
        cart.addProduct("Laptop", 1200.00);
        cart.addProduct("Phone", 800.00);

        Map<String, Double> expectedPrices = new HashMap<>();
        expectedPrices.put("Laptop", 1200.00);
        expectedPrices.put("Phone", 800.00);

        assertEquals(expectedPrices, cart.getProductPrices());
    }

    @Test
    void testAddMultipleSameProduct() {
        cart.addProduct("Tablet", 500.00);
        cart.addProduct("Tablet", 500.00);

        assertEquals(2, cart.getCartOrder().get("Tablet".getClass()));
    }

    @Test
    void testTotalPriceCalculation() {
        cart.addProduct("Laptop", 1200.00);
        cart.addProduct("Phone", 800.00);
        cart.addProduct("Phone", 800.00);  // Second phone

        double expectedTotal = (1200.00) + (800.00 * 2);
        assertEquals(expectedTotal, cart.getTotalPrice());
    }

    @Test
    void testEmptyCartTotal() {
        assertEquals(0.0, cart.getTotalPrice());
    }

    @Test
    void testCartOrderPreserved() {
        cart.addProduct("A", 10.00);
        cart.addProduct("B", 20.00);
        cart.addProduct("C", 30.00);

        List<String> expectedOrder = Arrays.asList("A", "B", "C");
        assertEquals(expectedOrder, new ArrayList<>( cart.getCartOrder().keySet()));
    }
}
