package playlist4.day4Homework1Video40_45.Video45DemoStatic;

public class Main {
    public static void main(String[] args){
        ProductManager manager1 = new ProductManager();
        Product product1 = new Product();
        product1.price = 10;
        product1.name= "";
        manager1.add(product1);
        Product product2 = new Product();
        product2.price = 10;
        product2.name= "Mouse";
        manager1.add(product2);
        ProductManager2 manager2 = new ProductManager2();
        manager2.add(product1);
        manager2.add(product2);


    }
}
