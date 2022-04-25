package co.com.practice.userinterfaces.saucedemo;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckoutPage extends PageObject {
    public static final Target FIRST_NAME =
            Target.the("First name")
                    .located(By.id("first-name"));

    public static final Target LAST_NAME =
            Target.the("Last name")
                    .located(By.id("last-name"));

    public static final Target ZIP_CODE =
            Target.the("Zip code")
                    .located(By.id("postal-code"));

    public static final Target CONTINUE_BUTTON =
            Target.the("Contine button")
                    .located(By.id("continue"));

    public static final Target FINISH_PROCESS_BUTTON =
            Target.the("Finish process button")
                    .located(By.id("finish"));

    public static final Target MESSAGE_CONFIRMATION_ORDER =
            Target.the("Message confirmation order")
                    .located(By.xpath("//h2[@class='complete-header']"));
}
