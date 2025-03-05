package Stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Ubercarbook {

	@Given("User wants to select a car type {string} from uber app")
	public void user_wants_to_select_a_car_type_from_uber_app(String carType) {
	    System.out.println("step 1 my cartype:" +carType);
	}

	@When("user select car {string} and pick up point as {string} and drop location {string}")
	public void user_select_car_and_pick_up_point_as_and_drop_location(String carType , String pickUplocation, String droplocation) {
		System.out.println("step 2 :" +carType+" "+pickUplocation+" "+droplocation);
	}

	@Then("driver starts the journey")
	public void driver_starts_the_journey() {
  System.out.println("step 3");
	}

	@Then("driver ends the journey")
	public void driver_ends_the_journey() {
	    System.out.println("step 4");
	}

	@Then("user pay {int} USD")
	public void user_pay_usd(Integer price) {
	    System.out.println("step 5 print the price: " +price);
	}



}
