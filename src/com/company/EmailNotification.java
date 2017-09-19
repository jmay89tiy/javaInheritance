package com.company;

public class EmailNotification extends Notification{




    private String recipient;

    private String smtpProvider;

    protected String Status;





    //
    //getter methods below
    //
    public String getRecipient() {
        return recipient;
    }

    public String getSmtpProvider() {
        return smtpProvider;
    }





    //
    // super constructor below --> converts from Notification class
    //
    public EmailNotification(String subject, String body, String recipient, String smtpProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smtpProvider = smtpProvider;
        this.status = "unique status";

    }






    //
    // override option below with annotation
    //
    @Override
    public void transport() {
        System.out.println("Subject: " + this.getSubject());
        System.out.println("Body: " + this.getBody());
        System.out.println("Recipient: " + this.getRecipient());
        System.out.println("SMTP Provider: " + this.getSmtpProvider());

    }

    @Override
    public void showWords() {
        System.out.println("Public showWords with Override:");;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmailNotification)) return false;

        EmailNotification that = (EmailNotification) o;

        if (getRecipient() != null ? !getRecipient().equals(that.getRecipient()) : that.getRecipient() != null)
            return false;
        if (getSmtpProvider() != null ? !getSmtpProvider().equals(that.getSmtpProvider()) : that.getSmtpProvider() != null)
            return false;
        return getStatus() != null ? getStatus().equals(that.getStatus()) : that.getStatus() == null;
    }

    @Override
    public int hashCode() {
        int result = getRecipient() != null ? getRecipient().hashCode() : 0;
        result = 31 * result + (getSmtpProvider() != null ? getSmtpProvider().hashCode() : 0);
        result = 31 * result + (getStatus() != null ? getStatus().hashCode() : 0);
        return result;
    }

    @Override
    protected Object clone() {
        return new EmailNotification(getSubject(), getBody(), recipient, smtpProvider);
    }
}

