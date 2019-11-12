package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;

public class case2 {

WebDriver driver;
@Given("user launches iebrowser And navigates to application url")
public void user_launches_iebrowser_And_navigates_to_application_url() {
	System.setProperty("webdriver.ie.driver","C:\\NexGen Testing Stream\\Drivers\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");

	  driver = new InternetExplorerDriver();
		
		driver.navigate().to("http://localhost:8083/TestMeApp");
	   driver.manage().window().maximize();
	   Actions act=new Actions(driver);
		driver.findElement(By.xpath("//a[contains (text(),' SignIn')]")).click();
	}
    


@Given("enter user name as {string} in Username  field")
public void enter_user_name_as_in_Username_field(String uname) {
	driver.findElement(By.name("userName")).sendKeys(uname);
   
}

@Given("enter password as {string} in password field")
public void enter_password_as_in_password_field(String pwd){
	driver.findElement(By.name("password")).sendKeys(pwd);

}
@Given("click on login button")
public void click_on_login_button() {
	driver.findElement(By.name("Login")).click();
}
}