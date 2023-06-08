package com.pages;

	import static org.testng.AssertJUnit.assertTrue;
	import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.utility.Utility;

	public class MarketPlacepage extends Utility
	{ 
		@FindBy(xpath="//select[@id='input-sort']")
		private WebElement  sortby; 
		
		@FindBy(xpath="//*[text()='Recently Updated']")
		WebElement RecentlyUpdated;

		@FindBy(xpath="//input[@name='filter_search']")
		WebElement search;

		@FindBy(xpath="//i[@class='fa fa-search']")
		WebElement searchicon;

		
		public MarketPlacepage() throws IOException
		{
			PageFactory.initElements(driver, this);
		} 
				
		public  String validateHomePageTitle()
		{
			return driver.getTitle();
		}  
		
		public void validateText()
		{
			boolean text = driver.findElement(By.xpath("//h1")).isDisplayed();
			assertTrue(text);	
		}
		
		public void sortby_1() throws IOException, InterruptedException
		{
			sortby.click();
			Thread.sleep(5000);
			RecentlyUpdated.click();
			Thread.sleep(5000);
		}
		
		public void search_1(String s) throws IOException, InterruptedException
        {
            search.sendKeys(s);
            Thread.sleep(2000);
        }

        public void search_2() throws IOException, InterruptedException
        {
            searchicon.click();
            Thread.sleep(2000);

        }
	}