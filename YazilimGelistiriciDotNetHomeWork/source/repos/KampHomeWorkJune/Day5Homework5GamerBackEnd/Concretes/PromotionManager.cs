using Day5Homework5GamerBackEnd.Abstracts;
using Day5Homework5GamerBackEnd.Entities;
using System;
using System.Collections.Generic;
using System.Text;

namespace Day5Homework5GamerBackEnd.Concretes
{
    class PromotionManager:BasePromotionManager
    {
        public void DeletePromotion(Game game, Promotion promotion)
        {
            bool isDeleted = false;
            if (game.AmountInStock <= 0)
            {
                Console.WriteLine(promotion.PromotionName + " oyununda Kampanyamiz sona erdi");
                isDeleted = true;
            }
            if (isDeleted)
            {
                Console.WriteLine("Bizi takip edin.");
            }
        }
        
    }
}
