package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utils.CommonMethods;
@Test
public class FileUploadTest extends CommonMethods {
    public static void main(String[]args){
        setUp("http://localhost:7080/upload");

        WebElement selectFile = driver.findElement(By.id("file-upload"));
        selectFile.sendKeys("/Users/artyomburenko/Desktop/Google.png");

        WebElement uploadButton = driver.findElement(By.id("file-submit"));
        uploadButton.click();

tearDown();
    }
}
