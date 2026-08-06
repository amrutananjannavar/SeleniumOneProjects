package com.First;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstHome {
	
	WebDriver driver;

	public FirstHome(WebDriver driver)
	{
		this.driver=driver;
	}
	
		By close=By.xpath("//span[@class='commonModal__close']");
		By roundTripButton =By.xpath("//li[@data-cy='roundTrip']");
		By sourceCity =By.id("fromCity");
		By sourceSearchBox=By.xpath("//input[@aria-control='react-autowhatever-1']");
		By destinationCity =By.id("toCity");
		By destinationSearchBox=By.xpath("//input[@aria-controls='react-autowhatever-1']");
		By searchButton=By.xpath("//a[@class='primaryBtn font24 latoBold widgetSearchBtn']");
		
		
		//Action methods:
		
		public void closePopUp() throws InterruptedException
		{
			Thread.sleep(2000);
			driver.findElement(close).click();
			Thread.sleep(2000);
		}
		
		public void clickRoundTripButton() throws InterruptedException
		{
			driver.findElement(roundTripButton).click();
			Thread.sleep(2000);
		}
		
		public void enterSourceCity(String fromCity) throws InterruptedException
		{
			driver.findElement(sourceCity).click();
			Thread.sleep(2000);
			driver.findElement(sourceSearchBox).sendKeys(fromCity);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='"+fromCity+"']")).click();
		}
		
		public void enterDestinationCity(String toCity) throws InterruptedException
		{
			driver.findElement(destinationCity).click();
			Thread.sleep(2000);
			driver.findElement(destinationSearchBox).sendKeys(toCity);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='"+toCity+"']")).click();
			Thread.sleep(2000);
		}
		
		public void selectDepartureDate() throws InterruptedException
		{
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(450, 510)", "");
			driver.findElement(By.xpath("//div[@aria-label='Wed July 29 2026']")).click();
			Thread.sleep(2000);
					
		}
		
		public void selectReturnDate() throws InterruptedException
		{
			driver.findElement(By.xpath("//div[@aria-label='Wed Aug 5 2026']")).click();
			Thread.sleep(2000);
		}
		
		public void clickSearchButton()
		{
			driver.findElement(searchButton).click();
		}
	

}

