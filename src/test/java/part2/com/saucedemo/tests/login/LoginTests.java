package part2.com.saucedemo.tests.login;

import org.testng.Assert;
import org.testng.annotations.Test;
import part2.com.saucedemo.base.BaseTest;

public class LoginTests extends BaseTest {

    @Test
    public void testLoginErrorMessage() {
       loginPage.setUsernameField("standard_user");
       loginPage.setPasswordField("123");
       loginPage.clickLoginButton();

       String actualResult = loginPage.getErrorMessage();
        Assert.assertTrue(actualResult.contains("Epic sadface:"));
    }
}
