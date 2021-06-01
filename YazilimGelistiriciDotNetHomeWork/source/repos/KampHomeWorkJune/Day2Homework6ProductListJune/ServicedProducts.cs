using System;
using System.Collections.Generic;
using System.Text;

namespace Day2Homework6ProductListJune
{
    class ServicedProducts
    {
        public int Id { get; set; }
        public  int CategoryId { get; set; }
        public string ServicedName { get; set; }
        public double Price { get; set; }
        public ServicedProducts(int id, int categoryId, 
            string servicedName, double price)
        {
            Id = id;
            CategoryId = categoryId;
            ServicedName = servicedName;
            Price = price;
        }
    }
}
