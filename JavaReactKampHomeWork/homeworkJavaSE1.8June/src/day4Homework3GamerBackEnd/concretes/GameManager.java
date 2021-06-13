package day4Homework3GamerBackEnd.concretes;

import day4Homework3GamerBackEnd.abstracts.BaseGameManager;
public class GameManager extends BaseGameManager{
	BaseGameManager baseGameManager;
	
	public GameManager() {
		super();
	}

	GameManager(BaseGameManager baseGameManager){
		this.baseGameManager = baseGameManager;
	}

}
