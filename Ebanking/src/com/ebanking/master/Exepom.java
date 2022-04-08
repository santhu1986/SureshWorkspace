package com.ebanking.master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Exepom
{
	
	WebDriver driver;
	
    @BeforeTest
	public void AdmLogin() throws InterruptedException 
	{
	    driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://122.175.8.158/ranford2");
		
		//Admin Login
		
		RanfordHP RHP=PageFactory.initElements(driver,RanfordHP.class);
		RHP.Login();
		Thread.sleep(3000);

	}
        @Test(dataProvider="Rdata")
         public void RolCreation(String Rname,String Rty) throws InterruptedException
         {
				//Role
		
		AdminHp AHP=PageFactory.initElements(driver,AdminHp.class);
		AHP.Rol();
		
		//New Role
		
		RoleDetails RD=PageFactory.initElements(driver,RoleDetails.class);
		RD.Nrole();
		
		Thread.sleep(3000);
		//Role Creation
		
		RoleCre Rc=PageFactory.initElements(driver,RoleCre.class);
		Rc.Rcre(Rname,Rty);
		
		//Alert
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(3000);
		
		//Home
		
		RD.Hom();
	}
        
        @DataProvider
        
        public Object [][] Rdata()
        {
        	Object[][] obj=new Object[3][2];
        	
        	obj[0][0]="CashierSCB";
            obj[0][1]="E";
        	
            obj[1][0]="ManagerSCB";
            obj[1][1]="E";
        	
            obj[2][0]="Gmanager";
            obj[2][1]="E";
            
            return obj;
            
           }
       
}
