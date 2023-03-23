package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utils.CommonMethods;

import java.util.List;
@Test
public class MouseHoverTest extends CommonMethods {
    public static void main (String[]args){
        setUp("http://localhost:7080/hovers");

        List<WebElement> images = driver.findElements(By.cssSelector("img[alt = 'User Avatar']"));
        Actions action = new Actions(driver);
        List<WebElement> texts = driver.findElements(By.xpath("//h5[contains(text(), 'name: ')]"));

        for(WebElement image:images){
            action.moveToElement(image).perform();
            for(WebElement text : texts){
                if(text.isDisplayed()){
                    System.out.println("Test is passed. Additional information is displayed for the image");
                }else{
                    System.out.println("Test is failed");
                }
                break;
            }
            }
        tearDown();
        }
    }

