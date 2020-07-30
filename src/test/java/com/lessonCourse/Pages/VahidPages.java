package com.lessonCourse.Pages;

import com.lessonCourse.utilities.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class VahidPages extends CommonMethods {
    @FindBy(how = How.XPATH, using = "//div[@id='toolbar']//div//span[contains(text(),'Become an Instructor')]")
    public  WebElement becomeInstructor;


    @FindBy(how = How.NAME, using = "username")
    public  WebElement userName;


    @FindBy(how = How.NAME, using = "password")
    public  WebElement password;

    @FindBy(how = How.XPATH, using = "//*[@translate='LOGIN.LOG_IN']")
    public  WebElement login;
    //*[text()='LOG IN']

    @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Categories')])[1]")
    public  WebElement categories;

    @FindBy(how = How.XPATH, using = "//div[@translate='CAT.COA.NAME']")
    public  WebElement coaching;


    @FindBy(how = How.XPATH, using = "//*[text()='Academic Coaching']")
    public  WebElement academicCoaching;

    @FindBy(how = How.XPATH, using = "(//*[text()='BASIC COACHING SKILLS'])[1]")
    public  WebElement basicCoachingSkills;


    @FindBy(how = How.XPATH, using = "//ngcart-addtocart[@id='5eb7d88f3139fa4afe85f156']//div[1]//span")
    public  WebElement addToCart;

    @FindBy(how = How.XPATH, using = "//div[@id='toolbar']//div//ngcart-summary//div//span[contains(text(),'1')]")
    public WebElement checkingCreditCard;


    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Kutsiye Yilmaz')]")
    public WebElement educationCoaching;




    }



