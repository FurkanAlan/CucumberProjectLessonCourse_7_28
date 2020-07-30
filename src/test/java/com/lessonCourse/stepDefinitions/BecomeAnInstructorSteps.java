package com.lessonCourse.stepDefinitions;

import com.lessonCourse.Pages.VahidPages;
import com.lessonCourse.utilities.CommonMethods;
import com.lessonCourse.utilities.MyDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class BecomeAnInstructorSteps extends CommonMethods {
    VahidPages pages =new VahidPages();

    @Then("I wait for (\\w+) be visible")
    public void i_wait_for_element_be_visible(String element) {
      //  getWaitObject().until(ExpectedConditions.elementToBeClickable(element));

    }

    @Then("I wait for (\\w+) milliseconds")
    public void i_wait_for_milliseconds(long waitTime) throws InterruptedException {
        Thread.sleep(waitTime);


    }

    @Given("I navigate to home page")
    public void i_navigate_to_home_page() {
    }

    @When("I click on Become an intructor")
    public void i_click_on_Become_an_intructor() throws InterruptedException {
        //jsClickWithWaitForVisibility(pages.becomeInstructor);
      //  waitForClickability(pages.becomeInstructor);
        jsClick(pages.becomeInstructor);


    }

    @Then("I enter username and password")
    public void i_enter_username_and_password() {
        sendText(pages.userName,"guruautomation04@gmail.com");
        sendText(pages.password,"test1234");

    }

    @Then("I click on log-in button")
    public void i_click_on_log_in_button() {
        jsClick(pages.login);

    }

    @Given("I click on categories")
    public void i_click_on_categories() {
        moveTo(pages.categories);

    }

    @Then("I mouse over on academic coaching")
    public void i_mouse_over_on_academic_coaching() {
        moveTo(pages.coaching);
        jsClickWithWaitForVisibility(pages.academicCoaching);
        jsClick(pages.academicCoaching);


    }

    @Then("I click on Basic coaching skills")
    public void i_click_on_Basic_coaching_skills() {
      //  moveTo(pages.basicCoachingSkills);
        moveTo(pages.educationCoaching);

    }

    @Then("I click on add to card")
    public void i_click_on_add_to_card() throws InterruptedException {
       // jsClick(pages.addToCart);
        Thread.sleep(6000);

    }

    @Then("verify it is in the card with checking price")
    public void verify_it_is_in_the_card_with_checking_price() {

        jsClickWithWaitForVisibility(pages.checkingCreditCard);




        String expected="Your Items";
        String actual= MyDriver.get().findElement(By.xpath("//div[contains(text(),'Your Items')]")).getText();
        Assert.assertEquals(expected,actual);


    }

}
