using Day5Homework5GamerBackEnd.Entities;
using System;
using System.Collections.Generic;
using System.Text;

namespace Day5Homework5GamerBackEnd.Abstracts
{
    public interface IPromotionService
    {
		void AddPromotion(Game game, Promotion promotion);
		void InProcessPromotion(Game game, Promotion promotion);
		void UpdatePromotion(Game game, Promotion promotion);
		void DeletePromotion(Game game, Promotion promotion);

	}
}
