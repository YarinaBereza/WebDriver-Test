package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.CommonMethods;
@Test
public class FloatingMenuTest extends CommonMethods {

    public static void main(String[] args){
        setUp("http://localhost:7080/floating_menu");

        WebElement buttonElement = driver.findElement(By.xpath("//a[contains(text(), 'Elemental')]"));

        JavascriptExecutor js =  (JavascriptExecutor) driver;

        js.executeScript("arguments[0].scrollIntoView(false)", buttonElement);

        WebElement floatingMenu = driver.findElement(By.id("menu"));

        Assert.assertTrue(!floatingMenu.isDisplayed());
        System.out.println("Test is passed. The floating menu is still displayed");

        tearDown();
    }
}
