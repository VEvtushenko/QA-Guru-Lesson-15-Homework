package guru.qa.tests.web;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import guru.qa.drivers.web.WebDriverSettings;

public class TestBase {

    @BeforeAll
    static void setup() {
        SelenideLogger.addListener("Allure", new AllureSelenide());
        System.getProperty("localOrRemote", "local");
        WebDriverSettings.webDriverSettings();
    }

    @AfterEach
    void addAtachments() {
        Selenide.closeWebDriver();
    }
}
