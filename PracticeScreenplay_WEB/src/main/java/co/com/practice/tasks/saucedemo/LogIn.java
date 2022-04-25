package co.com.practice.tasks.saucedemo;

import co.com.practice.models.saucedemo.LoginCredentials;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

import static co.com.practice.userinterfaces.saucedemo.LoginPage.*;
import static co.com.practice.utils.converterdatatables.saucedemo.ConvertLoginCredentials.convertDataTableToLoginInfo;

public class LogIn implements Task {
    private LoginCredentials loginCredentials;
    private DataTable dataTable;

    public LogIn(DataTable dataTable) {
        this.dataTable = dataTable;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        loginCredentials = convertDataTableToLoginInfo(dataTable);
        actor.attemptsTo(
                SendKeys.of(loginCredentials.getUsername()).into(USERNAME_FIELD),
                SendKeys.of(loginCredentials.getPassword()).into(PASSWORD_FIELD),
                Click.on(LOGIN_SUBMIT_BUTTON)
        );
    }

    public static LogIn logInWith(DataTable credentials) {
        return new LogIn(credentials);
    }
}
