package co.com.practice.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/saucedemo/addToCart.feature",
        glue = "co.com.practice.stepsdefinitions.saucedemo.addtocart",
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class AddToCartRunner {
}
