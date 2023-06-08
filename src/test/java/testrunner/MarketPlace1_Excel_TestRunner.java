package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/features/03_MarketPlace_Excel.feature"},
        glue = {"MarketPlace_Excel_StepDefination", "apphooks"},
                 plugin= {"pretty" ,
                         "html:target/creport/cucumber",
                         "json:target/creport/cucumber.json",
                          "junit:target/creport/cucumber.xml"}
                 //dryRun = true
)
public class MarketPlace1_Excel_TestRunner extends AbstractTestNGCucumberTests{

}
