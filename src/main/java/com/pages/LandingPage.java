package com.pages;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Utility;

public class LandingPage extends Utility 
{
	
	@FindBy(xpath="(//*[text()='Marketplace'])[1]")
	private WebElement Marketplace ; 
	
	
	public LandingPage() throws IOException
	{
		PageFactory.initElements(driver, this);
	} 
	
	public String validateLandinPageTitle()
	{
		return driver.getTitle(); 
	} 
	
	public void validateLogo()
	{
		boolean logo = driver.findElement(By.xpath("//img[@title='OpenCart - Open Source Shopping Cart Solution']")).isDisplayed();
		assertTrue(logo);
	}
	
	public MarketPlacepage marketplace() throws IOException
	{
		Marketplace.click();
		return new MarketPlacepage();
	}
	
}