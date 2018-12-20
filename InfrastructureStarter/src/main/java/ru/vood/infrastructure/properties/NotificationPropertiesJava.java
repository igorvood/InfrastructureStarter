package ru.vood.infrastructure.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.ArrayList;

@ConfigurationProperties(prefix = "ppp")
public class NotificationPropertiesJava {

    private ArrayList<String> mails;

    public ArrayList<String> getMails() {
        return mails;
    }

    public void setMails(ArrayList<String> mails) {
        NotificationProperties properties = new NotificationProperties();
//        properties.
        this.mails = mails;
    }
}
