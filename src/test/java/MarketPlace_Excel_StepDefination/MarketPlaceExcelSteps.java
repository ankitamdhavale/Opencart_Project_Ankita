package MarketPlace_Excel_StepDefination;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.aventstack.extentreports.Status;
import com.pages.LandingPage;
import com.pages.MarketPlacepage;
import com.utility.Config;
import com.utility.ExcelReader;
import com.utility.Utility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MarketPlaceExcelSteps extends Utility {
	public LandingPage ldp;
	public MarketPlacepage mp;
	ExcelReader reader;
	
	public void objectMethod() throws IOException {
		
		ldp = new LandingPage();
		mp = new MarketPlacepage();
	}
	
	//User launched Chrome browser and enter url

	@Given("Chrome is opened and Opencart application is launched")
	public void chrome_is_opened_and_opencart_application_is_launched() throws InterruptedException, IOException {
		objectMethod();
        //Thread.sleep(2000);
		Utility.implicitWait();
		
        String actualtitle= ldp.validateLandinPageTitle();
        System.out.println(actualtitle);		
	}
	
	//User Navigates on landing Page
	
	@Then("User Navigates on landing page")
	public void user_navigates_on_landing_page() throws InterruptedException, IOException {
		objectMethod();
        //Thread.sleep(2000);
		Utility.implicitWait();
		
		logger=report.createTest("test03");
		logger.log(Status.INFO,"Validating landing page Title");
		
        String actualtitle1 = ldp.validateLandinPageTitle();
        String expectedtitle1 = "OpenCart - Open Source Shopping Cart Solution";
        
        try {
        	assertEquals(expectedtitle1, actualtitle1);
        	logger.log(Status.PASS,"Step 1 is passed");
            System.out.println(actualtitle1);
            assert true;
        }catch(AssertionError e) {
        	e.printStackTrace();
        	logger.log(Status.FAIL,"Step 1 is failed");
        	captureScreenshotOnFailure();
        	assert false;
        }
	}
	
	//User want to access marketplace page
	
	@When("User clicks on marketplace")
	public void user_clicks_on_marketplace() throws IOException {
		objectMethod();
	    mp=ldp.marketplace();
		
	    logger.log(Status.INFO, "Step 2 is executed");
	}
	
	//User navigates on marketplace page
	
	@When("User navigates to the marketplace page")
	public void user_navigates_to_the_marketplace_page() throws InterruptedException, IOException {
		objectMethod();
        //Thread.sleep(2000);
        Utility.implicitWait();
        
        logger.log(Status.INFO,"Validating landing page Title");
        
        String actualtitle1 = ldp.validateLandinPageTitle();
        String expectedtitle1 = "Opencart extensions";
        
        try {
        	assertEquals(expectedtitle1, actualtitle1);
        	logger.log(Status.PASS,"Step 3 is passed");
            System.out.println(actualtitle1);
            assert true;
        }catch(AssertionError e) {
        	e.printStackTrace();
        	logger.log(Status.FAIL,"Step 3 is failed");
        	captureScreenshotOnFailure();
        	assert false;
        }
	}
	
	//User enters data in search bar
	
	@When("User enters data from given sheetname {string} and {int} in the search bar")
	public void user_enters_data_from_given_sheetname_and_in_the_search_bar(String sheetName, Integer rowNumber) throws IOException, InvalidFormatException, InterruptedException {
	    
		objectMethod();
		//Thread.sleep(2000);
		
	    reader=new ExcelReader();
        List<Map<String,String>> testData = reader.getData(Config.excelPath, sheetName);
        
        String search = testData.get(rowNumber).get("Search");
        
        Utility.implicitWait();
        mp.search_1(search);
		   
		   logger.log(Status.INFO, "Step 4 is executed");		   
	}
	
	
	
	@When("User clicks on search icon")
	public void user_clicks_on_search_icon() throws IOException, InterruptedException {
		  objectMethod();
		//Thread.sleep(2000);
	    Utility.implicitWait();
		mp.search_2();
	    
		logger.log(Status.INFO, "Step 5 is executed");
		
	}
	
	//User clicks on search icon to search product
	
	@Then("it shows the list of product")
	public void it_shows_the_list_of_product() throws InterruptedException, IOException {
		objectMethod();
		//Thread.sleep(2000);
		Utility.implicitWait();
		
		logger.log(Status.INFO,"Validating landing page Title");
		
        String actualtitle1 = ldp.validateLandinPageTitle();
        String expectedtitle1 = "Opencart extensions";
        
        try {
        	assertEquals(expectedtitle1, actualtitle1);
        	logger.log(Status.PASS,"Step 6 is passed");
            System.out.println(actualtitle1);
            assert true;
        }catch(AssertionError e) {
        	e.printStackTrace();
        	logger.log(Status.FAIL,"Step 6 is failed");
        	captureScreenshotOnFailure();
        	assert false;
        }
   	}
}


