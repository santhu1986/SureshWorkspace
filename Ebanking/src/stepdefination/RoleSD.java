package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RoleSD 
{
	
	WebDriver driver;


@Given("^Tester On Ranford Home Page$")
public void tester_On_Ranford_Home_Page() throws Throwable 
{
	   driver=new FirefoxDriver();
	   
	   //Maximise
	   
	   driver.manage().window().maximize();
	   
	   //URL
	   
	   driver.get("http://122.175.8.158/ranford2");
	   
}

@When("^Tester Enters Username and Password click Login$")
public void tester_Enters_Username_and_Password_click_Login() throws Throwable 
{
	   driver.findElement(By.id("txtuId")).sendKeys("Admin");
	   driver.findElement(By.id("txtPword")).sendKeys("Mq$ystems@");
	   driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
	    
}

@When("^Tester Click on Role Button$")
public void tester_Click_on_Role_Button() throws Throwable 
{
	driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img")).click();
}

@Then("^Tester Click on New Role and Enters \"([^\"]*)\" and \"([^\"]*)\"$")
public void tester_Click_on_New_Role_and_Enters_and(String Rname, String Rtyp) throws Throwable 
{
	driver.findElement(By.xpath(".//*[@id='btnRoles']")).click();
	driver.findElement(By.id("txtRname")).sendKeys(Rname);
	driver.findElement(By.id("lstRtypeN")).click();
	driver.findElement(By.id("lstRtypeN")).sendKeys(Rtyp);
	driver.findElement(By.xpath(".//*[@id='btninsert']")).click();
	
	driver.switchTo().alert().accept();
}

@Then("^Tester Close the Application$")
public void tester_Close_the_Application() throws Throwable 
{
  driver.close();
}


}
