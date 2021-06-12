package day4Homework3GamerBackEnd.concretes;

import day4Homework3GamerBackEnd.abstracts.GamerCheckService;
import day4Homework3GamerBackEnd.entities.Gamer;

public class GamerCheckManager implements GamerCheckService{

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		return true;
	}

}
