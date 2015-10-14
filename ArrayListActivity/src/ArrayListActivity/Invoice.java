package ArrayListActivity;

import java.util.ArrayList;

public class Invoice {
	ArrayList<LineItem> items = new ArrayList<LineItem>();
	ProductDB productDB = new ProductDB();
	
	public ArrayList<LineItem> getItems(){
		return items;
	}
	
	public boolean isExist(String code){
		return productDB.isItemExist(code);
	}
	
	public void retrieveProduct(String code, int qty){
		items.add(new LineItem(code, qty, productDB));
	}
	
	public double getInvoiceTotal(){
		double total = 0;
				
		for (LineItem item : items){
			total += item.getTotal();
		}
		
		return total;
	}
}
