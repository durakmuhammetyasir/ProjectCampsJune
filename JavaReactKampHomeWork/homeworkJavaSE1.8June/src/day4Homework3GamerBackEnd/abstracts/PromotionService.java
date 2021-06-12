package day4Homework3GamerBackEnd.abstracts;

import day4Homework3GamerBackEnd.entities.Game;
import day4Homework3GamerBackEnd.entities.Promotion;

public interface PromotionService {
	void addPromotion(Game game, Promotion promotion);
	void inProcessPromotion(Game game, Promotion promotion);
	void updatePromotion(Game game, Promotion promotion);
	void deletePromotion(Game game, Promotion promotion);
	

}
