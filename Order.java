import java.util.Scanner;
public class Order { // Order class stores three variables, each with different type
	String[] items = {"cups of milk", "briskets", "beef", "lamb", "stacks of bread"};
	double[] prices = {5.99, 6.99, 8.99, 10.99, 3.99};
	int[] buy = new int[5];
	public Order() {} // constructor
	public void buy() { // buy method asks for using input for quantity
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 5; i ++) {
			System.out.println(items[i] + " costs " + prices[i] + " dollars");
			System.out.print ("How much " + items[i] + " do you want to buy? ");
			buy[i] = scan.nextInt();
		}
	}
}
