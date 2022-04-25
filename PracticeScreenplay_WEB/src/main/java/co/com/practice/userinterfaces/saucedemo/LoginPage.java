package co.com.practice.userinterfaces.saucedemo;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    public static final Target USERNAME_FIELD =
            Target.the("Username field").located(By.id("user-name"));

    public static final Target PASSWORD_FIELD =
            Target.the("Password field").located(By.id("password"));

    public static final Target LOGIN_SUBMIT_BUTTON =
            Target.the("Login submit button").located(By.id("login-button"));
}
