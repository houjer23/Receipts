import java.util.Scanner;
public class Kiosk { // The main class, gets input and print out ticket
	public static void main(String[] args) { // Where the code runs
		Order userOrder = new Order();
		userOrder.buy();
		Printer ticket = new Printer(userOrder);
		ticket.print();
	}
}
