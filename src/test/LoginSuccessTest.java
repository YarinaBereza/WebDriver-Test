package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.CommonMethods;

@Test
public class LoginSuccessTest extends CommonMethods {
    public static void main(String[]args) throws InterruptedException {

        setUp("http://localhost:7080/login");
        LoginPage login = new LoginPage();

        login.userName.sendKeys("tomsmith");

        login.password.sendKeys("SuperSecretPassword!");

        login.loginButton.click();

        boolean logoutButtonIsPresent = login.logoutButton.isDisplayed();
        Assert.assertTrue(logoutButtonIsPresent);
        System.out.println("Test is passed. User has logged in with valid credentials");

        //String actualSuccessMessageText = login.successMessage.getText();
        //String expectedSuccessMessageText = "You logged into a secure area!";
        //Assert.assertEquals(actualSuccessMessageText, expectedSuccessMessageText);

        tearDown();
    }
}
