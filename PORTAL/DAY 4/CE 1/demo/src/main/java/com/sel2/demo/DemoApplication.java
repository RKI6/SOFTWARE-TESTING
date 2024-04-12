package com.sel2.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws InterruptedException {
		// chromedriver
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.shoppersstop.com/");
		driver.findElement(By.id("profileImage")).click();
		//firefox
		WebDriver driver2 =new FirefoxDriver();
		driver2.findElement(By.id("profileImage")).click();
		driver2.get("https://www.shoppersstop.com/");
		//edge
		WebDriver driver3 = new EdgeDriver();
		driver3.findElement(By.id("profileImage")).click();
		driver3.get("https://www.shoppersstop.com/");
		
		
		
		SpringApplication.run(DemoApplication.class, args);
	}

}
