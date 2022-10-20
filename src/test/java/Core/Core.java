package Core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

import java.io.File;
import java.io.IOException;

public class Core {

    private static WebDriver driver;

    //Inicialização do driver
    public static WebDriver getDriver() {

        WebDriverManager.chromedriver().setup();
        if (driver == null) {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
        return driver;
    }

    //Após a classe de teste executar, é aguardado 3s, tirado uma printscreen do teste e o driver é fechado
    @AfterTest
    public void end() throws IOException, InterruptedException {

        Thread.sleep(3000);
        takeSnapShot(driver, "target\\screenshot\\" + "teste.png");
        killDriver();
    }

    public static void killDriver() {

        if (driver != null) {
            driver.quit();
            driver = null;
        }

    }

    public static void takeSnapShot (WebDriver webdriver, String fileWithPatch) throws IOException {

        TakesScreenshot scrShot =((TakesScreenshot) webdriver);
        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
        File DestFile = new File(fileWithPatch);
        FileUtils.copyFile(SrcFile, DestFile);
    }
}
