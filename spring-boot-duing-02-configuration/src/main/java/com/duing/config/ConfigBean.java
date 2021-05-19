package com.duing.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "food")
public class ConfigBean {

    private String rice;
    private String meat;

    public String getRice() {
        return rice;
    }

    public void setRice(String rice) {
        this.rice = rice;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }
}
