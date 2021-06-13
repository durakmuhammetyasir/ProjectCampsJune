using System;

namespace Video45InterfacesDemo
{
    public class Program
    {
        public static void Main(string[] args)
        {
            IWork[] works = new IWork[3]
            {
                new Manager(),
                new Worker(),
                new Robot()
            };
            IEat[] eats = new IEat[2]
            {
                new Manager(),
                new Worker()
            };
            ISalary[] pays = new ISalary[]
            {
                new Manager(),
                new Worker()
            };
            foreach (var eat in eats)
            {
                eat.Eat();
            }
            foreach (var work in works)
            {
                work.Work();
            }
            foreach (var pay in pays)
            {
                pay.Pays();
            }
        }
    }
}
