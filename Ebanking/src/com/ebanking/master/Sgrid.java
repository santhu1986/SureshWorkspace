package com.ebanking.master;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Sgrid 
{

	DesiredCapabilities Cap;
	@Test
	public void Gd() throws MalformedURLException, InterruptedException 
	{
		Cap=new DesiredCapabilities();
		Cap.setBrowserName("chrome");
		Cap.setPlatform(Platform.WINDOWS);
		
		
		RemoteWebDriver driver=new RemoteWebDriver(new URL("http://192.168.88.1:4444/wd/hub"),Cap);
		
		driver.manage().window().maximize();
		driver.get("http://122.175.8.158/ranford2");
		
		//Admin Login
		
		RanfordHP RHP=PageFactory.initElements(driver,RanfordHP.class);
		RHP.Login();
		Thread.sleep(3000);
		
		
		AdminHp AHP=PageFactory.initElements(driver,AdminHp.class);
		AHP.Rol();
		
		//New Role
		
		RoleDetails RD=PageFactory.initElements(driver,RoleDetails.class);
		RD.Nrole();
		
		Thread.sleep(3000);
		//Role Creation
		
		RoleCre Rc=PageFactory.initElements(driver,RoleCre.class);
		Rc.Rcre("Manager","E");
		
		//Alert
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(3000);
		
		//Home
		
		RD.Hom();
	}

		
		
	}
