package playlist4.day4Homework1Video40_45.Video45DemoStatic;

public class ProductManager2 {
    public void add(Product product){
        if (ProductValidator2.isValid(product)){
            System.out.println("Eklendi.");
        }else{
            System.out.println("Urun bilgileri gecersizdir.");
        }
    }
}
