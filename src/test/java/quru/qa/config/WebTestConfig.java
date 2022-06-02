package quru.qa.config;

import org.aeonbits.owner.Config;


@Config.Sources({
        "system:properties",
        "classpath:config/localconfig.properties",
        "classpath:config/remoteconfig.properties"})

public interface WebTestConfig extends Config {
    String browser();
    String browserVersion();
    String browserSize();
    String remoteHub();
    String baseUrl();
}
