package Stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;

public class RegistrationStepDefi {

	@Given("user is on registration page")
	public void user_is_on_registration_page() {
	    
	}

	@When("user enters following user details")
	public void user_enters_following_user_details(DataTable dataTable) {
		List<List<String>> userList = dataTable.asLists(String.class);
		for(List<String> e : userList)
		{
			System.out.println(e);
		}
	}
	@When("user enters following user details with columns")
	public void user_enters_following_user_details_with_columns(DataTable dataTable) {
		List<Map<String,String>> userMap = dataTable.asMaps(String.class,String.class);
		
			System.out.println(userMap);
			System.out.println(userMap.get(0).get("Lname"));
		}
	


	@Then("User is able to login")
	public void user_is_able_to_login() {
	   System.out.println("login"); 
	}

}
