package com.eCommerce.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.util.waits;

public class TestLogin extends BaseClass{
	

	@Test	
	public void TestLoginpage() throws InterruptedException {
		driver.get(baseurl);
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		waits w=new waits(driver);
		w.impwait();
		extentTest = extent.startTest("LoginTest");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(userid);
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"send2\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/span/button")).click();
		boolean b = driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/div/ul/li[3]/a")).isDisplayed();
		//boolean b = driver.findElement(By.xpath("//*[@id=\\\"email\\\"]")).isDisplayed();
	    Assert.assertTrue(b);

	}}

