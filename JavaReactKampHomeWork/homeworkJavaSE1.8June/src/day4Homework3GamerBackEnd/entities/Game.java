package day4Homework3GamerBackEnd.entities;

public class Game {
	int id;
	String gameTitle;
	double marketValue;
	double discountAmount;
	double giftAmount;
	double priceAfterDiscount;	
	int orderAmount;
	int amountInStock;
	
	public Game() {
		super();
	}
	public Game(int id, String gameTitle, double marketValue, double discountAmount, double giftAmount,
			int orderAmount,int amountInStock) {
		super();
		this.id = id;
		this.gameTitle = gameTitle;
		this.marketValue = marketValue;
		this.discountAmount = discountAmount;
		this.giftAmount = giftAmount;
		this.orderAmount = orderAmount;
		this.amountInStock = amountInStock;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGameTitle() {
		return gameTitle;
	}
	public void setGameTitle(String gameTitle) {
		this.gameTitle = gameTitle;
	}
	public double getMarketValue() {
		return marketValue;
	}
	public void setMarketValue(double marketValue) {
		this.marketValue = marketValue;
	}
	public double getDiscountAmount() {
		return discountAmount;
	}
	public void setDiscountAmount(double discountAmount) {
		this.discountAmount = discountAmount;
	}
	public double getGiftAmount() {
		return giftAmount;
	}
	public void setGiftAmount(double giftAmount) {
		this.giftAmount = giftAmount;
	}
	public int getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(int orderAmount) {
		this.orderAmount = orderAmount;
	}
	public double getPriceAfterDiscount() {
		return this.marketValue-(this.marketValue*this.discountAmount/100);
	}
	public int getAmountInStock() {
		return amountInStock;
	}
	public void setAmountInStock(int amountInStock) {
		this.amountInStock = amountInStock;
	}
	@Override
	public String toString() {
		return "Game [id=" + id + ", gameTitle=" + gameTitle + ", marketValue=" + marketValue + ", discountAmount="
				+ discountAmount + ", giftAmount=" + giftAmount
				+ ", orderAmount=" + orderAmount + ", getId()=" + getId() + ", getGameTitle()=" + getGameTitle()
				+ ", getMarketValue()=" + getMarketValue() + ", getDiscountAmount()=" + getDiscountAmount()
				+ ", getGiftAmount()=" + getGiftAmount() + ", getOrderAmount()=" + getOrderAmount()
				+ ", getPriceAfterDiscount()=" + getPriceAfterDiscount() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	

}
