package playlist4.day4Homework1Video40_45.Video40ClassAbstract;

public class Main {
    public static void main(String[] args) {
        GameCalculator[] gameCalculators1 = new GameCalculator[] {new WomanGameCalculator(), new ManGameCalculator(),
            new KidGameCalculator()};
        for (GameCalculator gameCalculator : gameCalculators1) {
            System.out.println(gameCalculator.toString());
            gameCalculator.hesapla();
            gameCalculator.gameOver();
        }
        GameCalculator[] gameCalculators2 = new GameCalculator[] {new WomanGameCalculator(), new ManGameCalculator(),
                new KidGameCalculator(), new OlderGameCalculator()};
        for (GameCalculator gameCalculator : gameCalculators2){
            System.out.println(gameCalculator.toString());
            gameCalculator.hesapla();
            gameCalculator.gameOver();
        }
    }
}
