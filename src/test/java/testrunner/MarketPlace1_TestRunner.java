package testrunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/features/02_MarketPlace.feature"},
        glue = {"landingPage1_StepDefination", "apphooks"},
                 plugin= {"pretty" ,
                         "html:target/creport/cucumber",
                         "json:target/creport/cucumber.json",
                          "junit:target/creport/cucumber.xml"}
                 //dryRun = true
)
public class MarketPlace1_TestRunner extends AbstractTestNGCucumberTests  {

}
