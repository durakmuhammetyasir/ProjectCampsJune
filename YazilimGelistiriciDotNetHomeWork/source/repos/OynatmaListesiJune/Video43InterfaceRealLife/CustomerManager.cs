using System;
using System.Collections.Generic;
using System.Text;

namespace Video43InterfaceRealLife
{
    public class CustomerManager
    {
        public void Add(ICustomerDal customerDal)
        {
            customerDal.Add();
        }
    }
}
