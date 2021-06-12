package day4Homework3GamerBackEnd.abstracts;

import day4Homework3GamerBackEnd.entities.Gamer;

public interface GamerCheckService {
	boolean checkIfRealPerson(Gamer gamer);
}
