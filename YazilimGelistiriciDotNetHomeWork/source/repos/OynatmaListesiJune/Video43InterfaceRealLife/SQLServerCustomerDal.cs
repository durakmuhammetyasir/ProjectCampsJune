using System;
using System.Collections.Generic;
using System.Text;

namespace Video43InterfaceRealLife
{
    public class SQLServerCustomerDal : ICustomerDal
    {
        public void Add()
        {
            Console.WriteLine("Sql added");
        }

        public void Delete()
        {
            Console.WriteLine("Sql deleted");
        }

        public void Update()
        {
            Console.WriteLine("Sql updated");
        }
    }
}
