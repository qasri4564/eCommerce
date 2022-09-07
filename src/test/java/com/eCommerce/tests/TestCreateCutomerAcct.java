package com.eCommerce.tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.eCommerce.pages.Createacctpage;
import com.eCommerce.pages.loginpage;


public class TestCreateCutomerAcct extends BaseClass{
	
	@Test(enabled=false)
	public void createAcct() throws InterruptedException {
		
		driver.get(baseurl);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		loginpage login=new loginpage(driver);
		login.createacctbttn();
		
		Createacctpage cap=new Createacctpage(driver);
		cap.firstname();
		cap.lastame();
		cap.emailid();
		cap.password();
		cap.confirmpassword();
		cap.submitbutton();
		
		if(driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[1]/div[3]/div[1]/strong")).isDisplayed())
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
			
		
	}
	
	}
