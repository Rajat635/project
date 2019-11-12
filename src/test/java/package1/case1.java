package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
public class case1 {
	WebDriver driver;

@Given("enter the url of TestMeApp page")
public void enter_the_url_of_TestMeApp_page() {
//	System.setProperty("Webdriver.chrome.driver","C:\\NexGen Testing Stream\\Drivers\\chromedriver_win32\\chromedriver.exe");
//	driver=new ChromeDriver();
	System.setProperty("webdriver.ie.driver","C:\\NexGen Testing Stream\\Drivers\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");

  driver = new InternetExplorerDriver();
	//driver.get("https://www.google.com/");
	driver.navigate().to("http://localhost:8083/TestMeApp");
   driver.manage().window().maximize();
}

@Given("Navigate to sign up page")
public void navigate_to_sign_up_page() {
	Actions act=new Actions(driver);
	driver.findElement(By.xpath("//a[contains(text(),' SignUp')]")).click();
	

}

@Given("Enter user name")
public void enter_user_name() {
	//driver.findElement(By.xpath("//a[contains(text(),'User Name']")).sendKeys("rajat");
	driver.findElement(By.name("userName")).sendKeys("rajat1996");
	

}

@Given("Enter first name")
public void enter_first_name() {
  driver.findElement(By.name("firstName")).sendKeys("Rajat");
}

@Given("Enter Last name")
public void enter_Last_name() {
	 driver.findElement(By.name("lastName")).sendKeys("Saxena");
}

@Then("Enter the password")
public void enter_the_password() {
	 driver.findElement(By.name("password")).sendKeys("rajatsaxena");
}

@Then("confirm the password")
public void confirm_the_password() {
	 driver.findElement(By.name("confirmPassword")).sendKeys("rajatsaxena");
}

@Then("select Gender")
public void select_Gender() {
	driver.findElement(By.xpath("//input[contains(@value,'Male')]")).click();
}

@Then("Enter mail id")
public void enter_mail_id() {
	   driver.findElement(By.name("emailAddress")).sendKeys("rajat.saxena37@gmail.com");
  
}

@Then("Enter mobile number")
public void enter_mobile_number() {
	
	   driver.findElement(By.name("mobileNumber")).sendKeys("7385331758");
}

@Then("Enter DOB")
public void enter_DOB() {
	   driver.findElement(By.name("dob")).sendKeys("03/14/1996");
   
}

@Then("enter address")
public void enter_address() {
	   driver.findElement(By.name("address")).sendKeys("hadapsar12");
}

@Then("enter security Question")
public void enter_security_Question() {
	   driver.findElement(By.name("securityQuestion")).sendKeys("enter your childhood friend name");
  
}

@Then("Enter the answer of security question")
public void enter_the_answer_of_security_question() {
	   driver.findElement(By.name("answer")).sendKeys("virendra");
}

@Then("click on Register")
public void click_on_Register() {
	 driver.findElement(By.name("Submit")).click();
}






}







