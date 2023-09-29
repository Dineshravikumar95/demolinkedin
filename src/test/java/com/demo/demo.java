package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.linkedin.com/home");
		WebElement email = driver.findElement(By.xpath("//*[@id=\"session_key\"]"));
		email.sendKeys(("DUP@gmail.com"));
		Thread.sleep(5000);
		WebElement password = driver.findElement(By.xpath("//input[@id=\"session_password\"]"));
		password.sendKeys("DUP123");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(5000);
	

	}
	

}
