package day_5.ce;

import java.sql.DriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CeApplication {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.findElement(By.linkText("Laptops")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("MacBook air")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Add to cart")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Cart")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/button")).click();
		Thread.sleep(1500);
		driver.findElement(By.id("name")).sendKeys("Albert");
		Thread.sleep(1500);
		driver.findElement(By.id("country")).sendKeys("INDIA");
		Thread.sleep(1500);
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button[2]")).click();
		SpringApplication.run(CeApplication.class, args);
	}

}
