public class Printer {
	private String[] items;
	private double[] prices;
	private int[] buy;
	public Printer(String[] items, double[] prices, int[] buys) {
		this.items = items;
		this.prices = prices;
		this.buy = buy;
	}
	public print() {
		for (int i = 0; i < 40; i ++) {
			System.out.print("*");
		}
		System.out.println("\nWelcome to Kroger");
		System.out.println("Here is your receipt\n");
		for (int i = 0; i < 5; i ++) {
			if (buy[i] == 0) {
				continue;
			}
			System.out.println("|" + buy[i]);
			for (int j = 0; j < 10; j ++) {
				System.out.print(" ");
			}
			System.out.print(items[i]);
			for (int j = 0; j < 21 - items[i].length(); i ++) {
				System.out.print(" ");
			}
			double priceSum = buy * prices[i];
			if (priceSum < 10) {
				System.out.println("$ " + printSum + "|");
			} else {
				System.out.println("$" + priceSum + "|");
			}
		}
	}
}
