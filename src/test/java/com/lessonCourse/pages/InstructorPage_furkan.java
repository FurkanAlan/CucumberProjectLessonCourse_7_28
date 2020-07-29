package com.lessonCourse.pages;

import com.lessonCourse.utilities.CommonMethods;
import com.lessonCourse.utilities.ConfigurationReader;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class InstructorPage_furkan extends CommonMethods {

    @FindBy(xpath = "//a[contains(text(),'Explore Lessons')]")
    public WebElement exploreLessons;

    @FindBy(xpath = "//div[@id='toolbar']//div//span[contains(text(),'Become an Instructor')]")
    public WebElement becomeAnInstructor;

    @FindBy(name = "username")
    public WebElement userName;

    @FindBy(name = "password")
    public WebElement passWord;

    @FindBy(xpath = "//span[contains(text(),'LOG IN')]")
    public WebElement loginToAccount;

    @FindBy(xpath = "(//span[contains(text(),'Categories')])[1]")
    public WebElement categories;

    @FindBy(how = How.XPATH, using = "//div[@translate = 'CAT.COA.NAME']")
    public WebElement coaching;

//    @FindBy(how = How.XPATH, using = "//div[@translate = 'CAT.COA.ACA']]")
//    public WebElement academicCoaching;

    //   //img[@src='api/files/course/25098273-3a18-44d6-acfa-e87a920d759c']
    @FindBy(xpath = "//*[text()='Başarılı Aile Akademisi']")
    public WebElement basariliAileAkademisi;

    //muhtemelen sadece id ler de yeterli olur
    @FindBy(xpath = "//ngcart-addtocart[@id='5c6f81e14d1738427fdeeb42']//button[1][@ng-click= 'ngCart.addItem(id, name, price, q, data)']")
    public WebElement addToCartAileAkademisi;

    @FindBy(how = How.XPATH, using = "(//div[@ng-if='item.price']//span[2][text()='$80.00'])[2]")
    public WebElement basariliAileAkademisiPrice;

    @FindBy(xpath = "//img[@src='api/files/course/4ab153dc-dd72-4073-af97-f24adfcdea37']")
    public WebElement businessCoaching;

    @FindBy(xpath = "//ngcart-addtocart[@id='5c72a82b97612843aab584e2']//button[1][@ng-click= 'ngCart.addItem(id, name, price, q, data)']")
    public WebElement addToCartBCoaching;

    //   //div[@ng-if='item.price']//span[2][text()='$150.00']
    //   /(//div[@ng-if='item.price']//span[2][@class='ng-binding'][text()='$150.00'])[2]
    @FindBy(xpath = "(//div[@ng-if='item.price']//span[2])[10]")
    public WebElement businessCoachingPrice;

    @FindBy(how = How.XPATH, using = "//ngcart-summary[@class='ng-isolate-scope']")
    public WebElement checkingCreditCard;

    @FindBy(how = How.XPATH, using = "//td[contains(text(),'Aile Akademisi')]")
    public WebElement verifyingAileAkademesiInCard;

    @FindBy(how = How.XPATH, using = "//td[contains(text(),'Business Coaching')]")
    public WebElement verifyingBusinessCoachingInCard;

    @FindBy(how = How.XPATH, using = "//td[contains(text(),'$230.00')]")
    public WebElement verifyingTotalPrice;


    public void assertionHome() {
        String actualTitle = exploreLessons.getText();
        String expectedTitle = "Explore Lessons";
        Assert.assertEquals("Assertion is successful", actualTitle, expectedTitle);
    }

    public void loginToBecomeAnInstructor() {
        slpMyDriver(1000);
        jsClickWithWaitForVisibility(becomeAnInstructor);
        slpMyDriver(1000);
    }

    public void credentialInputs() {
        userName.clear();
        sendText(userName, ConfigurationReader.getProperty("username"));
        slpMyDriver(1000);
        passWord.clear();
        sendText(passWord, ConfigurationReader.getProperty("password"));
        slpMyDriver(1000);
        jsClickWithWaitForVisibility(loginToAccount);
    }


    public void hoverOnCategories() {
//        waitForClickability(categories);
        waitForVisibility(categories);
        moveTo(categories);
        slpMyDriver(2000);
    }

    public void hoverAndClickOnCoaching() {
        waitForVisibility(coaching);
        moveTo(coaching);
        slpMyDriver(2000);
        jsClick(coaching);
    }

    public void basariliAileAkademisiToCart() {
//        waitForClickability(basariliAileAkademisi);
//        scrollIntoElement(basariliAileAkademisi);
        scrollUpSecond(20);
//        moveTo(basariliAileAkademisi);
//        moveTo(addToCartAileAkademisi);
//        jsClick(addToCartAileAkademisi);
        slpMyDriver(5000);
//        cartAdder(basariliAileAkademisi, addToCartAileAkademisi, 1000);
    }

    public void businessCoachingToCart() {

        scrollIntoElement(businessCoaching);
        waitForVisibility(businessCoaching);
        moveTo(businessCoaching);
        slpMyDriver(1000);
        waitForVisibility(addToCartBCoaching);
        moveTo(addToCartBCoaching);
        jsClickWithWaitForVisibility(addToCartBCoaching);
//        cartAdder(businessCoaching, addToCartBCoaching, 1000);
    }


    public void moveToCreditCard() {
        waitForVisibility(checkingCreditCard);
        moveTo(checkingCreditCard);
        slpMyDriver(1000);
        jsClick(checkingCreditCard);
    }

    public void verifingListOfClasses() {
        String expextedInCardBusinessCoaching = verifyingBusinessCoachingInCard.getText();
        String expextedInBasariliAileAkademisi = verifyingAileAkademesiInCard.getText();
        String actualInCardBusinessCoaching = "Business Coaching";
        String actualInCardBasariliAileAkademisi = "Başarılı Aile Akademisi";

        Assert.assertEquals(actualInCardBasariliAileAkademisi, expextedInBasariliAileAkademisi);
        Assert.assertEquals(actualInCardBusinessCoaching, expextedInCardBusinessCoaching);

    }

    public void priceAndClassChecker() {
        String priceOfbusinessCoaching = businessCoachingPrice.getText();
        String priceOfbasariliAileAkademisi = basariliAileAkademisiPrice.getText();
        String expectedTotalPrice = priceOfbusinessCoaching + priceOfbasariliAileAkademisi;

        String actualTotalPrice = verifyingTotalPrice.getText();
        double totalPrice = Double.parseDouble(expectedTotalPrice);
        try {
            if (expectedTotalPrice.equals(actualTotalPrice)) {
                System.out.println("Assertion Successful");
            }
        } catch (Exception e) {
            System.out.println("The Assertion not Successful");
            e.printStackTrace();
        }

    }


    public void cartAdder(WebElement nameOfClass, WebElement addToCart, int sleepBTimer) {
        scrollIntoElement(nameOfClass);
        waitForVisibility(nameOfClass);
        moveTo(nameOfClass);
        slpMyDriver(sleepBTimer);
        waitForVisibility(addToCart);
        moveTo(addToCart);
        jsClickWithWaitForVisibility(addToCart);

    }

}


