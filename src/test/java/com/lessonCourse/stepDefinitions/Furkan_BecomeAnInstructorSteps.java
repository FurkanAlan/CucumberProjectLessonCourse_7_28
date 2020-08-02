//package com.lessonCourse.stepDefinitions;
//
//import com.lessonCourse.pages.InstructorPage_Furkan;
//import com.lessonCourse.utilities.CommonMethods;
//import com.lessonCourse.utilities.ConfigurationReader;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import org.junit.Assert;
//
//public class Furkan_BecomeAnInstructorSteps extends CommonMethods {
////    InstructorPage_Furkan instructorPageFurkan = new InstructorPage_Furkan();
//
//    @Given("User in main page")
//    public void user_in_main_page() {
//        String actualTitle = iPageFurkan.exploreLessons.getText();
//        String expectedTitle = "Explore Lessons";
//        Assert.assertEquals("Assertion is successful", actualTitle, expectedTitle);
//    }
//
//    @Then("User is able to login credentials")
//    public void user_is_able_to_login_credentials() {
//        slpMyDriver(1000);
//        jsClickWithWaitForVisibility(iPageFurkan.becomeAnInstructor);
//        slpMyDriver(1000);
//
//        iPageFurkan.userName.clear();
//        sendText(iPageFurkan.userName, ConfigurationReader.getProperty("username"));
//        slpMyDriver(1000);
//        iPageFurkan.passWord.clear();
//        sendText(iPageFurkan.passWord, ConfigurationReader.getProperty("password"));
//        slpMyDriver(4000);
//        jsClick(iPageFurkan.loginToAccount);
//    }
//
//    @Then("User is able to mover over to categories")
//    public void user_is_able_to_mover_over_to_categories() {
//        slpMyDriver(5000);
//        moveTo(iPageFurkan.categories);
//        slpMyDriver(2000);
//    }
//
//    @And("User is able to mover over to academics coaching")
//    public void user_is_able_to_mover_over_to_academics_coaching() {
//        slpMyDriver(4000);
//        moveTo(iPageFurkan.coaching);
//        slpMyDriver(2000);
//        jsClick(iPageFurkan.coaching);
//    }
//
//    @And("User is able to add aile akademisi")
//    public void user_is_able_to_add_akademik_kocluk_and() {
//        slpMyDriver(5000);
//        moveTo(iPageFurkan.basariliAileAkademisi);
//        slpMyDriver(5000);
//        jsClick(iPageFurkan.addToCartAileAkademisi);
//    }
//
//    @Then("User is able to add to business coaching")
//    public void user_is_able_to_add_to_business_coaching() {
//        slpMyDriver(5000);
//        moveTo(iPageFurkan.businessCoaching);
//        slpMyDriver(5000);
//        jsClick(iPageFurkan.addToCartBCoaching);
//    }
//
//    @Then("User is able to to verify it is in the card")
//    public void user_is_able_to_to_verify_it_is_in_the_card() {
//        slpMyDriver(5000);
//        jsClick(iPageFurkan.checkingCreditCard);
//        slpMyDriver(5000);
//    }
////
////    @Then("User is able to verify total price is same")
////    public void user_is_able_to_verify_total_price_is_same() {
////    }
//}
