package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.CommonMethods;
@Test
public class LoginFailureTest extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {

        setUp("http://localhost:7080/login");
        LoginPage login = new LoginPage();

        login.userName.sendKeys("tom");

        login.password.sendKeys("Super");

        login.loginButton.click();

        Thread.sleep(2000);

        boolean loginButtonIsPresent = login.loginButton.isDisplayed();
        Assert.assertTrue(loginButtonIsPresent);
        System.out.println("Test is passed. You cannot login with invalid credentials");

//        String actualErrorMessageText = login.errorMessage.getText();
//        String expectedErrorMessageText = "Your username is invalid!";
//        Assert.assertEquals(actualErrorMessageText, expectedErrorMessageText);

       tearDown();
    }
}

