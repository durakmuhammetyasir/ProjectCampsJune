package day4Homework3GamerBackEnd;

import java.util.GregorianCalendar;

import day4Homework3GamerBackEnd.abstracts.BaseGameManager;
import day4Homework3GamerBackEnd.abstracts.BaseGamerManager;
import day4Homework3GamerBackEnd.abstracts.BasePromotionManager;
import day4Homework3GamerBackEnd.adapters.MernisServiceAdapter;
import day4Homework3GamerBackEnd.concretes.GameManager;
import day4Homework3GamerBackEnd.concretes.GameSalesManager;
import day4Homework3GamerBackEnd.concretes.GamerManager;
import day4Homework3GamerBackEnd.concretes.PromotionManager;
import day4Homework3GamerBackEnd.entities.Game;
import day4Homework3GamerBackEnd.entities.Gamer;
import day4Homework3GamerBackEnd.entities.Promotion;



public class Main {

	public static void main(String[] args) {
		BaseGamerManager gamerManager1 = new GamerManager(new MernisServiceAdapter());
		Gamer gamer1 = new Gamer();
		gamer1.setDateOfBirth(new GregorianCalendar(1985, 0, 6));
		gamer1.setId(1);
		gamer1.setFirstName("Engin");
		gamer1.setLastName("Demiroð");
		gamer1.setNationalityId("28861499108");
		Gamer gamer2 = new Gamer();
		gamer2.setDateOfBirth(new GregorianCalendar(1987, 1, 17));
		gamer2.setId(2);
		gamer2.setFirstName("Muhammet Yasir");
		gamer2.setLastName("Durak");
		gamer2.setNationalityId("");
		gamerManager1.save(gamer1);
		System.out.println(gamer1.toString());
		gamerManager1.save(gamer2);
		System.out.println(gamer2.toString());
		
		BaseGameManager baseGameM = new GameManager();
		Game game1 = new Game();
		game1.setGameTitle("Age Of Empires");
		game1.setAmountInStock(8);
		game1.setDiscountAmount(5.0);
		game1.setGiftAmount(0);
		game1.setId(1);
		game1.setMarketValue(100);
		game1.setOrderAmount(0);
		baseGameM.addNew(game1);
		baseGameM.addDiscount(game1);
		baseGameM.giveGifts(game1);
		baseGameM.orderInBulk(game1);
		System.out.println(game1.toString());
		baseGameM.updateStock(game1);
		Game game2 = new Game();
		game2.setGameTitle("PES2014");
		game2.setAmountInStock(2);
		game2.setDiscountAmount(15.0);
		game2.setGiftAmount(7);
		game2.setId(2);
		game2.setMarketValue(35);
		game2.setOrderAmount(0);
		baseGameM.addNew(game2);
		baseGameM.addDiscount(game2);
		baseGameM.giveGifts(game2);
		baseGameM.orderInBulk(game2);
		System.out.println(game2.toString());
		baseGameM.updateStock(game2);
		Game game3 = new Game();
		game3.setGameTitle("AssassinsCreed");
		game3.setAmountInStock(12);
		game3.setDiscountAmount(0);
		game3.setGiftAmount(30);
		game3.setId(3);
		game3.setMarketValue(130);
		game3.setOrderAmount(0);
		baseGameM.addNew(game3);
		baseGameM.addDiscount(game3);
		baseGameM.giveGifts(game3);
		baseGameM.orderInBulk(game3);
		System.out.println(game3.toString());
		baseGameM.updateStock(game3);
		Game game4 = new Game();
		game4.setGameTitle("Age Of Empires 3");
		game4.setAmountInStock(5);
		game4.setDiscountAmount(35.0);
		game4.setGiftAmount(0);
		game4.setId(4);
		game4.setMarketValue(20);
		game4.setOrderAmount(0);
		baseGameM.addNew(game4);
		baseGameM.addDiscount(game4);
		baseGameM.giveGifts(game4);
		baseGameM.orderInBulk(game4);
		System.out.println(game4.toString());
		baseGameM.updateStock(game4);
		
		Game[] games1 = new Game[] {game1,game3};
		GameSalesManager gameSalesM1 = new GameSalesManager(baseGameM);
		gameSalesM1.purchasedGames(gamer2, games1);
		Game[] games2 = new Game[] {game2,game4};
		GameSalesManager gameSalesM2 = new GameSalesManager(baseGameM);
		gameSalesM2.purchasedGames(gamer1, games2);
		gameSalesM1.purchasedGames(gamer2, games1);
		
		Promotion promotion1 = new Promotion();
		promotion1.setStartDate(new GregorianCalendar(2021,5,12)); 
		promotion1.setFinishDate(new GregorianCalendar(2021,8,22));
		promotion1.setPromotionId(1);
		promotion1.setPromotionName("Yaz Kampanyasi");
		promotion1.setHasLottery(true);
		promotion1.setHasCoupon(false);
		promotion1.setHasDiscount(true);
		promotion1.setLotteryGift("Smart Phone");
		promotion1.setSaleCouponAmountForNextPurchase(0);		
		promotion1.setDiscountAmountForCurrentPurchase(12);
		
		BasePromotionManager basePromo = new PromotionManager();
		basePromo.inProcessPromotion(game4, promotion1);
		basePromo.addPromotion(game2, promotion1);
		
		Promotion promotion2 = new Promotion();
		promotion2.setStartDate(new GregorianCalendar(2021,6,4)); 
		promotion2.setFinishDate(new GregorianCalendar(2021,6,22));
		promotion2.setPromotionId(2);
		promotion2.setPromotionName("Karne Kampanyasi");
		promotion2.setHasLottery(true);
		promotion2.setHasCoupon(true);
		promotion2.setHasDiscount(true);
		promotion2.setLotteryGift("Game Console");
		promotion2.setSaleCouponAmountForNextPurchase(20);		
		promotion2.setDiscountAmountForCurrentPurchase(2);
		
		BasePromotionManager basePromotion = new PromotionManager();
		basePromotion.inProcessPromotion(game1, promotion2);
		basePromotion.addPromotion(game3, promotion2);

	}

}
