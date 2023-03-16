package test_0315;


public class FruitSales {

	public static void main(String[] args) {
		FruitSeller seller = new FruitSeller();
		FruitBuyer buyer = new FruitBuyer();
		
		buyer.buyApple(2000, seller);
		
		System.out.println("과일판매자의 현재 상황");
		seller.showSaleResult();
		System.out.println("과일구매자의 현재 상황");
		buyer.showBuyResult();

	}

}
class FruitSeller{
	int numofApple=20;
	int myMoney=0;
	private int apple_price=1000;
	public FruitSeller() {}

	public int saleApple(int Money) {
		int num=Money/apple_price;
		numofApple-=num;
		myMoney=numofApple*num;
		return num;
		
	}
	public void showSaleResult() {
		System.out.println("수익 : "+ myMoney);
		System.out.println("남은 사과 개수 : "+ numofApple);
		}
}
class FruitBuyer{
	int numOfApple=0;
	int myMoney = 5000;
	public FruitBuyer() {}
public void buyApple(int Money, FruitSeller seller ) {
		numOfApple += seller.saleApple(Money);
		myMoney -=Money;
		}
public void showBuyResult() {
	System.out.println("잔액 : "+myMoney);
	System.out.println("사과 개수 : "+numOfApple);
	}
	
	}

