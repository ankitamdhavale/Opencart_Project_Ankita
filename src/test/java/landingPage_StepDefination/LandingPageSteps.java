package landingPage_StepDefination;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import com.aventstack.extentreports.Status;
import com.pages.LandingPage;
import com.pages.MarketPlacepage;
import com.utility.Utility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LandingPageSteps extends Utility{
	
	public LandingPage ldp;
	public MarketPlacepage mp;
	
	
	public void objectMethod() throws IOException {
		
		ldp = new LandingPage();
		mp = new MarketPlacepage();
		
	}
	
	//User launched Chrome browser and enter url
	
	@Given("Chrome is opened and Opencart application is launched")
	public void chrome_is_opened_and_opencart_application_is_launched() throws IOException, InterruptedException {
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
		
		logger=report.createTest("test01");
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
	public void user_clicks_on_marketplace() throws InterruptedException, IOException {
		objectMethod();
	    mp=ldp.marketplace();
		
	    logger.log(Status.INFO, "Step 2 is executed");
	}
	
	//User navigates on marketplace page
	
	@When("User Navigates on marketplace page")
	public void user_navigates_on_marketplace_page() throws IOException, InterruptedException {
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
	
	//User navigates on landing page and see the logo
	
	@Then("User Navigates on landing page and able to see logo")
	public void user_navigates_on_landing_page_and_able_to_see_logo() throws IOException, InterruptedException {
	    
		objectMethod();
		//Thread.sleep(2000);
		Utility.implicitWait();
	    ldp.validateLogo();
	    
	    logger.log(Status.INFO, "Step 4 is executed");
	}
	
	//User Navigates to marketplace page and see text on page
	
	@When("User Navigates to the marketplace page and see text")
	public void user_navigates_to_the_marketplace_page_and_see_text() throws IOException, InterruptedException {
	
	    objectMethod();
	    //Thread.sleep(2000);
	    Utility.implicitWait();
	    mp.validateText();
	    
	    logger.log(Status.INFO, "Step 5 is executed");
	}
	
	//User click on dropdrown list of sort by and select on recently update option
	
	@Then("User click on dropdrown list of sort by and select option")
	public void user_click_on_dropdrown_list_of_sort_by_and_select_option() throws IOException, InterruptedException {
		 objectMethod();
	     //Thread.sleep(2000);
		 Utility.implicitWait();
		 mp.sortby_1();
	     System.out.println("clicked");
	    
	     logger.log(Status.INFO, "Step 6 is executed"); 
	}
}
