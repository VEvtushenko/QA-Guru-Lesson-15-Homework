package guru.qa.tests.webTests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import quru.qa.config.WebDriverSettings;

public class TestBase {

    @BeforeAll
    static void setup() {
        SelenideLogger.addListener("Allure", new AllureSelenide());
        WebDriverSettings.webDriverSettings();
//        Configuration.browser = "chrome";
//        Configuration.browserVersion = "102.0";
//        Configuration.browserSize = "1920x1080";
//        Configuration.remote = "127.0.0.1";

        Configuration.baseUrl = "https://www.tinkoff.ru/";
    }

    @AfterEach
    void addAtachments() {

        Selenide.closeWebDriver();
    }
}
