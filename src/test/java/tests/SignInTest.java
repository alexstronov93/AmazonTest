package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInTest extends BaseTest {

    private final static String INVALID_EMAIL = "AAAAAA";

    @Test
    public void testInvalidSignIn() {
        getHomePage().clickSignInMenu();
        getSignInPage().signIn(INVALID_EMAIL);
        Assert.assertTrue(getSignInPage().isError());
    }

}
