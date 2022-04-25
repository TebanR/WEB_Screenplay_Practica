package co.com.practice.userinterfaces.saucedemo;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CartPage extends PageObject {
    public static final Target SHOPPING_CART_BUTTON =
            Target.the("Shopping cart button")
                    .located(By.xpath("//a[@class='shopping_cart_link']"));

    public static final Target CHECKOUT_BUTTON =
            Target.the("Checkout button")
                    .located(By.id("checkout"));
}
