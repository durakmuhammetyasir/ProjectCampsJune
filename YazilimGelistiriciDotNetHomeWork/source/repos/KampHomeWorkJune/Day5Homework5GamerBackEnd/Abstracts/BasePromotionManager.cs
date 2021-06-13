using Day5Homework5GamerBackEnd.Entities;
using System;
using System.Collections.Generic;
using System.Globalization;
using System.Text;

namespace Day5Homework5GamerBackEnd.Abstracts
{
    public abstract class BasePromotionManager : IPromotionService
    {
        private double PriceAfterDiscountPromotion;
        private double SaleCouponAmountPromotion;
        public void GetPriceAfterDiscountPromotion(Game game, Promotion promotion)
        {
            PriceAfterDiscountPromotion = game.MarketValue-(game.MarketValue * promotion.DiscountAmountForCurrentPurchase/100);
            Console.WriteLine(game.GameTitle + " oyununun guncel piyasa degeri : " + game.MarketValue );
            Console.WriteLine(promotion.PromotionName + " kampanyasinda Kampanyali fiyati : " +PriceAfterDiscountPromotion);
        }
        public void GetSaleCouponAmountPromotion(Game game, Promotion promotion)
        {
            SaleCouponAmountPromotion = game.GiftAmount + promotion.SaleCouponAmountForNextPurchase;
            Console.WriteLine(promotion.PromotionName + " devam ediyor iki kampanyayi birlestirdik : " + game.GameTitle + " oyununu simdi al " + SaleCouponAmountPromotion +" tutarinda hediye ceki kazan.\n");
        }
        public void AddPromotion(Game game, Promotion promotion)
        {
            Console.WriteLine(promotion.PromotionName + " devam ediyor ");
            double kampanyaIndirim = game.DiscountAmount + promotion.DiscountAmountForCurrentPurchase;
            double kampanyaliFiyat = game.MarketValue - (game.MarketValue * kampanyaIndirim / 100);
            Console.WriteLine("Indirim iki kampanyayi birlestirdik : " + game.GameTitle + " oyunu yuzde " + kampanyaIndirim + " indirimle simdi sadece " + kampanyaliFiyat + "\n");
        }

        public virtual void DeletePromotion(Game game, Promotion promotion)
        {
            Console.WriteLine(promotion.PromotionName + " kampanyamiz sona erdi");
            Console.WriteLine("Bizi takip edin.");

        }

        public void InProcessPromotion(Game game, Promotion promotion)
        {
            DateTime ExpireDate = promotion.FinishDate;
            DateTime LocalDate = DateTime.Now;
            int TimeToExpireMonths = ExpireDate.Month - LocalDate.Month;
            int TimeToExpireDays = ExpireDate.Day - LocalDate.Day;
            Console.WriteLine("Kampanya tarihleri : " + promotion.StartDate + " " + promotion.FinishDate);
            Console.WriteLine("Kampanya bitisine :  " + TimeToExpireMonths + " ay ve " + TimeToExpireDays + " gun var\n");
        }

        public void UpdatePromotion(Game game, Promotion promotion)
        {
            promotion.SaleCouponAmountForNextPurchase += 5;
            double lastChance = game.DiscountAmount + promotion.DiscountAmountForCurrentPurchase +5.0;
            double lastPrice = game.MarketValue - (game.MarketValue * lastChance / 100);
            SaleCouponAmountPromotion = game.GiftAmount + promotion.SaleCouponAmountForNextPurchase;
            Console.WriteLine("Ekstra %5 hediye ceki : " + SaleCouponAmountPromotion);
            Console.WriteLine("Damping Ekstra %5 İndirim! Zararina ! " + game.GameTitle + " : " + game.MarketValue + " fiyatindan yuzde " + lastChance + " indirimle " + lastPrice + " fiyatina geriledi");
        }
    }        
}
