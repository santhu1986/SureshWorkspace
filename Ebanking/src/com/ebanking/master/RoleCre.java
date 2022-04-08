package com.ebanking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RoleCre 
{
   @FindBy(id="txtRname")
   WebElement Rname;
   

   @FindBy(id="lstRtypeN")
   WebElement Rty;
   

   @FindBy(id="btninsert")
   WebElement Rsubmit;
   
   public void Rcre(String Rn,String Rtype) throws InterruptedException
   {
	   Rname.sendKeys(Rn);
	   Select Rt=new Select(Rty);
	   Rt.selectByVisibleText(Rtype);
	   Thread.sleep(3000);
	   Rsubmit.click();
   }
}
