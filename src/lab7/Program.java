package lab7;
import java.util.*;

public class Program {
	static Queue<ShoppingBasket> q = new ArrayDeque<ShoppingBasket>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShoppingBasketItem i = new ShoppingBasketItem("chocolate bar", 3, 0.7);
		ShoppingBasket b = new ShoppingBasket();
		b.add(i);
		System.out.println(b.items.get(0).getDetails());
	}

}
