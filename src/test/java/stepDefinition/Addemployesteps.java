package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Addemployesteps {
WebDriver driver;
String expected ;
String actual ;
@Given("user navigates url as {string} in a browser")
public void user_navigates_url_as_in_a_browser(String url) {
   driver= new ChromeDriver();
   driver.manage().window().maximize();
   driver.get(url);
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
@When("user logs as {string} in username")
public void enter_username(String user) {
   driver.findElement(By.name("txtUsername")).sendKeys(user);
}
@When("user logs as \"Qedge123!@#\"in password")
public void enterpaswd(String pswd) {
	driver.findElement(By.xpath("//span[normalize-space()='Password']e")).sendKeys(pswd);
}
@When("user click login data")
public void user_click_login_data() {
	 driver.findElement(By.name("Submit")).click();;
}
@Then("user login success")
public void user_login_success() {
   String expected = "dashboard";
   String actual = driver.getCurrentUrl();
   if (actual.contains(expected)) {
	System.out.println("login success::"+expected+"          "+actual);
} else {
	System.out.println("login failed::"+expected+"          "+actual);
}
}
@When("user clicks pim")
public void user_clicks_pim() throws Throwable {
   driver.findElement(By.xpath("//b[normalize-space()='PIM']")).click();
   Thread.sleep(1000);
}
@When("user click Add button")
public void user_click_add_button() {
	driver.findElement(By.name("btnAdd")).click();
}
@When("user enter as {string} in fname")
public void enterfname(String firstname) {
   driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(firstname);
}
@When("user enter as {string} in mname")
public void entermname(String middlename) {
	  driver.findElement(By.xpath("//input[@id='middleName']")).sendKeys(middlename);
}
@When("user enter as\"<Lastname>\" in lname")
public void enterlastname(String lastname) {
	 driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(lastname);
}
@When("user capture Eid before adding")
public void user_capture_eid_before_adding() {
	 expected = driver.findElement(By.name("employeeId")).getAttribute("value");
}
@When("user clicks save button")
public void clickssavebutton() {
   driver.findElement(By.xpath("//input[@id='btnSave']")).click();
}
@When("user capture Eid after adding")
public void user_capture_eid_after_adding() {
  actual = driver.findElement(By.xpath("//input[@id='personal_txtEmployeeId']")).getAttribute("value");
}
@Then("user validates eid")
public void user_calidates_eid() {
   if (expected.equals(actual)) {
	System.out.println("adding employee is success::"+expected+"         "+actual);
} else {
	System.out.println("adding employee is failed::"+expected+"         "+actual);
}
}
@Then("user close browser")
public void user_close_browser() {
  driver.quit();
}

}