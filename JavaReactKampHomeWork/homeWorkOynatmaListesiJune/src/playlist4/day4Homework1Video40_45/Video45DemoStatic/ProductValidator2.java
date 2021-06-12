package playlist4.day4Homework1Video40_45.Video45DemoStatic;

public class ProductValidator2 {
    static{
        System.out.println("Static yapici blok calisti");
    }
    public ProductValidator2(){
        System.out.println("Yapici blok calisti");
    }
    public static boolean isValid(Product product){
        if(product.price>0 && !product.name.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}
