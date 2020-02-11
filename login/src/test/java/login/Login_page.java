package login;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_page 
{
	static {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2d.02.11\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		   }	
	 WebDriver driver=new ChromeDriver();
@Given("navigate to home page of that webpage")
public void navigate_to_home_page_of_that_webpage() 
{
   driver.get("http://newtours.demoaut.com/");
   
}

@When("User valid enters username and password")
public void user_valid_enters_username_and_password(DataTable data)
{

	List<Map<String,String>> list=data.asMaps(String.class, String.class);
    for(int i=0;i<list.size();i++)
    {
  WebElement u=driver.findElement(By.name("userName"));
  //u.sendKeys();
  u.sendKeys(list.get(i).get("username"));
  WebElement p=driver.findElement(By.name("password"));
 // p.sendKeys();
  p.sendKeys(list.get(i).get("password"));
 // WebElement s=driver.findElement(By.linkText("/images/btn_signin.gif"));
 // driver.get("http://newtours.demoaut.com/mercuryreservation.php?osCsid=4a521bce06e0733cbed178aaec82a677");
driver.get("http://newtours.demoaut.com/mercuryreservation.php?osCsid=a01228a34dec1dc2d0a317d02cebc264");
    }
}

@Then("it shows message as login successfully")
public void it_shows_message_as_login_successfully() 
{

   System.out.println("login success");
   driver.close();
}

}
