package map.shopping.cart;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ShoppingCart {
    private Map<String, Double> productPrices = new HashMap<>();
    private Map<String, Integer> cartOrder = new LinkedHashMap<>();
    private TreeMap<Double, String> sortedCart = new TreeMap<>();

    public void addProduct(String product, double price) {
        productPrices.put(product, price);
        cartOrder.put(product, cartOrder.getOrDefault(product, 0) + 1);
        sortedCart.put(price, product);
    }

    public void displayCart() {
        System.out.println("Cart Items (HashMap - Product Prices): " + productPrices);
        System.out.println("Cart Items (LinkedHashMap - Order Added): " + cartOrder);
        System.out.println("Cart Items (TreeMap - Sorted by Price): " + sortedCart);
    }

    public double getTotalPrice() {
        double total = 0;
        for (Map.Entry<String, Integer> entry : cartOrder.entrySet()) {
            total += productPrices.get(entry.getKey()) * entry.getValue();
        }
        return total;
    }

    public Map<String, Integer> getCartOrder() {
        return cartOrder;
    }

    public Map<String, Double> getProductPrices() {
        return productPrices;
    }
}
