package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utils.CommonMethods;
@Test
public class DynamicContentTest extends CommonMethods {
    public static void main(String[]args) throws InterruptedException {
        setUp("http://localhost:7080/dynamic_content");
        WebElement content = driver.findElement(By.id("content"));
        String contentText = content.getText();

        for(int i =0; i<2; i++){
            driver.navigate().refresh();
            String newContentText = content.getText();
            if(!contentText.equals(newContentText)){
                System.out.println("Content is changing");
            }else{
                System.out.println("failed");
            }
        }
tearDown();

    }
}
