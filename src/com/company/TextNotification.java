package com.company;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

public class TextNotification extends Notification{


    private String recipient;

    private String smsProvider;





    //
    // getter methods below
    //

    public String getRecipient() {
        return recipient;
    }

    public String getSmsProvider() {
        return smsProvider;
    }





    //
    // Constructor below
    //
    public TextNotification(String subject, String body, String recipient, String smsProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smsProvider = smsProvider;
        this.showWords();
    }

    @Override
    public void transport() {
        System.out.println("Subject: " + this.getSubject());
        System.out.println("Body: " + this.getBody());
        System.out.println("Recipient: " + this.getRecipient());
        System.out.println("SMS Provider: " + this.getSmsProvider());

    }
}
