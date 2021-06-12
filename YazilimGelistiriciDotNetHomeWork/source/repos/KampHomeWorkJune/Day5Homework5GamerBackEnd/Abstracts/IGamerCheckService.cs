using Day5Homework5GamerBackEnd.Concretes;
using System;
using System.Collections.Generic;
using System.Text;

namespace Day5Homework5GamerBackEnd.Abstracts
{
    public interface IGamerCheckService
    {
        public bool CheckIfRealPerson(Gamer gamer);
    }
}
