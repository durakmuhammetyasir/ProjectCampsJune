package playlist3.day3Homework1Video27_39.Video37DemoInheritance;

public class Main {
    public static void main(String[] args){
        KrediUI krediUI = new KrediUI();
        krediUI.krediHesapla(new OgretmenKrediManager());
        krediUI.krediHesapla(new AskerKrediManager());
    }
}
