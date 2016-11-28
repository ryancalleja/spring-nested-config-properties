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

    @NestedConfigurationProperty()
    private RegistrationProperties registration = new RegistrationProperties();
    @NestedConfigurationProperty()
    private VerificationProperties verification = new VerificationProperties();

    public class RegistrationProperties {
        private String subject;
        private String plain;
        private String html;

        public String getSubject() {
            return subject;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }

        public String getPlain() {
            return plain;
        }

        public void setPlain(String plain) {
            this.plain = plain;
        }

        public String getHtml() {
            return html;
        }

        public void setHtml(String html) {
            this.html = html;
        }
    }

    public class VerificationProperties {
        private String subject;
        private String plain;
        private String html;

        public String getSubject() {
            return subject;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }

        public String getPlain() {
            return plain;
        }

        public void setPlain(String plain) {
            this.plain = plain;
        }

        public String getHtml() {
            return html;
        }

        public void setHtml(String html) {
            this.html = html;
        }
    }

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
