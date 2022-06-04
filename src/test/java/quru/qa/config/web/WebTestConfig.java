package quru.qa.config.web;

import org.aeonbits.owner.Config;


@Config.Sources({"classpath:config/web/${localOrRemote}config.properties"})

public interface WebTestConfig extends Config {
    @Key("browserName")
    String browser();
    @Key("browserVersion")
    String browserVersion();
    @Key("browserSize")
    String browserSize();
    @Key("remoteHub")
    String remoteHub();
    @Key("baseUrl")
    String baseUrl();
}
