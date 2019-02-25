package com.webuniversity.CucumberFrameworkESS.Steps;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LeaveSteps {
	
	WebDriver driver; 
	
	@Before()
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		this.driver = new ChromeDriver(); 
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
	}
	
	
	 @Given("^User navigates to ESS$")
	 public void user_navigates_to_ESS() throws Throwable {
	driver.get("http://burjsrv-qa/ESS/login/customlogin.aspx?");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 }

	 @Given("^User enters login credentials$")
	 public void user_enters_login_credentials() throws Throwable {
		 
		 driver.findElement(By.id("UCLogin_Login_ID")).clear();
		 driver.findElement(By.id("UCLogin_Login_ID")).sendKeys("mahrukh.tariq.14456");
		 driver.findElement(By.id("UCLogin_Password")).clear();
		 driver.findElement(By.id("UCLogin_Password")).sendKeys("abcd@1234");
		 Thread.sleep(1000);
		 driver.findElement(By.id("UCLogin_LoginButton")).click();
		 Thread.sleep(1000);
	 }
	 
	 

	 @Given("^User navigates to Leave Managment >> Leave Request$")
	 public void user_navigates_to_Leave_Managment_Leave_Request() throws Throwable {
		driver.get("http://burjsrv-qa/ESS/Employee/LeaveRequestPage.aspx?mode=LIST&menuitemid=679"); 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
	 }

	 @Given("^User clicks ADD button$")
	 public void user_clicks_ADD_button() throws Throwable {
		 driver.findElement(By.id("ctl00_cphRootContent_ucLeaveRequestSetup_btnAdd")).click();
		 Thread.sleep(1000);
	    
	 }

	 @Given("^User selects leave type$")
	 public void user_selects_leave_type() throws Throwable {		 
		 Select dropdown = new Select(driver.findElement(By.id("ctl00_cphRootContent_ucLeaveRequestSetup_CLT_Leave_ID")));
		 dropdown.selectByIndex(4);
		 Thread.sleep(1000);
		 
	 }

	 @Given("^User enters days$")
	 public void user_enters_days() throws Throwable {
		 driver.findElement(By.id("ctl00_cphRootContent_ucLeaveRequestSetup_TotalNoDays")).click();
		 driver.findElement(By.id("ctl00_cphRootContent_ucLeaveRequestSetup_TotalNoDays")).sendKeys("1");
		 Thread.sleep(1000);
	 }

	 @Given("^User enters start date$")
	 public void user_enters_start_date() throws Throwable {

		 
		 //Click on textbox so that datepicker will come
		  driver.findElement(By.id("ctl00_cphRootContent_ucLeaveRequestSetup_Leave_Start_Date")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.id("ctl00_cphRootContent_ucLeaveRequestSetup_Leave_Start_Date")).sendKeys("03/"); 
		  driver.findElement(By.id("ctl00_cphRootContent_ucLeaveRequestSetup_Leave_Start_Date")).sendKeys("04/"); 
		  driver.findElement(By.id("ctl00_cphRootContent_ucLeaveRequestSetup_Leave_Start_Date")).sendKeys("2019"); 
		  driver.findElement(By.id("ctl00_cphRootContent_ucLeaveRequestSetup_HoursTaken")).click();

	 }

	 @Given("^User enters Reason$")
	 public void user_enters_Reason() throws Throwable {
		 driver.findElement(By.id("ctl00_cphRootContent_ucLeaveRequestSetup_TotalNoDays")).click();
		 driver.findElement(By.id("ctl00_cphRootContent_ucLeaveRequestSetup_Employee_Comment")).sendKeys("Leaves");
		 Thread.sleep(1000);
		 
	 }

	 @Given("^User clicks save button$")
	 public void user_clicks_save_button() throws Throwable {
		 driver.findElement(By.id("ctl00_cphRootContent_ucLeaveRequestSetup_btnSave")).click();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 }

	 @When("^User clicks submit for approval button$")
	 public void user_clicks_submit_for_approval_button() throws Throwable {
		 driver.findElement(By.id("ctl00_cphRootContent_ucLeaveRequestSetup_btnTaskApprovalSubmit")).click();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 }

	 @Then("^Record is submitted$")
	 public void record_is_submitted() throws Throwable {
		 driver.findElement(By.id("ctl00_cphRootContent_ucLeaveRequestSetup_Message")).getText(); 
	    
	 }



}
