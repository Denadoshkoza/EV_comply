package com.ev_comply.Step_definitions;

import com.ev_comply.Pages.BasePage;
import com.ev_comply.Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class EV_step_Def {

    @Given("user navigates to {string}")
    public void user_navigates_to(String url) {
        Driver.get().get(url);
    }

    @Then("the user can see {string} is displayed on the page")
    public void the_user_can_see_is_displayed_on_the_page(String expected) {
        BasePage.findElementIfDisplayed(expected);
    }
}
