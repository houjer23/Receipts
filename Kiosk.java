import java.util.Scanner;
public class Kiosk { // The main class, gets input and print out ticket
	public static void main(String[] args) { // Where the code runs
		String[] items = {"cups of milk", "briskets", "beef", "lamb", "stacks of bread"};
		double[] prices = {5.99, 6.99, 8.99, 10.99, 3.99};
		int[] buy = new int[5];
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 5; i ++) {
			System.out.println(items[i] + " costs " + prices[i] + " dollars");
			System.out.print ("How much " + items[i] + " do you want to buy? ");
			buy[i] = scan.nextInt();
		}
		Printer ticket = new Printer(items, prices, buy);
		ticket.print();
	}
}
