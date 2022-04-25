package co.com.practice.utils.enums.saucedemo;

public enum ProductsValues {
    SAUCE_LABS_BACKPACK_PRODUCT("Sauce Labs Backpack"),
    SAUCE_LABS_BIKE_LIGHT_PRODUCT("Sauce Labs Bike Light"),
    SAUCE_LABS_BOLT_T_SHIRT_PRODUCT("Sauce Labs Bolt T-Shirt");

    private final String value;

    ProductsValues(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
