import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

// TestNG is one of the testing framework
// Assertion helps us to validate whether the result that Selenium returns is expected or not
// if not, test will fail
public class Assertion {
    public void Assertion() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "//Users//yi-linglo//Documents//webDrivers//chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        // assertFalse expects false in the argument
        // if false, test pass
        // if true, test fail and stop
        Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());

        // tick the checkbox
        driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();

        // expect true
        Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());


        // here I want to book tickets for 5 people
        // and then ? 5 adults pass : fail
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000); // not a good practice, but leave it for now.

        for (int i = 1; i < 5; i++) {
            driver.findElement(By.id("hrefIncAdt")).click();
        };

        // check text
        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");

        driver.close();
    }
}
