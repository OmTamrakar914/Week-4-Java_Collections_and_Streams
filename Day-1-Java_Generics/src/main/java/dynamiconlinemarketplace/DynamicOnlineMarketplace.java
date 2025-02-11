package dynamiconlinemarketplace;

public class DynamicOnlineMarketplace {
    public static void main(String[] args) {
         Product<Category> products=new Product<>();
         products.addProduct(new Books("Java", 100));
         products.addProduct(new Gadgets("Smart watch",1500));
         products.addProduct(new Clothing("pants",120));
         products.displayProducts();
         products.applyDiscount(10);
    }
}
