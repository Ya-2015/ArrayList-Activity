package ArrayListActivity;

import java.util.HashMap;

public class ProductDB {
	private HashMap<String, Product> products = new HashMap<String, Product>();
	
	public ProductDB(){
		products.put("java", new Product("java", 8.3, "Murach's Beginning Java"));
		products.put("jsps", new Product("jsps", 9.3, "Murach's Java Servlets and JSP"));
		products.put("html", new Product("html", 10.3, "Design and Build Websites"));
	}
	
	public Product getProduct(String code){
		if(products.containsKey(code)){
			return products.get(code);
		}else{
			return null;
		}
	}
	
	public boolean isItemExist(String code){
		if(products.containsKey(code)){
			return true;
		}else{
			return false;
		}
	}
}
