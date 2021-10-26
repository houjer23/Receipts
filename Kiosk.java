/*
 * Jerry Hou
 * The main class, gets user input and print out ticket
 */
import java.util.Scanner;
public class Kiosk { // The main class, gets input and print out ticket
	public static void main(String[] args) { // Where the code runs
		System.out.println("\nPleace choose how many items do you want to buy");
		Order userOrder = new Order();
		userOrder.buy();
		Printer ticket = new Printer(userOrder);
		ticket.print();
	} // end of main method
} // end of Kiosk class
