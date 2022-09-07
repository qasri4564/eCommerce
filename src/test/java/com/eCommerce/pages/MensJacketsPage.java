package com.eCommerce.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MensJacketsPage {
	
WebDriver ldriver;
	
	public MensJacketsPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath="//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[5]/div/div/strong/a")
	WebElement marsjacket;
	
	public void clickmarsjacket() {
		marsjacket.click();
	}
	
	@FindBy(xpath="//*[@id=\"option-label-size-143-item-168\"]")
	WebElement Msize;
	public void clickmsize() {
		Msize.click();
	}
	
	@FindBy(xpath="//*[@id=\"option-label-color-93-item-58\"]")
	WebElement Redcolor;
	public void clickredcolor() {
		Redcolor.click();
	}
	@FindBy(xpath="//*[@id=\"product-addtocart-button\"]")
	WebElement addtocartbttn;
	
	public void addtocart() {
		addtocartbttn.click();
	}
	
	@FindBy(xpath="//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/div/a")
	WebElement shoppingcartlink;
	public void shoppingcartlink() {
		shoppingcartlink.click();
	}

	@FindBy(xpath="//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[1]/ul/li[1]/button")
	WebElement checkout;
	public void checkout() {
		checkout.click();
	}
	
	
	@FindBy(xpath="//*[@id=\"checkout-shipping-method-load\"]/table/tbody/tr[1]/td[1]/input")
	WebElement shippingmethodradiobttn;
	public void shippingmethodradiobttn() {
		shippingmethodradiobttn.click();
	}
	
	@FindBy(xpath="//*[@id=\"shipping-method-buttons-container\"]/div/button")
	WebElement Nextbttn;
	public void Nextbttnonaddtocart() {
		Nextbttn.click();
	}
	@FindBy(xpath="//*[@type='submit' and @class='action primary checkout']")
	WebElement Placeorderbttn;
	public void Placeorderbttn() {
		Placeorderbttn.click();
	}
	
	@FindBy(xpath="//*[@id=\"maincontent\"]/div[1]/h1/span")
	WebElement successmsg;
	public void successmsg() {
		successmsg.getText();
	}
	
	
}
