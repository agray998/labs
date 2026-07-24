package lab7;

public class ShoppingBasketItem {
	String productName;
	int quantity;
	double price;
	
	ShoppingBasketItem(String p, int q, double pr) {
		this.productName = p;
		this.quantity = q;
		this.price = pr;
	}
	
	public String getDetails() {
		return String.format("%d of %s @ %.2f", this.quantity, this.productName, this.price);
	}
}
