package Stepdefintion;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Cucumber.Cucumber.baseclass;
import Runner.runner_amazon;
import io.cucumber.java.en.*;

public class stepdifinition_amazon {
	
	public static WebDriver driver = runner_amazon.driver;

	baseclass bc = new baseclass();
	
@Given("user launch the browser")
public void user_launch_the_browser() {
	driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fyour-account%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
	
}
@When("user enters the username")
public void user_enters_the_username() {
	WebElement username = driver.findElement(By.id("ap_email"));
	username.sendKeys("8248203610");
	WebElement email = driver.findElement(By.id("continue"));
	email.click();
    
}
@When("user enters the password")
public void user_enters_the_password() {
	WebElement password = driver.findElement(By.id("ap_password"));
	password.sendKeys("Escape@0");
	
}
@When("user want to click the login summit")
public void user_want_to_click_the_login_summit() {
	WebElement signin = driver.findElement(By.id("signInSubmit"));
    signin.click();
   
}
@Then("user validate the login outcomes")
public void user_validate_the_login_outcomes() {
	System.out.println("run successfully to next page");
  
}
//scenario 2


@When("user enter the apple airpds pro")
public  void user_enter_the_apple_airpds_pro() throws AWTException {
	WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
	search.sendKeys("apple airpods pro");
	Robot r = new  Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);	
}	

@When("user scroll down and select new apple airpods pro")
public void user_scroll_down_and_select_new_apple_airpods_pro() {
	driver.findElement(By.xpath("(//span[@class='a-truncate-cut'])[2]")).click();
	
}

@Then("user verify the selected airpods pro outcomes to next page")
public void user_verify_the_selected_airpods_pro_outcomes_to_next_page() {
	System.out.println("successfully run to next page");
	
	
}

//scenario 3

@Given("user scroll down and select the mag safe charging case")
public void user_scroll_down_and_select_the_mag_safe_charging_case() {
	
	driver.findElement(By.xpath("(//input[@class='a-button-input'])[14]")).click();
	
}
@When("user add the selected product into the cart")
public void user_add_the_selected_product_into_the_cart() {
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
}

@Then("user  want to verify and validated the selected product apple airpods pro into the cart")
public void user_want_to_verify_and_validated_the_selected_product_apple_airpods_pro_into_the_cart() {
	System.out.println("successfully added to the cart");
}


}
