package co.com.practice.tasks.saucedemo;

import co.com.practice.models.saucedemo.CheckoutDataInformation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

import static co.com.practice.userinterfaces.saucedemo.CartPage.*;
import static co.com.practice.userinterfaces.saucedemo.CheckoutPage.*;
import static co.com.practice.utils.faker.saucedemo.RandomCheckoutDataInformation.generateRandomCheckoutData;

public class CompletePurchase implements Task {
    private CheckoutDataInformation checkoutDataInformation;

    @Override
    public <T extends Actor> void performAs(T actor) {
        checkoutDataInformation = generateRandomCheckoutData();
        actor.attemptsTo(
                Click.on(SHOPPING_CART_BUTTON),
                Click.on(CHECKOUT_BUTTON),
                SendKeys.of(checkoutDataInformation.getFirstName()).into(FIRST_NAME),
                SendKeys.of(checkoutDataInformation.getLastName()).into(LAST_NAME),
                SendKeys.of(checkoutDataInformation.getZipCode()).into(ZIP_CODE),
                Click.on(CONTINUE_BUTTON),
                Click.on(FINISH_PROCESS_BUTTON)
        );
    }

    public static CompletePurchase completePurchase() {
        return new CompletePurchase();
    }
}
