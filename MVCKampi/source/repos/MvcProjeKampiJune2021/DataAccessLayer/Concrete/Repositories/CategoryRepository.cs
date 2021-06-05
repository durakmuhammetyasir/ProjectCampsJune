using DataAccessLayer.Abstract;
using EntityLayer.Concrete;
using System;
using System.Collections.Generic;
using System.Data.Entity;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DataAccessLayer.Concrete.Repositories
{
    public class CategoryRepository : ICategoryDal
    {
        Context context1 = new Context();
        DbSet<Category> _object;
        public void Delete(Category category1)
        {
            _object.Remove(category1);
            context1.SaveChanges();
        }

        public void Insert(Category category1)
        {
            _object.Add(category1);
            context1.SaveChanges();
        }

        public List<Category> List()
        {
            return _object.ToList();
        }

        public void Update(Category category1)
        {
            context1.SaveChanges();
        }
    }
}
