package co.com.practice.utils.converterdatatables.saucedemo;

import co.com.practice.models.saucedemo.LoginCredentials;
import io.cucumber.datatable.DataTable;

public class ConvertLoginCredentials {

    private ConvertLoginCredentials() {
    }

    public static LoginCredentials convertDataTableToLoginInfo(DataTable dataTable) {
        LoginCredentials loginCredentials = new LoginCredentials();
        loginCredentials.setUsername(dataTable.cell(1, 0));
        loginCredentials.setPassword(dataTable.cell(1, 1));
        return loginCredentials;
    }
}
