package Steps;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps extends BaseClass {
	private static LoginPage loginPage;
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		BaseClass.initialization();
	   
	}

	@When("user enter loginId and Password")
	public void user_enter_login_id_and_password() {
		loginPage = new LoginPage();
		String Username = prop.getProperty("USERNAME");
		String Password = prop.getProperty("PASSWORD");
		loginPage.userEnterLoginIdAndPassword(Username, Password);
	
	}

	@Then("user click on login button")
	public void user_click_on_login_button() {
		
		loginPage.userClickOnLoginButton();
	 
	}

}
