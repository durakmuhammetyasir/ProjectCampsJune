using DataAccessLayer.Concrete.Repositories;
using EntityLayer.Concrete;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BusinessLayer.Concrete
{
    public class CategoryManager
    {
        GenericRepository<Category> repo = new GenericRepository<Category>();

        public List<Category> GetAllBusinessLayer()
        {
            return repo.List();
        } 
        public void CategoryAddBusinessLayer(Category category1)
        {
            if(category1.CategoryName == "" || 
                category1.CategoryName.Length <= 3 ||
                category1.CategoryDescription == "" ||
                category1.CategoryName.Length >= 51)
            {
                // hata mesaji
            }
            else
            {
                repo.Insert(category1);
            }
        }

    }
}
