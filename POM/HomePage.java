import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
    public static void navigateToContactUs(WebDriver driver) {
        WebElement contactUsElement = driver.findElement(By.linkText("Contact us"));
        clickWhenReady(driver, contactUsElement, 3000);
    }

}




/*

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
    public static void navigateToContactUs(WebDriver driver) {
        WebElement contactUsElement = driver.findElement(By.linkText("Contact us"));
        clickWhenReady(driver, contactUsElement, 3000);
    }
}

*/