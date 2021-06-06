using DataAccessLayer.Abstract;
using EntityLayer.Concrete;
using System;
using System.Collections.Generic;
using System.Data.Entity;
using System.Linq;
using System.Linq.Expressions;
using System.Text;
using System.Threading.Tasks;

namespace DataAccessLayer.Concrete
{
    public class WriterRepository : IWriterDal
    {
        Context context1 = new Context();
        DbSet<Writer> _object;
        public void Delete(Writer parameter1)
        {
            throw new NotImplementedException();
        }

        public void Insert(Writer parameter1)
        {
            throw new NotImplementedException();
        }

        public List<Writer> List()
        {
            throw new NotImplementedException();
        }

        public List<Writer> List(Expression<Func<Writer, bool>> filter)
        {
            throw new NotImplementedException();
        }

        public void Update(Writer parameter1)
        {
            throw new NotImplementedException();
        }
    }
}
