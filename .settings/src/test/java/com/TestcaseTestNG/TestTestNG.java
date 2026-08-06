package com.TestcaseTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.First.FirstHome;

public class TestTestNG 
{
  WebDriver driver;
  
  @BeforeTest
  public void launchChromeBrowser()
  {
	  driver=new ChromeDriver();
	  driver.get("https://www.makemytrip.com/");
	  driver.manage().window().maximize();
  }
  
  @Test
  public void searchFlightTickets() throws InterruptedException
  {
	  FirstHome firsthome=new FirstHome(driver);
	  firsthome.closePopUp();
	  firsthome.clickRoundTripButton();
	  firsthome.enterSourceCity("Pune");
	  firsthome.enterDestinationCity("Hyderabad");
	  firsthome.selectDepartureDate();
	  firsthome.selectReturnDate();
	  firsthome.clickSearchButton();
  }
  
  @AfterTest
  public void closeBrowser()
  {
	  driver.close();
  }
  
}
