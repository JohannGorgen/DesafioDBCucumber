package Pages;

import Core.BasePage;
import Core.Core;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Page extends BasePage {

    public WebDriverWait wait = new WebDriverWait(Core.getDriver(), 10);

    @FindBy(css = "a.btn.waves-light.orange")
    public List<WebElement> webAutomation;

    @FindBy(css = "a.collapsible-header")
    public List<WebElement> form;

    @FindBy(css = "a[href='/users/new']")
    public WebElement createUser;

    @FindBy(css = "#user_name")
    public WebElement userName;

    @FindBy(css = "#user_lastname")
    public WebElement userLastName;

    @FindBy(css = "#user_email")
    public WebElement userMail;

    @FindBy(css = "#user_address")
    public WebElement userAddress;

    @FindBy(css = "#user_university")
    public WebElement userUniversity;

    @FindBy(css = "#user_profile")
    public WebElement userProfile;

    @FindBy(css = "#user_gender")
    public WebElement userGender;

    @FindBy(css = "#user_age")
    public WebElement userAge;

    @FindBy(css = "input[value='Criar']")
    public WebElement create;

    @FindBy(css = "a.btn.waves-light.red")
    public WebElement back;

    @FindBy(css = "#notice")
    public WebElement notice;

    public Page(WebDriver driver) {
        super(driver);
    }
}

