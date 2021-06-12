package playlist4.day4Homework1Video40_45.Video45DemoStatic;

public class ProductValidator {
    public ProductValidator(){
       System.out.println("Yapici blok calisti");
    }
    public boolean isValid(Product product){
        if(product.price>0 && !product.name.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}
