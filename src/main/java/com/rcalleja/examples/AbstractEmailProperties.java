package com.rcalleja.examples;

/**
 * Created by ryancalleja on 28/11/16.
 */
public abstract class AbstractEmailProperties {

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
