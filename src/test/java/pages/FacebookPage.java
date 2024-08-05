package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FacebookPage {

    public FacebookPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//span[text()='Allow all cookies'])[2]")
    public WebElement cookiesKabulButonu;

    @FindBy(id ="email")
    public WebElement emailKutusu;

    @FindBy(id ="pass")
    public WebElement passwordKutusu;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement loginButonu;


}