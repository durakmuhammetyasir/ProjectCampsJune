using System;
using System.Collections.Generic;
using System.Text;

namespace Day4ObjectOrientedProgrammingJune
{
    class ProductManager
    {
        //encapsulation
        public void Add(Product product)
        {
            Console.WriteLine(product.ProductName + " eklendi.");
            product.ProductName = "Kamera";
        }
        public void Update(Product product)
        {
            Console.WriteLine(product.ProductName + " guncellendi.");
        }
    }
}
