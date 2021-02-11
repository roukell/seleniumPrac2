import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class EndtoEnd {
    public void EndtoEnd() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "//Users//yi-linglo//Documents//webDrivers//chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        // click on One Way
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();

        // select destinations
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='BLR']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='GOI']")).click();

        // select calendar also making sure the return date is disabled
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
        if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
            System.out.println("it's disabled");
            Assert.assertFalse(false);
        } else {
            Assert.assertTrue(false);
        }

        // select numbers of passengers
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000);
        for (int i = 1; i < 5; i++) {
            driver.findElement(By.id("hrefIncAdt")).click();
        }

        // select currency
        driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("option[value='USD']")).click();

        // submit form
        driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

        driver.close();

    }
}
