using System;

namespace Video43InterfaceRealLife
{
    public class Program
    {
        public static void Main(string[] args)
        {
            CustomerManager customerManager = new CustomerManager();
            customerManager.Add(new OracleCustomerDal());
            customerManager.Add(new SQLServerCustomerDal());
        }
    }
}
