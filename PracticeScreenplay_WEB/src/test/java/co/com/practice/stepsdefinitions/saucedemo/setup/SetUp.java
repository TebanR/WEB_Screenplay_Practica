package co.com.practice.stepsdefinitions.saucedemo.setup;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static co.com.practice.utils.Dictionary.ACTOR_NAME;
import static co.com.practice.utils.switches.chrome.ChromeSwitches.*;

public class SetUp {
    @Managed
    protected WebDriver webDriver;

    private void setUpBrowser() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments(INCOGNITO, START_MAXIMIZED, DISABLE_NOTIFICATIONS, DISABLE_PLUGINS);
        webDriver = new ChromeDriver(options);
    }

    private void setUpStageAndActor() {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled(ACTOR_NAME);
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(webDriver));
    }

    protected void generalSetUp() {
        setUpBrowser();
        setUpStageAndActor();
    }
}
