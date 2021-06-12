package day4Homework3GamerBackEnd.entities;

import java.util.GregorianCalendar;

public class Promotion {
	private GregorianCalendar startDate;
	private GregorianCalendar finishDate;
	private int promotionId;
	private String PromotionName;
	private boolean hasLottery;
	private boolean hasCoupon;
	private boolean hasDiscount;
	private String lotteryGift;
	private double saleCouponAmountForNextPurchase;
	private double discountAmountForCurrentPurchase;
	
	public Promotion() {
		super();
	}
	public Promotion(GregorianCalendar startDate, GregorianCalendar finishDate, int promotionId, String promotionName,
			boolean hasLottery, boolean hasCoupon, boolean hasDiscount, String lotteryGift,
			double saleCouponAmountForNextPurchase, double discountAmountForCurrentPurchase) {
		super();
		this.startDate = startDate;
		this.finishDate = finishDate;
		this.promotionId = promotionId;
		PromotionName = promotionName;
		this.hasLottery = hasLottery;
		this.hasCoupon = hasCoupon;
		this.hasDiscount = hasDiscount;
		this.lotteryGift = lotteryGift;
		this.saleCouponAmountForNextPurchase = saleCouponAmountForNextPurchase;
		this.discountAmountForCurrentPurchase = discountAmountForCurrentPurchase;
	}
	
	public GregorianCalendar getStartDate() {
		return startDate;
	}
	public void setStartDate(GregorianCalendar startDate) {
		this.startDate = startDate;
	}
	public GregorianCalendar getFinishDate() {
		return finishDate;
	}
	public void setFinishDate(GregorianCalendar finishDate) {
		this.finishDate = finishDate;
	}
	public int getPromotionId() {
		return promotionId;
	}
	public void setPromotionId(int promotionId) {
		this.promotionId = promotionId;
	}
	public String getPromotionName() {
		return PromotionName;
	}
	public void setPromotionName(String promotionName) {
		PromotionName = promotionName;
	}
	public boolean isHasLottery() {
		return hasLottery;
	}
	public void setHasLottery(boolean hasLottery) {
		this.hasLottery = hasLottery;
	}
	public boolean isHasCoupon() {
		return hasCoupon;
	}
	public void setHasCoupon(boolean hasCoupon) {
		this.hasCoupon = hasCoupon;
	}
	public boolean isHasDiscount() {
		return hasDiscount;
	}
	public void setHasDiscount(boolean hasDiscount) {
		this.hasDiscount = hasDiscount;
	}
	public String getLotteryGift() {
		return lotteryGift;
	}
	public void setLotteryGift(String lotteryGift) {
		this.lotteryGift = lotteryGift;
	}
	public double getSaleCouponAmountForNextPurchase() {
		return saleCouponAmountForNextPurchase;
	}
	public void setSaleCouponAmountForNextPurchase(double saleCouponAmountForNextPurchase) {
		this.saleCouponAmountForNextPurchase = saleCouponAmountForNextPurchase;
	}
	public double getDiscountAmountForCurrentPurchase() {
		return discountAmountForCurrentPurchase;
	}
	public void setDiscountAmountForCurrentPurchase(double discountAmountForCurrentPurchase) {
		this.discountAmountForCurrentPurchase = discountAmountForCurrentPurchase;
	}
	@Override
	public String toString() {
		return "PromotionName=" + PromotionName + ", hasLottery=" + hasLottery + ", hasCoupon=" + hasCoupon
				+ ", hasDiscount=" + hasDiscount + ", lotteryGift=" + lotteryGift + ", saleCouponAmountForNextPurchase="
				+ saleCouponAmountForNextPurchase + ", discountAmountForCurrentPurchase="
				+ discountAmountForCurrentPurchase +", getPromotionId()=" + getPromotionId() + ", getPromotionName()="
				+ getPromotionName() + ", isHasLottery()=" + isHasLottery() + ", isHasCoupon()=" + isHasCoupon()
				+ ", isHasDiscount()=" + isHasDiscount() + ", getLotteryGift()=" + getLotteryGift()
				+ ", getSaleCouponAmountForNextPurchase()=" + getSaleCouponAmountForNextPurchase()
				+ ", getDiscountAmountForCurrentPurchase()=" + getDiscountAmountForCurrentPurchase() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
