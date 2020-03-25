package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class signout_page 
{
	WebDriver driver;
	By signin=By.xpath("//*[@id=\"MenuContent\"]/a[2]");
	By username=By.name("username");
	By password=By.name("password");
	By submit=By.xpath("//*[@id=\"Catalog\"]/form/input");
	By signout = By.xpath("//*[@id=\"MenuContent\"]/a[2]");


public void url() {
	System.setProperty("webdriver.chrome.driver","D:\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
}
public void loginpage()
{
	driver.get("https://petstore.octoperf.com/actions/Catalog.action");
	System.out.println(driver.getTitle());
}
public void logindetails() {

	WebElement link =driver.findElement(signin); 
	
	Actions action = new Actions(driver);
	action.moveToElement(link);
	action.click().perform();
	driver.findElement(username).sendKeys("315126514138");
	driver.findElement(password).clear(); 
	driver.findElement(password).sendKeys("7702065605"); 
}
public void submit() 
{
	driver.findElement(submit).click(); 
}

public void signout()
{
	driver.findElement(signout).click();
}
}
