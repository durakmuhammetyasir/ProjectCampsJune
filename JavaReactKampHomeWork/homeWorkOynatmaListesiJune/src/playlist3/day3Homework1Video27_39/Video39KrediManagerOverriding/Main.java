package playlist3.day3Homework1Video27_39.Video39KrediManagerOverriding;

public class Main {
    public static void main(String[] args) {
        BaseKrediManager[] krediManagers = new BaseKrediManager[] {new OgretmenKrediManager(),
            new OgrenciKrediManager(), new TarimKrediManager()};
        for(BaseKrediManager krediManager: krediManagers){
            System.out.println(krediManager.hesapla(1000));
        }
    }
}
