using System;
using System.Collections.Generic;
using System.Text;

namespace Day5Homework5GamerBackEnd.Entities
{
    public class Game
    {
		public int GameId { get; set; }
		public string GameTitle { get; set; }
		public double MarketValue { get; set; }
		public double DiscountAmount { get; set; }
		public double GiftAmount { get; set; }
		public double PriceAfterDiscount { get
			{
				return MarketValue - (MarketValue * DiscountAmount / 100);
			}
				 }
		public int OrderAmount { get; set; }
		public int AmountInStock { get; set; }

        
	}
}
