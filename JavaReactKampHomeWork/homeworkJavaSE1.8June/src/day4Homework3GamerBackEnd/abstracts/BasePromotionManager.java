package day4Homework3GamerBackEnd.abstracts;

import java.util.Calendar;

import day4Homework3GamerBackEnd.entities.Game;
import day4Homework3GamerBackEnd.entities.Promotion;

public abstract class BasePromotionManager implements PromotionService{
	private double priceAfterDiscount;
	private double saleCouponAmount;
	public double getPriceAfterDiscount(Game game, Promotion promotion) {
		priceAfterDiscount = game.getMarketValue()*promotion.getDiscountAmountForCurrentPurchase();
		System.out.println(priceAfterDiscount);
		return priceAfterDiscount;
	}
	public double getSaleCouponAmount(Game game, Promotion promotion) {
		saleCouponAmount= game.getMarketValue()*promotion.getSaleCouponAmountForNextPurchase();
		System.out.println(saleCouponAmount);		
		return saleCouponAmount;
	}
	@Override
	public void addPromotion(Game game, Promotion promotion) {
		System.out.println(promotion.toString());
		System.out.println(game.toString());
	}
	@Override
	public void inProcessPromotion(Game game, Promotion promotion) {
		Calendar now2 = promotion.getFinishDate();
		Calendar now = Calendar.getInstance();
		int now3 = now2.get(Calendar.DATE)-now.get(Calendar.DATE);
		int now4 = now2.get(Calendar.MONTH)-now.get(Calendar.MONTH) -1;
		
		System.out.println("Kampanya bitisine :  " + now4 + " ay ve " + now3 + " gun var");
		
	}
	@Override
	public void updatePromotion(Game game, Promotion promotion) {
				
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
