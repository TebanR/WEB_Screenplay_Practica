package co.com.practice.utils.faker.saucedemo;

import co.com.practice.models.saucedemo.CheckoutDataInformation;
import com.github.javafaker.Faker;

public class RandomCheckoutDataInformation {

    private RandomCheckoutDataInformation() {
    }

    public static CheckoutDataInformation generateRandomCheckoutData() {
        CheckoutDataInformation checkoutDataInformation = new CheckoutDataInformation();
        Faker faker = new Faker();
        checkoutDataInformation.setFirstName(faker.name().firstName());
        checkoutDataInformation.setLastName(faker.name().lastName());
        checkoutDataInformation.setZipCode(faker.address().zipCode());
        return checkoutDataInformation;
    }
}
