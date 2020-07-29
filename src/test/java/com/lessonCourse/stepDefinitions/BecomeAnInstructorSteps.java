package com.lessonCourse.stepDefinitions;

import com.lessonCourse.pages.InstructorPage_furkan;
import com.lessonCourse.utilities.CommonMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class BecomeAnInstructorSteps extends CommonMethods {
    InstructorPage_furkan instructorPageFurkan = new InstructorPage_furkan();

    @Given("User in main page")
    public void user_in_main_page() {
        instructorPageFurkan.assertionHome();
    }

    @Then("User is able to login credentials")
    public void user_is_able_to_login_credentials() {
        instructorPageFurkan.loginToBecomeAnInstructor();
        instructorPageFurkan.credentialInputs();
    }

    @Then("User is able to mover over to categories")
    public void user_is_able_to_mover_over_to_categories() {
        instructorPageFurkan.hoverOnCategories();
    }

    @And("User is able to mover over to academics coaching")
    public void user_is_able_to_mover_over_to_academics_coaching() {
        instructorPageFurkan.hoverAndClickOnCoaching();
    }

    @And("User is able to add aile akademisi")
    public void user_is_able_to_add_akademik_kocluk_and() {
        instructorPageFurkan.basariliAileAkademisiToCart();
    }

    @Then("User is able to add to business coaching")
    public void user_is_able_to_add_to_business_coaching() {
        instructorPageFurkan.businessCoachingToCart();
    }

    @Then("User is able to to verify it is in the card")
    public void user_is_able_to_to_verify_it_is_in_the_card() {
        instructorPageFurkan.moveToCreditCard();

    }

    @Then("User is able to verify total price is same")
    public void user_is_able_to_verify_total_price_is_same() {
        instructorPageFurkan.verifingListOfClasses();
    }
}
