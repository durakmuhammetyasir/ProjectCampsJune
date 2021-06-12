using Day5Homework5GamerBackEnd.Abstracts;
using System;
using System.Collections.Generic;
using System.Text;

namespace Day5Homework5GamerBackEnd.Concretes
{
    public class GamerManager:BaseGamerManager
    {
        private IGamerCheckService _gamerCheckService;
        public GamerManager(IGamerCheckService gamerCheckService)
        {
            _gamerCheckService = gamerCheckService;
        }

        public override void Save(Gamer gamer)
        {
            if (_gamerCheckService.CheckIfRealPerson(gamer))
            {
                base.Save(gamer);
            }
            else
            {
                //throw new Exception("Not a valid person");
                Console.WriteLine("Not a valid person");
            }
        }
    }
}
