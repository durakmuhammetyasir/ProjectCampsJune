package day4Homework3GamerBackEnd.abstracts;

import java.util.Calendar;

import day4Homework3GamerBackEnd.entities.Game;
import day4Homework3GamerBackEnd.entities.Promotion;

public abstract class BasePromotionManager implements PromotionService{
	
	@Override
	public void addPromotion(Game game, Promotion promotion) {
		System.out.println(promotion.toString());
		System.out.println(game.toString());
		double totalDiscount= game.getDiscountAmount() + promotion.getDiscountAmountForCurrentPurchase();
		double promotedValue = game.getMarketValue()-(game.getMarketValue()*totalDiscount/100);
		System.out.println("Indirim iki kampanyayi birlestirdik : " + totalDiscount + " indirim ile son fiyat: " + promotedValue);
	}
	@Override
	public void inProcessPromotion(Game game, Promotion promotion) {
		Calendar now2 = promotion.getFinishDate();
		Calendar now = Calendar.getInstance();
		int now3 = now2.get(Calendar.DATE)-now.get(Calendar.DATE);
		int now4 = now2.get(Calendar.MONTH)-now.get(Calendar.MONTH) -1;
		if(now3 <0 || now4 < 0) {
			System.out.println("Kampanya sona erdi");
		}else {
			System.out.println(promotion.getPromotionName() + " kampanyasinin bitisine :  " + now4 + " ay ve " + now3 + " gun var");
		}
	}
	@Override
	public void updatePromotion(Game game, Promotion promotion) {
		double totalDiscount = game.getDiscountAmount() + promotion.getDiscountAmountForCurrentPurchase() + 5;
		double updatedPromotion = game.getMarketValue()- (game.getMarketValue()*totalDiscount/100);
		System.out.println(promotion.getPromotionName() +" kampanyasinda ekstra %5 indirim yuzde " + totalDiscount + " indirimle son fiyat :" + updatedPromotion);
	}
	@Override
	public void deletePromotion(Game game, Promotion promotion) {
		boolean isDeleted =false;
		if(game.getAmountInStock()<=0) {			
			System.out.println(promotion.getPromotionName() + " oyununda Kampanyamiz sona erdi");
			isDeleted=true;
		}
		if(isDeleted) {
			System.out.println("Bizi takip edin.");
		}
	}

}
