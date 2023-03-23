package utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import testbase.BaseClass;

import java.util.List;

public class CommonMethods extends BaseClass {
    public static void click(WebElement element) {
        element.click();
    }



    public static void isSelected (List<WebElement> checkboxes){
        boolean flag = false;
        for (WebElement cb : checkboxes) {
            if (!cb.isSelected()) {
                flag = true;
            } else {
                flag = false;
            }

            System.out.println("Unchecked");
        }
        //Assert.assertTrue(flag);
    }
}
