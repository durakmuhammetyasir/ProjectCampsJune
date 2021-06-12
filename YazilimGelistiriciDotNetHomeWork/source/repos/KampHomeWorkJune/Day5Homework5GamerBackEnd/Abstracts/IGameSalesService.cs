using Day5Homework5GamerBackEnd.Entities;
using System;
using System.Collections.Generic;
using System.Text;

namespace Day5Homework5GamerBackEnd.Abstracts
{
    public interface IGameSalesService
    {
        void OrderInBulk(Game game);
        void GiveGifts(Game game);
        void UpdateStock(Game game);
        void AddDiscount(Game game);
    }
}
