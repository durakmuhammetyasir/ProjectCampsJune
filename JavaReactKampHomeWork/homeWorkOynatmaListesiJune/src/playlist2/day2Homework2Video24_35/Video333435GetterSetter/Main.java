package playlist2.day2Homework2Video24_35.Video333435GetterSetter;

public class Main {
    public static void main(String[] args){
        Product product = new Product();
        product.setId(1);
        product.setName("Laptop");
        product.setDescription("Asus Laptop");
        product.setPrice(5000);
        product.setStockAmount(3);
        product.setRenk("Sari");
        Product product2 = new Product(2, "Laptop",
                "Lenovo Laptop", 12000, 8
                ,"Kirmizi" );

        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        productManager.Add(product2);
        System.out.println(product.getKod());
        System.out.println(product2.getKod());
    }
}
