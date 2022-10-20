package Steps;

import Pages.Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import static Core.Core.getDriver;

public class Steps {

    private WebDriver driver;
    Page page = new Page(driver);

    @Given("que eu acesse o site de cadastro")
    public void que_eu_acesse_o_site_de_cadastro() {
        getDriver().navigate().to("https://automacaocombatista.herokuapp.com/home/index");
        page.wait.until(ExpectedConditions.elementToBeClickable(page.webAutomation.get(0)));
        page.webAutomation.get(0).click();
    }
    @Given("acesse o menu lateral")
    public void acesse_o_menu_lateral() {
        page.wait.until(ExpectedConditions.elementToBeClickable(page.form.get(0)));
        page.form.get(0).click();
        page.wait.until(ExpectedConditions.elementToBeClickable(page.createUser));
        page.createUser.click();
    }



    @When("eu preencher o formulário com {string}, {string}, {string}, {string}, {string}, {string} , {string} , {string}")
    public void eu_preencher_o_formulário_com(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8)  {
        page.wait.until(ExpectedConditions.elementToBeClickable(page.createUser));
        page.userName.sendKeys(string);
        page.userLastName.sendKeys(string2);
        page.userMail.sendKeys(string3);
        page.userAddress.sendKeys(string4);
        page.userUniversity.sendKeys(string5);
        page.userProfile.sendKeys(string6);
        page.userGender.sendKeys(string7);
        page.userAge.sendKeys(string8);
        page.create.click();
    }

    @Then("o usuário deve ser cadastrado corretamente")
    public void o_usuário_deve_ser_cadastrado_corretamente() {
        page.wait.until(ExpectedConditions.elementToBeClickable(page.notice));
        Assert.assertEquals("Usuário Criado com sucesso",page.notice.getText());
    }

}
