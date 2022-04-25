package co.com.practice.userinterfaces.saucedemo;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductsPage extends PageObject {
    public static final Target SAUCE_LABS_BACKPACK =
            Target.the("Sauce Labs Backpack")
                    .located(By.xpath("//div[@class='inventory_item_name'][contains(string(), 'Sauce Labs Backpack')]"));

    public static final Target SAUCE_LABS_BIKE_LIGHT =
            Target.the("Sauce Labs Bike Light")
                    .located(By.xpath("//div[@class='inventory_item_name'][contains(string(), 'Sauce Labs Bike Light')]"));

    public static final Target SAUCE_LABS_BOLT_T_SHIRT =
            Target.the("Sauce Labs Bolt T-Shirt")
                    .located(By.xpath("//div[@class='inventory_item_name'][contains(string(), 'Sauce Labs Bolt T-Shirt')]"));

    public static final Target ADD_TO_CART_BUTTON =
            Target.the("Add to cart button")
                    .located(By.xpath("//button[contains(string(), 'Add to cart')]"));


}
