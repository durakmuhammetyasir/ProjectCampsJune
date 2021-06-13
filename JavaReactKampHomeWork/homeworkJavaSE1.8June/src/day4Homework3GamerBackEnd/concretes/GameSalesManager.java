package day4Homework3GamerBackEnd.concretes;

import day4Homework3GamerBackEnd.abstracts.BaseGameManager;
import day4Homework3GamerBackEnd.entities.Game;
import day4Homework3GamerBackEnd.entities.Gamer;

public class GameSalesManager extends BaseGameManager{
	BaseGameManager baseGameManager;
	public GameSalesManager(BaseGameManager baseGameManager){
		this.baseGameManager = baseGameManager;
	}
	
	public void purchasedGames(Gamer gamer, Game[] games) {
		for(Game game : games) {
			updateStockAfterPurchase(gamer, game);
		}		
	}
	public void updateStockAfterPurchase(Gamer gamer, Game game) {
		 game.setAmountInStock(game.getAmountInStock()-1);
		 System.out.println(gamer.getFirstName() + " bir adet " + game.getGameTitle() + " oyunu aldi. Stoktaki "+ game.getGameTitle() + " oyunu sayisi : " + game.getAmountInStock());
	}

}
