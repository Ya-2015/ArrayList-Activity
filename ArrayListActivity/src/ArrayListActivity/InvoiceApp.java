package ArrayListActivity;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class InvoiceApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int QTY_MIN = 0;
		final int QTY_MAX = 50;
		
		Scanner scan = new Scanner(System.in);
		Validator validator = new Validator();
		Invoice invoice = new Invoice();
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		
		System.out.println("Welcome to the invoice application.");
		
		String code;
		int qty;
		
		do{
			int counter = 0;
			do{
				if (counter == 0){
					System.out.print("\nEnter product code: ");
				}else{
					System.out.print("Make sure to enter correct product code: ");
				}
				code = scan.next();
				counter++;
			}while(!invoice.isExist(code));
			
			
			do{
				System.out.printf("Enter quantity between %d and %d: ", QTY_MIN, QTY_MAX);
				qty = scan.nextInt();
			}while(!validator.checkRange(qty, QTY_MIN, QTY_MAX));
			
			invoice.retrieveProduct(code, qty);
			
			System.out.print("Another line item? (y/n): ");
		
		}while(scan.next().equalsIgnoreCase("y"));
		
		//
		System.out.println("\nCode" + "\t" + String.format("%-35s", "Description") + "\t" + "Price" + "\t" + "Qty" + "\t" + "Total");
		System.out.println("----" + "\t" + String.format("%-35s", "-----------") + "\t" + "-----" + "\t" + "---" + "\t" + "-----");
		
		ArrayList<LineItem> allItems = invoice.getItems();
		
		for (LineItem item : allItems){
			System.out.println(item.getCode() + "\t" + String.format("%-35s", item.getDescription()) + "\t" + formatter.format(item.getPrice()) + "\t" + item.getQuantity() + "\t" + formatter.format(item.getTotal()));
		}
		
		System.out.println("\n\t\t\t\t\t\tInvoice Total: " + formatter.format(invoice.getInvoiceTotal()));
		
		scan.close();
		
	}

}
