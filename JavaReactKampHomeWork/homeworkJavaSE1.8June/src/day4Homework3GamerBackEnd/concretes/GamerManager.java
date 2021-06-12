package day4Homework3GamerBackEnd.concretes;

import day4Homework3GamerBackEnd.abstracts.BaseGamerManager;
import day4Homework3GamerBackEnd.abstracts.GamerCheckService;
import day4Homework3GamerBackEnd.entities.Gamer;

public class GamerManager extends BaseGamerManager{
	private GamerCheckService _gamerCheckService;
	public GamerManager(GamerCheckService gamerCheckService) {
		this._gamerCheckService = gamerCheckService;
		
	}
	public void save(Gamer gamer) {
		
		if(_gamerCheckService.checkIfRealPerson(gamer))
		{
			System.out.println("Gamer Manager : validation successfull");
			super.save(gamer);	
		}else {
			System.out.println("Not a valid person");
		}
		
		
	}

}
