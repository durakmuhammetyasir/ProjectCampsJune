using System;
using System.Collections.Generic;
using System.Linq;
using System.Linq.Expressions;
using System.Text;
using System.Threading.Tasks;

namespace DataAccessLayer.Abstract
{
    public interface IRepository<T>
    {
        List<T> List();
        void Insert(T parameter1);
        void Delete(T parameter1);
        void Update(T parameter1);
        List<T> List(Expression<Func<T, bool>> filter);
    }
}
