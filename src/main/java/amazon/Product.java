package amazon;

import java.util.ArrayList;
import java.util.List;

public class Product {
 String productName;
 int price;
public Product(String productName, int price) {
	
	this.productName = productName;
	this.price = price;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public List<String> getProductList(){
	List<String> productList = new ArrayList<>();
	productList.add("apple macbook");
	productList.add("apple macbook pro");
	productList.add("apple macbook max");
	productList.add("apple iPhone");
	return productList;
}
}
