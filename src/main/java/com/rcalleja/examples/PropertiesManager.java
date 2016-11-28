package com.rcalleja.examples;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.stereotype.Component;

/**
 * Created by ryancalleja on 28/11/16.
 */
@ConfigurationProperties(prefix = "example.email")
@Component
public class PropertiesManager {

    private String from;

    private RegistrationProperties registration = new RegistrationProperties();

    private VerificationProperties verification = new VerificationProperties();

    public class RegistrationProperties extends AbstractEmailProperties {}

    public class VerificationProperties extends AbstractEmailProperties {}

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public RegistrationProperties getRegistration() {
        return registration;
    }

    public void setRegistration(RegistrationProperties registration) {
        this.registration = registration;
    }

    public VerificationProperties getVerification() {
        return verification;
    }

    public void setVerification(VerificationProperties verification) {
        this.verification = verification;
    }
}
