package com.appseConnect.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ProcessFlowListingPage 
{
	//Creating the Driver Object local Driver
	WebDriver ldriver;
	
	
	//Constructor
	//Remote Driver as a Parameter of Constructor ProcessFlowListingPage
	public ProcessFlowListingPage(WebDriver rdriver)
	{
		//Initiate the driver
		ldriver = rdriver;
		
		//Specifying the Page Factory Class
		PageFactory.initElements(rdriver, this);
		
	}
	
	
	//Finding the elements of the ProcessFlow Listing Page
	
	@FindBy(how = How.XPATH, using ="//a[contains(text(),'Terms of Use')]")
	WebElement lnkTermsOfUse;
	
	
	@FindBy(how = How.XPATH, using ="//a[contains(text(),'Privacy Policy')]")
	WebElement lnkPrivacyPolicy;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'ProcessFlows')]")
	WebElement titleProcessFlows;
	
	@FindBy(how = How.XPATH, using = "//span[@class='caption-subject' and @id='folderHeading' and contains(text(),'Process Flow')]")
	WebElement folderHeadingProcessFlow;
	
	@FindBy(how = How.XPATH, using = "//a[text()='Process Flow']")
	WebElement folderNameProcessFlow;
	
	@FindBy(how = How.XPATH, using = "//a[text()='Installed Process Flow']")
	WebElement folderNameInstalledPF;
	
	@FindBy(how = How.XPATH, using = "//a[text()='Package Library']")
	WebElement folderNamePackageLibrary;
	
	@FindBy(how = How.XPATH, using = "//a[text()='Trash']")
	WebElement folderTrash;
	
	
	
	//Action Methods for the Elements defined above
	public void isElementPresent()
	{
		
	}

}
