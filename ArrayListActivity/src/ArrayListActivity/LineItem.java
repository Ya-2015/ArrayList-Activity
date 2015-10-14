package ArrayListActivity;

public class LineItem {
	private Product product;
	private int quantity;
	private double total;
	
	
	public LineItem(String code, int qty, ProductDB productDB) {
		// TODO Auto-generated constructor stub
		this.quantity = qty;
		
		product = productDB.getProduct(code);
		total = quantity * product.getPrice();
	}

	public double getTotal(){		
		return total;
	}
	
	public String getDescription(){
		return product.getDescription();
	}
	
	public double getPrice(){
		return product.getPrice();
	}
	
	public String getCode(){
		return product.getCode();
	}
	
	public int getQuantity(){
		return quantity;
	}
	
	
}
