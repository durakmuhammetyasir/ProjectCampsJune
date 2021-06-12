using Day5Homework5GamerBackEnd.Concretes;
using System;
using System.Collections.Generic;
using System.Text;

namespace Day5Homework5GamerBackEnd.Abstracts
{
    public abstract class BaseGamerManager : IGamerService
    {
        public virtual void Save(Gamer gamer)
        {
            Console.WriteLine("Saved to database : " + gamer.FirstName);

        }
    }
}
