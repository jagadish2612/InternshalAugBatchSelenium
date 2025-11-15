package stepdefiniton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {



    @Given("user is on the login page")
    public void userOnLogin()
    {
System.out.println("user is on the login page");
    }

    @When("user enters vlaid credentials")
    public void userEnterCredentials()
    {
System.out.println("user enters vlaid credentials");
    }

    @Then("user should be navigated to the home page")
    public void userShouldBeLog(){
        System.out.println("user should be navigated to the home page");
    }

}
