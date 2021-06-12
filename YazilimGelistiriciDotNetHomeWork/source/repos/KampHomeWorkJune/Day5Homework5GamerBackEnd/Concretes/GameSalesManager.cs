using Day5Homework5GamerBackEnd.Entities;
using System;
using System.Collections.Generic;
using System.Text;

namespace Day5Homework5GamerBackEnd.Concretes
{
    class GameSalesManager
    {
		public void purchasedGames(Gamer gamer, Game[] games)
		{
			foreach (Game game in games)
			{
				updateStockAfterPurchase(gamer, game);
			}
		}
		public void updateStockAfterPurchase(Gamer gamer, Game game)
		{
			game.AmountInStock = game.AmountInStock - 1;
			Console.WriteLine(gamer.FirstName + " bir adet oyun aldi. Stoktaki " + game.GameTitle + " oyunu sayisi : " + game.AmountInStock);
		}
	}
}
