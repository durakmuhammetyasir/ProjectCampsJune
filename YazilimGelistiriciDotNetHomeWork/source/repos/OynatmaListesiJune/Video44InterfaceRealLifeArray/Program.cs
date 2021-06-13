using System;

namespace Video44InterfaceRealLifeArray
{
    public class Program
    {
        public static void Main(string[] args)
        {
            ICustomerDal[] customerDals = new ICustomerDal[2]
            {
                new SqlServverCustomerDal(),
                new OracleCustomerDal()
            };
            foreach (var customerDal in customerDals)
            {
                customerDal.Add();
            }
            Console.ReadLine();
        }
    }
}
