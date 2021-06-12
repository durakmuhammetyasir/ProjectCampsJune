using System;

namespace Day5Homework5GamerBackEnd.Entities
{
    public class Promotion
    {
		public DateTime StartDate{get; set;}
		public DateTime FinishDate{get; set;}
		public int PromotionId{get; set;}
		public string PromotionName{get; set;}
		public bool HasLottery{get; set;}
		public bool HasCoupon{get; set;}
		public bool HasDiscount{get; set;}
		public string LotteryGift{get; set;}
		public double SaleCouponAmountForNextPurchase{get; set;}
		public double DiscountAmountForCurrentPurchase{get; set;}
	}
}
