package day4Homework3GamerBackEnd.abstracts;




import day4Homework3GamerBackEnd.entities.Game;

public abstract class BaseGameManager implements GameSalesService,GameService{
	
	@Override
	public void orderInBulk(Game game) {
	int value = game.getOrderAmount();
	boolean isNewOrder = false;
	if(game.getAmountInStock()<7 ) {
		game.setOrderAmount(12);
    	isNewOrder = true;	
    	value += game.getOrderAmount();
	    System.out.println(game.getGameTitle() + " oyunu stoklarimizda gecici sure ile bulunmamaktadir.");
			    	
		    	
	}
	System.out.println("Yeni siparis olacak mi : (" + isNewOrder + ") " + value);
				
	}
	@Override
	public void addDiscount(Game game) {
		System.out.println("Indirimli Fiyat (" + game.getGameTitle() +"): " + game.getPriceAfterDiscount());
	}

	@Override
	public void giveGifts(Game game) {
		System.out.println("Bu alisveristen kazandigin puan tutari : " + game.getMarketValue()*game.getGiftAmount()/100);				
	}

	@Override
	public void updateStock(Game game) {
		System.out.println("Su anki stok (" + game.getGameTitle() + ") : " +game.getAmountInStock());
		game.setAmountInStock(game.getAmountInStock() + game.getOrderAmount());
		System.out.println("Forecasted (" + game.getGameTitle() + ") : " +game.getAmountInStock());
	}
	@Override
	public void addNew(Game game) {
		System.out.println(game.getGameTitle() + " eklendi");
	}
	
	

	

}
