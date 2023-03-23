package test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.CommonMethods;
@Test
public class IframeTest extends CommonMethods {
    public static void main (String[] args){
        setUp("http://localhost:7080/iframe");

        WebElement button = driver.findElement(By.cssSelector("button[class = 'tox-notification__dismiss tox-button tox-button--naked tox-button--icon']"));
        button.click();

        driver.switchTo().frame("mce_0_ifr");

        WebElement textField = driver.findElement(By.id("tinymce"));
        textField.clear();
        textField.sendKeys("Hello World!");

        String actualText = textField.getText();
        String expectedText = "Hello World!";


        Assert.assertEquals(actualText, expectedText);
        System.out.println("Test is passed. The typed text is as expected");

        tearDown();
    }
}
