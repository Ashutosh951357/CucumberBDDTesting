package stepdefinition;

import io.cucumber.java.en.When;

import static pages.LoginPage.*;

public class Loginpage {

    @When("user successfully enter login details")
    public void user_successfully_enter_login_details() throws InterruptedException {
        Sendkey_Username();
        Sendkey_password();
        click_Login();

    }
}