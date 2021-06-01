package playlist.day1Homework3Video5_23;

public class Video23RecapSayiBulma {
    public static void main(String[] args){
        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 5;
        boolean varMi= false;
        for (int sayi :sayilar){
            if(sayi == aranacak){
                varMi = true;
                break;
            }
        }
        if(varMi){
            System.out.println("Sayi mevcuttur.");
        }else{
            System.out.println("Sayi mevcut degildir.");
        }
    }
}
