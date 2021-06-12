using Day5Homework5GamerBackEnd.Abstracts;
using Day5Homework5GamerBackEnd.Concretes;
using MernisServiceReference;
using System;
using System.Collections.Generic;
using System.Text;

namespace Day5Homework5GamerBackEnd.Adapters
{
    public class MernisServiceAdapter : IGamerCheckService
    {
        public bool CheckIfRealPerson(Gamer gamer)
        {
            //ArrayList-->> Generic List İn Connected Services Datatypes Options Window or TCKimlikDogrula Async won't work 
            KPSPublicSoapClient client = new KPSPublicSoapClient(KPSPublicSoapClient.EndpointConfiguration.KPSPublicSoap);
            return client.TCKimlikNoDogrulaAsync(new TCKimlikNoDogrulaRequest(new TCKimlikNoDogrulaRequestBody(Convert.ToInt64(gamer.NationalityId), gamer.FirstName.ToUpper(), gamer.LastName.ToUpper(), gamer.DateOfBirth.Year))).Result.Body.TCKimlikNoDogrulaResult;
        }
    }
}
