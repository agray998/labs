package lab7;
import java.util.*;

public class Program {
	static ArrayDeque<ShoppingBasket> queue = new ArrayDeque<ShoppingBasket>();
	static HashMap<String, Double> products = new HashMap<String, Double>();

	public static void main(String[] args) {
		// part2();
		new Zoo();
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
	
	public static void part2() {
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
		processBaskets();
	}

}
