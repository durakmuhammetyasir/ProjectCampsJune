using System;
using System.Collections.Generic;
using System.Text;

namespace Day2Homework6ProductListJune
{
    class Categories
    {
        public int CategoryId { get; set; }
        public string CategoryName { get; set; }
        public Categories(int categoryId, string categoryName)
        {
            CategoryId = categoryId;
            CategoryName = categoryName;
        }
    }
}
