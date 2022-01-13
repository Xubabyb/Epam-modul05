package by.jonline.modul05.exercise02;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Создать класс Payment с внутренним классом, с помощью объектов которого можно
 * сформировать покупку из нескольких товаров.
 */
public class Payment {
	
	private Order order;
	
	
	public Payment(Product...products) {
		ArrayList<Product> temp =new ArrayList<Product>( Arrays.asList(products));
		this.order = new Order(temp);
	}

	@Override
	public String toString() {
		return String.format("Payment [order=%s]", order);
	}

	public class Order {
		private ArrayList<Product> products;
		private double totalPrice;

		public Order(ArrayList<Product> products) {
			this.products = products;
			this.totalPrice = getTotalPrice();
		}

		public double getTotalPrice() {
			double result = 0;
			for (Product product : products) {
				result += product.getPrice();
			}
			return result;
		}

		@Override
		public String toString() {
			return String.format("Order [products=%s, totalPrice=%s]", products, totalPrice);
		}
		
		

	}
}
