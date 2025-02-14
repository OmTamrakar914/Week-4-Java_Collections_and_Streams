package map.shopping.cart;

public class ImplementShoppingCart {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addProduct("Laptop", 1200.00);
        cart.addProduct("Phone", 800.00);
        cart.addProduct("Tablet", 500.00);
        cart.addProduct("Headphones", 150.00);
        cart.addProduct("Phone", 800.00);

        cart.displayCart();
        System.out.println("Total Price: $" + cart.getTotalPrice());
    }
}
