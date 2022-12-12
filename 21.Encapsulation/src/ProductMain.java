public class ProductMain {
    public static void main(String[] args) {
        Product product = new Product();
        product.setId(1);
        product.setName("Laptop");
        product.setDescription("Asus Laptop");
        product.setPrice(15000);
        product.setStockAmount(3);

        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        
        System.out.println(product.getKod());
    }
}
