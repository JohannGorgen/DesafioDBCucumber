package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/",
        glue = {"Steps"},
        monochrome = true,
        plugin = {"pretty","html:target/reports/HtmlReports.html"}
)
public class Runner extends AbstractTestNGCucumberTests {

    //Classe que executa os testes do cucumber e gera um relatório simples em html

}
