package stepdefinition;

import static pages.HomePage.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import static pages.HomePage.Clickmenu;

public class Home_page {
@Given("user navigates to the login page")
    public void user_navigates_to_the_login_page() throws InterruptedException {
    Clickmenu();
    ClickOnSignIn_link();


    }


}

