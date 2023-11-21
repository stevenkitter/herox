package com.luxcaseict.catalogservice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "polar")
public class PolarProperties {
    /**
     * A message to welcome users.
     */
    private String greeting;

    public String getGreeting() {
        return greeting;
    }

    /**
     * A message to welcome users.
     */
    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
