using Day5Homework5GamerBackEnd.Entities;
using System;
using System.Collections.Generic;
using System.Text;

namespace Day5Homework5GamerBackEnd.Abstracts
{
    public abstract class BaseGameManager : IGameService, IGameSalesService
    {
        public void AddDiscount(Game game)
        {

            Console.WriteLine( "Indirimli Fiyat (" + game.GameTitle + "): " + game.PriceAfterDiscount);
        }

        public void AddNew(Game game)
        {
            Console.WriteLine(game.GameTitle + " eklendi");
        }

        public void GiveGifts(Game game)
        {
            Console.WriteLine("Bu alisveristen kazandigin puan tutari : " + game.MarketValue * game.GiftAmount / 100);
        }

        public void OrderInBulk(Game game)
        {
            int value = game.OrderAmount;
            bool isNewOrder = false;
            if (game.AmountInStock < 7)
            {
                game.OrderAmount = 12;
                isNewOrder = true;
                value += game.OrderAmount;
                Console.WriteLine(game.GameTitle + " oyunu stoklarimizda gecici sure ile bulunmamaktadir.");
            }
            Console.WriteLine("Yeni siparis olacak mi : (" + isNewOrder + ") " + value);
        }
        public void UpdateStock(Game game)
        {
            Console.WriteLine ("Su anki stok (" + game.GameTitle + ") : " + game.AmountInStock);
            game.AmountInStock = game.AmountInStock + game.OrderAmount;
            Console.WriteLine("Forecasted (" + game.GameTitle + ") : " + game.AmountInStock);
        }
    }
}
