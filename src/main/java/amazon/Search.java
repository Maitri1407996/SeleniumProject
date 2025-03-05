package amazon;

public class Search {
	
	public String displayproduct(Product product) {
		
		if(product.getProductList().contains(product.getProductName()))
		{
			return product.getProductName();
		}
		return null;
	}

}
