package Stepdefination;

import amazon.Product;
import amazon.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class AmazoneSearchSteps {
 Product product;
 Search search;
	@Given("I have a field on Amazon page")
	public void i_have_a_field_on_amazon_page() {
		System.out.println("step 1");
		
	    
	}

	@When("I search for product with name {string} and price {int}")
	public void i_search_for_product_with_name_and_price(String productName, Integer price) {
		System.out.println("step 2:print the product:" +productName+ "price:" +price);
	    product = new Product(productName,price);
	}

	@Then("product with {string} should display")
	public void product_with_should_display(String productName) {
		System.out.println("step 3: dispaly the product:"+productName);
		search = new Search();
		String name =search.displayproduct(product);
		System.out.println("searched product " +name);
		Assert.assertEquals(product.getProductName(),name);
		
		
	}
		@Given("I have a field on Amazon page on")
		public void i_have_a_field_on_amazon_page_on() {
		    
		}



	}




