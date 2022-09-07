package com.eCommerce.tests;
import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.eCommerce.pages.MensJacketsPage;
import com.eCommerce.pages.Myaccountpage;

import com.util.waits;

public class TestPurchaseProduct extends BaseClass {
	@Test(enabled=false)
	public void purchaseproduct() throws InterruptedException {
		extentTest = extent.startTest("purchaseproduct");
		
		waits w=new waits(driver);
		w.impwait();
		
		signin();
						
		Thread.sleep(3000);
		Myaccountpage map=new Myaccountpage(driver);
		map.hoveronmentab();
		map.hoverontopstab();
		map.hoveronjacketstab();
		
		MensJacketsPage mjp = new MensJacketsPage(driver);
		
		mjp.clickmarsjacket();
		mjp.clickmsize();
		mjp.clickredcolor();
		
		mjp.addtocart();
		mjp.shoppingcartlink();
		Thread.sleep(2000);
		mjp.checkout();
		Thread.sleep(2000);
		mjp.shippingmethodradiobttn();
		Thread.sleep(4000);
		mjp.Nextbttnonaddtocart();
		Thread.sleep(10000);
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@type='submit' and @class='action primary checkout']"))));
		mjp.Placeorderbttn();
		Thread.sleep(3000);
		WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@class='action primary continue']"))));
		
		if(driver.findElement(By.xpath("//div[@class='checkout-success']//child::strong")).isDisplayed())
		{
			WebElement s = driver.findElement(By.xpath("//div[@class='checkout-success']//child::strong"));
			String ordernumber=s.getText();
			Assert.assertTrue(true);
			System.out.println(ordernumber);
		}
		else
			Assert.assertTrue(false);
	}

}
