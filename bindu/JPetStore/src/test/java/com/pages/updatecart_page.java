package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class updatecart_page 
{
	WebDriver driver;

	By search = By.xpath("//*[@id=\"SearchContent\"]/form/input[1]");
	By searchbutton = By.xpath("//*[@id=\"SearchContent\"]/form/input[2]");
	By productID = By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[2]/b/a/font");
	By ItemID = By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a");
	By addtocart = By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[7]/td/a");
	By quantity = By.xpath("//*[@id=\"Cart\"]/form/table/tbody/tr[2]/td[5]/input");
	By updatecart = By.xpath("//*[@id=\"Cart\"]/form/table/tbody/tr[3]/td[1]/input");

	public updatecart_page(WebDriver driver)
	{
		this.driver = driver;
	}

	public void url() 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://petstore.octoperf.com/actions/Catalog.action");
	}


	public void search()
	{
		driver.findElement(search).sendKeys("fish");
	}

	public void searchbutton()
	{
		driver.findElement(searchbutton).click();
	}

	public void productID()
	{
		driver.findElement(productID).click();
	}

	public void ItemID()
	{
		driver.findElement(ItemID).click();
	}

	public void addtocart()
	{
		driver.findElement(addtocart).click();

	}

	public void quantity()
	{
		driver.findElement(quantity).clear();
		
		driver.findElement(quantity).sendKeys("2");
	}

	public void updatecart() 
	{
		driver.findElement(updatecart).click();

		driver.close();
		
	}
}
