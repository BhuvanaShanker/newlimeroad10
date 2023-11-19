package com.Cucumber.New_stepDefin;

import com.Cucumber.NewLimeRoad.Base_LimeRoad;

import NewLimeRoad_Project.PageObjectManager01;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class New_StepDef extends Base_LimeRoad  {
	PageObjectManager01 pom1 = PageObjectManager01.getPom1();

	@Given("We can able to launch the {string} browser")
	public void we_can_able_to_launch_the_browser(String string) {
		getDriver(string);
	}

	@Given("we can able to launch the application url {string}")
	public void we_can_able_to_launch_the_application_url(String string) {
		driver.manage().window().maximize();
		getUrl(string);
		
	}

	@When("We can able to click the Men product")
	public void we_can_able_to_click_the_men_product() throws InterruptedException {
		Thread.sleep(4000);
		moveToElement(pom1.getNew_Lime().getChoose_Men());
	}

	@When("We can able to click the T-shirt product")
	public void we_can_able_to_click_the_t_shirt_product() {
		clickOnWebelement(pom1.getNew_Lime().getSub_Product());
	}

	@When("We can able to select the branb bee")
	public void we_can_able_to_select_the_branb_bee() throws InterruptedException {
		Thread.sleep(5000);
		clickOnWebelement(pom1.getNew_Lime().getBrand());
		Thread.sleep(10000);
		clickOnWebelement(pom1.getNew_Lime().getBee());
	}

	@When("We can able to choose the product")
	public void we_can_able_to_choose_the_product() throws InterruptedException {
		Thread.sleep(4000);
	    clickOnWebelement(pom1.getNew_Lime().getChoose_Dress());
	}

	@When("We can able to choose the size")
	public void we_can_able_to_choose_the_size() throws InterruptedException {
	  Thread.sleep(4000);
	  clickOnWebelement(pom1.getNew_Lime().getSize());
	}

	@Then("We can able to Add the product in our cart")
	public void we_can_able_to_add_the_product_in_our_cart() throws InterruptedException {
	  Thread.sleep(4000);
      clickOnWebelement(pom1.getNew_Lime().getAddtocart());
	}
}
