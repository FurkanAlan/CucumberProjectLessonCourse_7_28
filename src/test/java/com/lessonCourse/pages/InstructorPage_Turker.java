package com.lessonCourse.pages;

import com.lessonCourse.utilities.CommonMethods;
import com.lessonCourse.utilities.ConfigurationReader;
import com.lessonCourse.utilities.MyDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class InstructorPage_Turker extends CommonMethods {

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

    @FindBy(xpath = "//img[@ng-src='api/files/lesson/5e45c18a97612843aab59638']")
    public WebElement businessGroupCoaching;

    //*[@aria-label='Play']
    //button[@aria-label='Play']
    //iframe[@src = 'https://www.youtube.com/embed/2km38OZB0kg?autoplay=0&controls=0&loop=0&start=0']

    // automation chrome video element
    // //div[@ng-if = 'vm.inst.instructor.intro.introVideo']

    // iframe in altindaki locator
    //button[@aria-label = 'Play']

    @FindBy(xpath = "//iframe[@src = 'https://www.youtube.com/embed/2km38OZB0kg?autoplay=0&controls=0&loop=0&start=0']")
    public WebElement frameElement;

    @FindBy(xpath = "//button[@aria-label='Play']")
    public WebElement playVideo;

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
        jsClick(loginToAccount);
        slpMyDriver(4000);
    }


    public void hoverOnCategories() {
        moveTo(categories);
        slpMyDriver(2000);
    }

    public void hoverAndClickOnCoaching() {
        moveTo(coaching);
        slpMyDriver(3000);
        jsClick(coaching);
    }


    public void businessCoaching() {
        slpMyDriver(4000);
        scrollIntoElement(businessGroupCoaching);
        jsClick(businessGroupCoaching);
        slpMyDriver(4000);
    }

    public void sizeOfFrames() {
        int sizeOfIFrame = MyDriver.get().findElements(By.tagName("iframe")).size();
        int sizeOfLinks = MyDriver.get().findElements(By.tagName("a")).size();
        System.out.println(sizeOfIFrame + " Frames : Links = " + sizeOfLinks);
//        MyDriver.get().switchTo().frame(frameElement);
    }


    public void playVideoMetod() {
        switchToFrame(0);
        slpMyDriver(4000);
//        jsClick(playVideo);
        playVideo.click();
        slpMyDriver(4000);
    }
}
