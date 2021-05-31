using System.Web;
using System.Web.Mvc;

namespace MvcProjeKampiJune2021
{
    public class FilterConfig
    {
        public static void RegisterGlobalFilters(GlobalFilterCollection filters)
        {
            filters.Add(new HandleErrorAttribute());
        }
    }
}
