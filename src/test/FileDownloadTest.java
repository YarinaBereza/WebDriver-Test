package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

public class FileDownloadTest extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        setUp("http://localhost:7080/download");

        WebElement link = driver.findElement(By.xpath("//a[contains(text(), 'some')]"));
        link.click();
        Thread.sleep(4000);
        tearDown();
tearDown();
    }
}
