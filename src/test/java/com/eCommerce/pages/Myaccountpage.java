package com.eCommerce.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Myaccountpage {
	
	WebDriver ldriver;
	
	public Myaccountpage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath="//*[@id=\"ui-id-5\"]/span[2]")
	WebElement Mentab;
	
	public void hoveronmentab() {
		Actions act = new Actions(ldriver);
		act.moveToElement(Mentab).build().perform();
				
	}
	
	@FindBy(xpath="//*[@id=\"ui-id-17\"]/span[2]")
	WebElement topssubmenu;
	
	public void hoverontopstab() {
		Actions act1 = new Actions(ldriver);
		act1.moveToElement(topssubmenu).build().perform();
					
	}
	@FindBy(xpath="//*[@id=\"ui-id-19\"]/span")
	WebElement jacketssubmenu;
	
	public void hoveronjacketstab() {
		Actions act1 = new Actions(ldriver);
		act1.moveToElement(jacketssubmenu).click().build().perform();
					
	}
	
	

}
