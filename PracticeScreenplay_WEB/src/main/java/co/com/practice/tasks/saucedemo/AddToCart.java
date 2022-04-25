package co.com.practice.tasks.saucedemo;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;

import static co.com.practice.userinterfaces.saucedemo.ProductsPage.*;
import static co.com.practice.utils.enums.saucedemo.ProductsValues.*;

public class AddToCart implements Task {
    private String item;

    public AddToCart the(String item) {
        this.item = item;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Check.whether(item.equals(SAUCE_LABS_BACKPACK_PRODUCT.getValue()))
                        .andIfSo(Click.on(SAUCE_LABS_BACKPACK))
                        .otherwise(Check.whether(item.equals(SAUCE_LABS_BIKE_LIGHT_PRODUCT.getValue()))
                                .andIfSo(Click.on(SAUCE_LABS_BIKE_LIGHT))
                                .otherwise(Check.whether(item.equals(SAUCE_LABS_BOLT_T_SHIRT_PRODUCT.getValue()))
                                        .andIfSo(Click.on(SAUCE_LABS_BOLT_T_SHIRT)))),
                Click.on(ADD_TO_CART_BUTTON)
        );
    }

    public static AddToCart addToCart() {
        return new AddToCart();
    }
}
