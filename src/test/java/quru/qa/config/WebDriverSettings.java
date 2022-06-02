package quru.qa.config;

import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;


public class WebDriverSettings {

    public static WebTestConfig webTestConfig = ConfigFactory.create(WebTestConfig.class, System.getProperties());

    public static void webDriverSettings() {
        String isRemote = System.getProperty("isRemote", "No");
        Configuration.browser = webTestConfig.browser();
        Configuration.browserVersion = webTestConfig.browserVersion();
        Configuration.browserSize = webTestConfig.browserSize();
        Configuration.baseUrl = webTestConfig.baseUrl();

        if (!(webTestConfig.remoteHub().equals("")) & isRemote.equals("Yes")) {
            Configuration.remote = webTestConfig.remoteHub();
        }
    }
}
