package day4Homework3GamerBackEnd.abstracts;

import day4Homework3GamerBackEnd.entities.Gamer;

public abstract class BaseGamerManager implements GamerService{
	@Override
	public void save(Gamer gamer) {
		System.out.println("Saved to database : " + gamer.getFirstName());
	}
	

}
