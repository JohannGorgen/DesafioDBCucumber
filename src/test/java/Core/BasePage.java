package Core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage(WebDriver driver){
        PageFactory.initElements(Core.getDriver(),this);
    }
}
