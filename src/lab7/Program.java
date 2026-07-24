package lab7;
import java.util.*;

public class Program {
	static ArrayDeque<ShoppingBasket> queue = new ArrayDeque<ShoppingBasket>();
	static HashMap<String, Double> products = new HashMap<String, Double>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		products.put("chocolate bar", 2.5);
		products.put("kitchen roll", 1.2);
		products.put("garden trowel", 2.0);
		if (products.containsKey("garden trowel")) {
			products.put("garden trowel", 3.0);
		}
		for (String s : products.keySet()) {
			products.put(s, products.get(s) * 1.02);
		}
		ShoppingBasketItem it;
		ShoppingBasket b;
		String[] prods = {"chocolate bar", "kitchen roll", "garden trowel", "chocolate bar", "chocolate bar"};
		for (int i = 0; i < prods.length; i++) {
			it = new ShoppingBasketItem(prods[i], prods.length - i, products.get(prods[i]));
			b = new ShoppingBasket();
			b.add(it);
			queue.offer(b);
		}
//		ShoppingBasketItem i1 = new ShoppingBasketItem("chocolate bar", 3, 0.7);
//		ShoppingBasketItem i2 = new ShoppingBasketItem("kitchen roll", 2, 1.2);
//		ShoppingBasketItem i3 = new ShoppingBasketItem("garden trowel", 1, 2.0);
//		ShoppingBasket b1 = new ShoppingBasket();
//		ShoppingBasket b2 = new ShoppingBasket();
//		ShoppingBasket b3 = new ShoppingBasket();
//		b1.add(i1);
//		b2.add(i2);
//		b3.add(i3);
//		//System.out.println(b1.items.get(0).getDetails());
//		queue.offer(b1);
//		queue.offer(b2);
//		queue.offer(b3);
		processBaskets();
	}
	
	public static void processBaskets() {
		ShoppingBasket b;
		while (!queue.isEmpty()) {
			b = queue.poll();
			for (ShoppingBasketItem i : b.items) {
				System.out.println(i.getDetails());
			}
		}
	}

}
