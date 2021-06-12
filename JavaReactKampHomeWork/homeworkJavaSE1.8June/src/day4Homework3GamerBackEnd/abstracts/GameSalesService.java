package day4Homework3GamerBackEnd.abstracts;

import day4Homework3GamerBackEnd.entities.Game;

public interface GameSalesService {
	void orderInBulk(Game game);
	void giveGifts(Game game);
	void updateStock(Game game);
	void addDiscount(Game game);
	
}
