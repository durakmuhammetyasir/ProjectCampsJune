using System;
using System.Collections.Generic;
using System.Text;

namespace Day2Homework6LokantaMealListJune
{
    class Category
    {
        public int CategoryId { get; set; }
        public string CategoryName { get; set; }
        public Category(int categoryId, string categoryName)
        {
            CategoryId = categoryId;
            CategoryName = categoryName;
        }
    }
}
