package co.com.practice.stepsdefinitions.saucedemo.addtocart;

import co.com.practice.stepsdefinitions.saucedemo.setup.SetUp;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static co.com.practice.questions.saucedemo.OrderCompletedMessage.orderCompletedMessage;
import static co.com.practice.tasks.saucedemo.AddToCart.addToCart;
import static co.com.practice.tasks.saucedemo.CompletePurchase.completePurchase;
import static co.com.practice.tasks.saucedemo.LogIn.logInWith;
import static co.com.practice.tasks.saucedemo.OpenMainPage.openMainPage;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class AddToCartStepDefinitions extends SetUp {
    @Before
    public void setUp() {
        generalSetUp();
    }

    @Given("the user is in the main page")
    public void theUserIsInTheMainPage() {
        theActorInTheSpotlight().wasAbleTo(openMainPage());
    }

    @When("he login with his credentials")
    public void heLoginWithHisCredentials(DataTable credentials) {
        theActorInTheSpotlight().attemptsTo(logInWith(credentials));
    }

    @When("add a item {string} to the cart")
    public void add_a_item_to_the_cart(String item) {
        theActorInTheSpotlight().attemptsTo(addToCart().the(item));
    }

    @When("proceed to complete the purchase of your item")
    public void proceedToCompleteThePurchaseOfYourItem() {
        theActorInTheSpotlight().attemptsTo(completePurchase());
    }

    @Then("should see the message {string}")
    public void shouldSeeTheMessage(String messageExpected) {
        theActorInTheSpotlight().should(seeThat(orderCompletedMessage(), equalTo(messageExpected)));
    }

}
