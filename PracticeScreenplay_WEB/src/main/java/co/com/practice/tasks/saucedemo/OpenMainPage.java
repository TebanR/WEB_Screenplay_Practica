package co.com.practice.tasks.saucedemo;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static co.com.practice.utils.Dictionary.WEB_BASE_URL;

public class OpenMainPage implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(
                Open.url(WEB_BASE_URL)
        );
    }

    public static OpenMainPage openMainPage() {
        return new OpenMainPage();
    }
}
