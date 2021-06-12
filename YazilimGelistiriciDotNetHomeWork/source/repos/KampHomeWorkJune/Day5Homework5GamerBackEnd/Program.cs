using Day5Homework5GamerBackEnd.Abstracts;
using Day5Homework5GamerBackEnd.Adapters;
using Day5Homework5GamerBackEnd.Concretes;
using Day5Homework5GamerBackEnd.Entities;
using System;

namespace Day5Homework5GamerBackEnd
{
    class Program
    {
        static void Main(string[] args)
        {
            BaseGamerManager gamerManager2 = new GamerManager(new MernisServiceAdapter());
            BaseGamerManager gamerManager1 = new GamerManager(new MernisServiceAdapter());

            gamerManager1.Save(new Gamer { DateOfBirth = new DateTime(1985, 1, 6), FirstName = "Engin", LastName = "Demiroğ", NationalityId = "28861499108" });
            gamerManager2.Save(new Gamer { DateOfBirth = new DateTime(1987, 1, 6), FirstName = "Muhammet Yasir", LastName = "Durak", NationalityId = "12345678900" });
            Console.ReadLine();

			BaseGameManager baseGameM = new GameManager();
			Game game1 = new Game();
            game1.GameTitle = "Age Of Empires";
			game1.AmountInStock =8;
			game1.DiscountAmount=5.0;
			game1.GiftAmount =0;
			game1.GameId = 1;
			game1.MarketValue = 100;
			game1.OrderAmount =0;
			baseGameM.AddNew(game1);
			baseGameM.AddDiscount(game1);
			baseGameM.GiveGifts(game1);
			baseGameM.OrderInBulk(game1);
            Console.WriteLine(game1.ToString());
			baseGameM.UpdateStock(game1);
			Console.ReadLine();
			Game game2 = new Game();
			game2.GameTitle="PES2014";
			game2.AmountInStock=2;
			game2.DiscountAmount=15.0;
			game2.GiftAmount=7;
			game2.GameId=2;
			game2.MarketValue=35;
			game2.OrderAmount=0;
			baseGameM.AddNew(game2);
			baseGameM.AddDiscount(game2);
			baseGameM.GiveGifts(game2);
			baseGameM.OrderInBulk(game2);
            Console.WriteLine(game2.ToString());
			baseGameM.UpdateStock(game2);
			Console.ReadLine();
			Game game3 = new Game();
            game3.GameTitle = "AssassinsCreed";
			game3.AmountInStock=12;
			game3.DiscountAmount=0;
			game3.GiftAmount=30;
			game3.GameId=3;
			game3.MarketValue=130;
			game3.OrderAmount=0;
			baseGameM.AddNew(game3);
			baseGameM.AddDiscount(game3);
			baseGameM.GiveGifts(game3);
			baseGameM.OrderInBulk(game3);
            Console.WriteLine(game3.ToString());
			baseGameM.UpdateStock(game3);
			Console.ReadLine();
			
			Game game4 = new Game();
			game4.GameTitle="Age Of Empires 3";
			game4.AmountInStock=5;
			game4.DiscountAmount=35.0;
			game4.GiftAmount=0;
			game4.GameId=4;
			game4.MarketValue=20;
			game4.OrderAmount=0;
			baseGameM.AddNew(game4);
			baseGameM.AddDiscount(game4);
			baseGameM.GiveGifts(game4);
			baseGameM.OrderInBulk(game4);
            Console.WriteLine(game4.ToString());
			baseGameM.UpdateStock(game4);
			Console.ReadLine();

			Gamer gamer1 = new Gamer() { FirstName = "Kaan" };
			Gamer gamer2 = new Gamer() { FirstName = "Kenan" };
			Gamer gamer3 = new Gamer() { FirstName = "Kaya" };
			Game[] games1 = new Game[] { game1, game3 };		
			Game[] games2 = new Game[] { game2, game4 };
			Game[] games3 = new Game[] { game1, game2, game3 };
			GameSalesManager gameSalesM1 = new GameSalesManager();
			GameSalesManager gameSalesM2 = new GameSalesManager();
			GameSalesManager gameSalesM3 = new GameSalesManager();
			gameSalesM2.purchasedGames(gamer3, games2);
			gameSalesM1.purchasedGames(gamer2, games1);
			gameSalesM1.purchasedGames(gamer2, games2);
			gameSalesM2.purchasedGames(gamer1, games3);
			gameSalesM3.purchasedGames(gamer3, games1);
			Console.ReadLine();

			Promotion promotion1 = new Promotion();
			promotion1.StartDate=new DateTime(2021, 5, 12);
			promotion1.FinishDate=new DateTime(2021, 8, 22);
			promotion1.PromotionId=1;
			promotion1.PromotionName="Yaz Senligi";
			promotion1.HasLottery=true;
			promotion1.HasCoupon=false;
			promotion1.HasDiscount=true;
			promotion1.LotteryGift="Smart Phone";
			promotion1.SaleCouponAmountForNextPurchase=0;
			promotion1.DiscountAmountForCurrentPurchase=12;

			BasePromotionManager basePromo = new PromotionManager();
			basePromo.InProcessPromotion(game4, promotion1);
			basePromo.GetPriceAfterDiscountPromotion(game4, promotion1);
			basePromo.GetSaleCouponAmountPromotion(game4, promotion1);
			basePromo.AddPromotion(game4, promotion1);
			basePromo.UpdatePromotion(game4, promotion1);
			basePromo.DeletePromotion(game4, promotion1);
			Console.ReadLine();
			basePromo.InProcessPromotion(game3, promotion1);
			basePromo.GetPriceAfterDiscountPromotion(game3, promotion1);
			basePromo.GetSaleCouponAmountPromotion(game3, promotion1);
			basePromo.AddPromotion(game3, promotion1);
			basePromo.UpdatePromotion(game3, promotion1);
			basePromo.DeletePromotion(game3, promotion1);
			Console.ReadLine();
			basePromo.InProcessPromotion(game2, promotion1);
			basePromo.GetPriceAfterDiscountPromotion(game2, promotion1);
			basePromo.GetSaleCouponAmountPromotion(game2, promotion1);
			basePromo.AddPromotion(game2, promotion1);
			basePromo.UpdatePromotion(game2, promotion1);
			basePromo.DeletePromotion(game2, promotion1);
			Console.ReadLine();
			basePromo.InProcessPromotion(game1, promotion1);
			basePromo.GetPriceAfterDiscountPromotion(game1, promotion1);
			basePromo.GetSaleCouponAmountPromotion(game1, promotion1);
			basePromo.AddPromotion(game1, promotion1);
			basePromo.UpdatePromotion(game1, promotion1);
			basePromo.DeletePromotion(game1, promotion1);

			Promotion promotion2 = new Promotion();
			promotion2.StartDate=new DateTime(2021, 6, 4);
			promotion2.FinishDate=new DateTime(2021, 6, 22);
			promotion2.PromotionId=2;
			promotion2.PromotionName="Karne Senligi";
			promotion2.HasLottery=true;
			promotion2.HasCoupon=true;
			promotion2.HasDiscount=true;
			promotion2.LotteryGift="Game Console";
			promotion2.SaleCouponAmountForNextPurchase=20;
			promotion2.DiscountAmountForCurrentPurchase=2;

			BasePromotionManager basePromotion = new PromotionManager();
			basePromotion.InProcessPromotion(game4, promotion2);
			basePromotion.GetPriceAfterDiscountPromotion(game4, promotion2);
			basePromotion.GetSaleCouponAmountPromotion(game4, promotion2);
			basePromotion.AddPromotion(game4, promotion2);
			basePromotion.UpdatePromotion(game4, promotion2);
			basePromotion.DeletePromotion(game4, promotion2);
			Console.ReadLine();
			basePromotion.InProcessPromotion(game3, promotion2);
			basePromotion.GetPriceAfterDiscountPromotion(game3, promotion2);
			basePromotion.GetSaleCouponAmountPromotion(game3, promotion2);
			basePromotion.AddPromotion(game3, promotion2);
			basePromotion.UpdatePromotion(game3, promotion2);
			basePromotion.DeletePromotion(game3, promotion2);
			Console.ReadLine();
			basePromotion.InProcessPromotion(game2, promotion2);
			basePromotion.GetPriceAfterDiscountPromotion(game2, promotion2);
			basePromotion.GetSaleCouponAmountPromotion(game2, promotion2);
			basePromotion.AddPromotion(game2, promotion2);
			basePromotion.UpdatePromotion(game2, promotion2);
			basePromotion.DeletePromotion(game2, promotion2);
			Console.ReadLine();
			basePromotion.InProcessPromotion(game1, promotion2);
			basePromotion.GetPriceAfterDiscountPromotion(game1, promotion2);
			basePromotion.GetSaleCouponAmountPromotion(game1, promotion2);
			basePromotion.AddPromotion(game1, promotion2);
			basePromotion.UpdatePromotion(game1, promotion2);
			basePromotion.DeletePromotion(game1, promotion2);
			Console.ReadLine();

		}
	}
}

