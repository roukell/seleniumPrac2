import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class ShoppingCart {
    public void ShoppingCart() throws InterruptedException {

        String[] shoppingList = {"Cucumber", "Carrot", "Beans", "Tomato"};

        System.setProperty("webdriver.chrome.driver", "//Users//yi-linglo//Documents//webDrivers//chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        // waiting for the page to load
        Thread.sleep(3000);
        addItems(driver, shoppingList);

        driver.close();
    }

    public static void addItems(WebDriver driver, String[] shoppingList) {
        int j = 0;
        List<WebElement> products = driver.findElements(By.cssSelector("h4[class='product-name']"));

        // loop through products
        // use .size() to check ArrayList length
        for (int i = 0;  i < products.size(); i++) {
            // 1. format product name by removing unnecessary text e.g. Cucumber - 1Kg
            // name[0] = cucumber
            // name[1] = - 1Kg
            String[] name = products.get(i).getText().split("-");

            // 2. remove extra space
            String formattedName = name[0].trim();

            // 3. convert array into arrayList
            List shoppingListAsList = Arrays.asList(shoppingList);

            // 4. check if items in shoppingList is in shoppingListAsList
            if (shoppingListAsList.contains(formattedName)) {
                j++;

                //click on add to cart
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

                // use .length to check Array length
                if (j == shoppingList.length) break;
            }
        }
    }
}
