package com.lessonCourse.stepDefinitions;

import com.lessonCourse.pages.InstructorPage_Turker;
import com.lessonCourse.utilities.CommonMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Turker_BecomeAnInstructorSteps extends CommonMethods {
//    InstructorPage_Turker iPageTurker = new InstructorPage_Turker();
    @Given("User in main page")
    public void user_in_main_page() {
        iPageTurker.assertionHome();
    }

    @Then("User is able to login credentials")
    public void user_is_able_to_login_credentials() {
        iPageTurker.loginToBecomeAnInstructor();
        iPageTurker.credentialInputs();
    }


    @Then("User is able to hover on categories")
    public void user_is_able_to_categories() {
        iPageTurker.hoverOnCategories();
    }


    @Then("User is able to mover over to academics coaching")
    public void user_is_able_to_mover_over_to_academics_coaching() {
        iPageTurker.hoverAndClickOnCoaching();
    }


    @Then("User is able to choose business group coaching")
    public void user_is_able_to_choose_basic_coaching_skills() {
        iPageTurker.businessCoaching();
    }

    @Then("User is able to play video")
    public void user_is_able_to_play_video() {
        iPageTurker.sizeOfFrames();
        iPageTurker.playVideoMetod();
    }

}
