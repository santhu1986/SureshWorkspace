package com.ebanking.scrpts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Basic {

	public static void main(String[] args) throws InterruptedException 
	{
		//Expected Value
		   
		   String Expval="Ranford Bank";
		   
	       //Launch Firefox
		   
		   WebDriver driver=new FirefoxDriver();
		   
		   //Maximise
		   
		   driver.manage().window().maximize();
		   
		   //URL
		   
		   driver.get("http://122.175.8.158/ranford2");
		   
		   //Actual Value
		   
		   String Actval=driver.findElement(By.xpath("//span[@class='style10'][contains(.,'Ranford Bank')]")).getText();
		 
		   //Comparision
		   
		   if (Expval.equalsIgnoreCase(Actval)) 
		   {
			System.out.println("Application Launch Succ");
		   }
		   else
		   {
			   System.out.println("Application Failed to Launch");
		   }
		   //Title
		   
		   String Tit=driver.getTitle();
		   System.out.println(Tit);
		   
		   
		   //Admin Login
		   
		   Expval="Welcome to Admin";
		   
		   driver.findElement(By.id("txtuId")).sendKeys("Admin");
		   driver.findElement(By.id("txtPword")).sendKeys("Te$ting@");
		   driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
		   
		   Actval=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/strong/font/font")).getText();
		   
	       //Comparision
		   
		   if (Expval.equalsIgnoreCase(Actval)) 
		   {
			System.out.println("Admin Login Succ");
		   }
		   else
		   {
			   System.out.println("Admin Failed to Login");
		   }
		   
		   
		   //Branch Creation
		   
		   Expval="Sucessfully";
		 
		   driver.findElement(By.xpath("//img[@src='images/Branches_but.jpg']")).click();
		   driver.findElement(By.id("BtnNewBR")).click();
		  
		   driver.findElement(By.id("txtbName")).sendKeys("MQSYSjanhyd");
		   driver.findElement(By.id("txtAdd1")).sendKeys("Hyderabad");
		   driver.findElement(By.id("txtZip")).sendKeys("54321");
			   
		   //Country (Drop Down)
		   
		   Select Ctry=new Select(driver.findElement(By.id("lst_counrtyU")));
		   Ctry.selectByVisibleText("INDIA");
		   
		   new Select(driver.findElement(By.id("lst_stateI"))).selectByVisibleText("GOA");
		   
		   new Select(driver.findElement(By.id("lst_cityI"))).selectByVisibleText("GOA");
		  
		   driver.findElement(By.id("btn_insert")).click();
		   
		   //Alert
		   
		   Actval=driver.switchTo().alert().getText();
		   
		  Thread.sleep(3000); 
		    driver.switchTo().alert().accept();
		   if (Actval.contains(Expval)) 
		   {
			System.out.println("Branch Created");
		   }
		   else
		   {
			   System.out.println("Branch Already Exist");
		   }
		   
		   //Role Creation
		   
		   //Employee Creation
		   
		   //Banker Login
		}


	}

