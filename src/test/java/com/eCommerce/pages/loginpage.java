package com.eCommerce.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	
	
		WebDriver ldriver;
		
		public loginpage(WebDriver rdriver)
		
		{
			ldriver =rdriver;
			PageFactory.initElements(rdriver,this );
		}
		
		
		@FindBy(xpath="/html/body/div[2]/header/div[1]/div/ul/li[2]/a")
		WebElement signinbttn;
		
		
		@FindBy(xpath="/html/body/div[2]/header/div[1]/div/ul/li[3]/a")
		WebElement createacctbttn;
		
		@FindBy(xpath="/html/body/div[2]/header/div[2]")
		WebElement title;
		
		public void createacctbttn() 
		{
			createacctbttn.click();
		}
		public void signinbttn() 
		{
			signinbttn.click();
		}
		public void title() 
		{
			title.getText();
		
}
		
}
