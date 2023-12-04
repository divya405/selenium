package com.hrms.lib;
import org.openqa.selenium.By;
import com.hrms.utility.Log;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;


public class General extends Global {
	public void openAppilcation(){
		driver = new ChromeDriver();
		driver.navigate().to(url);
		System.out.println("openAppliaction");
		Log.info("Application opened"); 
		Reporter.log("Application opened"); }
	

		
	public void closeApplication() {
		driver.quit();
		System.out.println("close App");
		Log.info("Application closed"); 
		Reporter.log("Application opened"); }
			
		
		
	public void login(){
			driver.findElement(By.name(txt_loginname)).sendKeys(un);
			driver.findElement(By.name(txt_password)).sendKeys(pw);
			driver.findElement(By.name(btn_login)).click();
			System.out.println("login app");
			Log.info("Application login"); 
			Reporter.log("Application opened"); }
		
	public void logout() {
			driver.findElement(By.linkText(link_logout)).click();
			System.out.println("Logout completed");
			Log.info("Application logout");
			Reporter.log("Application opened");  }
	public void enterFrame() {
		driver.switchTo().frame(frame_empinfo);
		System.out.println("Entered into frame");
		Log.info("Application frame");
		Reporter.log("Application opened"); }
		
	public void exitFrame( ) {
		driver.switchTo().defaultContent();
		System.out.println("Exit from frame");
		Log.info("Application frame exit"); 
		Reporter.log("Application frame exit"); 
		}
	public void addNewEmp() {
		driver.findElement(By.xpath(btn_Add)).click();
		driver.findElement(By.name(txt_efn)).sendKeys(efn);
		driver.findElement(By.name(txt_eln)).sendKeys(eln);
		driver.findElement(By.id(btn_save)).click();
		System.out.println("new Emp Added");
		Log.info("Application emp add");
		Reporter.log("Application emp add"); 
		}
		
		
	}


