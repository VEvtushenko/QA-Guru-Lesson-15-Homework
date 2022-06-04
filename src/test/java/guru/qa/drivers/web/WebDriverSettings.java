package guru.qa.drivers.web;

import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;
import quru.qa.config.web.WebTestConfig;


public class WebDriverSettings {

    static WebTestConfig webTestConfig = ConfigFactory.create(WebTestConfig.class, System.getProperties());

    public static void webDriverSettings() {
        Configuration.browser = webTestConfig.browser();
        Configuration.browserVersion = webTestConfig.browserVersion();
        Configuration.browserSize = webTestConfig.browserSize();
        Configuration.baseUrl = webTestConfig.baseUrl();
        if (!(webTestConfig.remoteHub().equals(""))) {
            Configuration.remote = webTestConfig.remoteHub();
        }
    }
}
