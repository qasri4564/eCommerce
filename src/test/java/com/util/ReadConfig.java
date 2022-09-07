package com.util;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
Properties pro;
	
	public ReadConfig()
	{
		
		File src = new File("C:\\Users\\sr35096.IND\\eclipse-workspace\\eCommerce\\src\\main\\java\\config.properties");
		
		try {
			FileInputStream fis= new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		}  catch(Exception e)
		
		{
			System.out.println("Exception is" + e.getMessage());
					
			
		}
	}
	
	public String getApplicationURL()
	{
		String url = pro.getProperty("baseurl");
		return url;
	}
	public String getusername()
	{
		String username = pro.getProperty("usrname");
		return username;
	}
	
	public String getpassword()
	{
		String password = pro.getProperty("passwrd");
		return password;
	}
	
	public String getchromepath()
	{
		String chromepath = pro.getProperty("chromepat");
		return chromepath;
	}
	
	

}
