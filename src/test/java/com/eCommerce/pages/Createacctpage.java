package com.eCommerce.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Createacctpage {
	WebDriver ldriver;
	
	public Createacctpage(WebDriver rdriver)
	
	{
		ldriver =rdriver;
		PageFactory.initElements(rdriver,this );
	}
	
	@FindBy(id="firstname")
	WebElement fname;
	 
	@FindBy(id="lastname")
	WebElement lname;
	
	@FindBy(id="is_subscribed")
	WebElement checkbox_signupfornewsletter;
	
	@FindBy(id="email_address")
	WebElement emailid;
	
	@FindBy(id="password")
	WebElement password;
	
	
	@FindBy(id="password-confirmation")
	WebElement confirmpassword;
	
	
	@FindBy(xpath="//*[@id=\"form-validate\"]/div/div[1]/button")
	WebElement submitbttn;
	
	
	public void firstname() {
		fname.sendKeys("Sridhar");
	}
	public void lastame() {
		lname.sendKeys("Rangu");
	}
	public void emailid() {
		emailid.sendKeys("Sridhar.rangu24@gmail.com");
	}
	public void password() {
	password.sendKeys("Welcome1234	");
	}
	public void confirmpassword() {
		confirmpassword.sendKeys("Welcome1234");
	}
	public void submitbutton() {
		submitbttn.click();
	}

}
