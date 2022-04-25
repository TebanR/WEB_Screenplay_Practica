package co.com.practice.questions.saucedemo;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.practice.userinterfaces.saucedemo.CheckoutPage.MESSAGE_CONFIRMATION_ORDER;

public class OrderCompletedMessage implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(MESSAGE_CONFIRMATION_ORDER).answeredBy(actor).trim();
    }

    public static OrderCompletedMessage orderCompletedMessage() {
        return new OrderCompletedMessage();
    }
}
