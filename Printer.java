/*
 * Jerry Hou
 * Class for printing out the ticket
 */
public class Printer { // Class for printing out the ticket
	private Order userOrder;
	public Printer(Order userOrder) { // Construction of the class
		this.userOrder = userOrder;
	} // end of Printer constructor
	public void print() { // Method used for printing the ticket
		System.out.println("\n*****************************************");
		System.out.println("|Welcome to Kroger                      |");
		System.out.println("|Here is your receipt                   |");
		System.out.println("|                                       |");
		System.out.print("|Qty        Description/Name      Price |");
		System.out.println();
		double sum = 0;
		for (int i = 0; i < 5; i ++) { // Loop throught each index
			if (userOrder.buy[i] == 0) {
				continue;
			}
			System.out.print("|" + userOrder.buy[i] + "          " + " " + userOrder.items[i]);
			for (int j = 0; j < 21 - userOrder.items[i].length(); j ++) { // printing spaces between name and price
				System.out.print(" ");
			}
			double priceSum = userOrder.buy[i] * userOrder.prices[i];
			sum += priceSum;
			if (priceSum < 10) {
				System.out.println("$ " + priceSum + "|");
			} else {
				System.out.println("$" + priceSum + "|");
			}
		} // end of the for loop
		System.out.println("|                                       |");
		System.out.println("|               Subtotal   $" + String.format("%.2f", sum) + "       |");
		double tax = (double) Math.round(sum * 0.07 * 100) / 100; // round tax to two decimals
		System.out.println("|               Tax 7%     $ " + String.format("%.2f", tax) + "       |");
		System.out.println("|               Total      $" + String.format("%.2f", tax + sum) + "       |");
		System.out.println("*****************************************");
	} // end of printer method
}
