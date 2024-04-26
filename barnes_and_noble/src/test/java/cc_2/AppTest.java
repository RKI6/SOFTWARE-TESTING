package cc_2;

// import static org.junit.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.IOException;
// import java.util.concurrent.TimeoutException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.support.ui.Select;
// import org.slf4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;

public class AppTest 
{
    WebDriver driver;
    XSSFWorkbook workbook ;
    XSSFSheet sheet;
    ExtentReports reports;
    // Logger logger;
    FileInputStream inputStream;
    String searchValue;

    @BeforeMethod()
    public void beforeMethod()throws IOException
    {
        driver = new ChromeDriver();
        inputStream = new FileInputStream("C:\\Users\\D E L L\\Desktop\\sample.xlsx");
        workbook = new XSSFWorkbook(inputStream);
        sheet = workbook.getSheetAt(1);
        searchValue = sheet.getRow(0).getCell(0).getStringCellValue();
    }
    @Test(priority = 1)
    public void shouldAnswerWithTrue()throws  InterruptedException
    {
        driver.get("https://www.barnesandnoble.com/");
        Thread.sleep(1000);
        // driver.findElement(By.cssSelector(".rhf-search-select")).click();
        WebElement dropDown = driver.findElement(By.xpath("/html/body/div[2]/header/nav/div/div[3]/form/div/div[1]"));
        Thread.sleep(2000);
        dropDown.click();
        
        driver.findElement(By.xpath("/html/body/div[2]/header/nav/div/div[3]/form/div/div[1]/div/a[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/header/nav/div/div[3]/form/div/div[2]/div/input[1]")).sendKeys(searchValue);
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/header/nav/div/div[3]/form/div/span/button")).click();
        Thread.sleep(3000);
        String s = driver.findElement(By.xpath("/html/body/main/div[2]/div[1]/div[3]/div[2]/div/div/section[1]/section[1]/div/div[1]/div[1]/h1/span")).getText();
       Assert.assertEquals(s, "Chetan Bhagat");
    }
    @Test() 
    public void testCase2 ()throws InterruptedException
    {
        driver.get("https://www.barnesandnoble.com/");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/header/nav/div/div[3]/form/div/div[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/header/nav/div/div[3]/form/div/div[1]/div/a[3]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"rhfCategoryFlyout_Audiobooks\"]")).click();


    }

        
}
