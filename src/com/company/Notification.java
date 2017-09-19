package com.company;

import java.time.LocalDateTime;     //imported this class

public abstract class Notification {

    private LocalDateTime createdAt;

    private String subject;

    private String body;

    protected String status;







    //
    // getter methods below
    //

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }

    public String getStatus() {
        return status;
    }


    //
    // public transport method below
    //

    public abstract void transport();


    protected void showStatus(){
        System.out.println(status);
    }

    protected void showWords(){       // this is the protected words to be printed
        System.out.println("hey, we are some random words that are protected in notification class!");
    }





    //
    //constructor below
    //

    public Notification(String subject, String body) {
        this.subject = subject;     //sets the instance variables
        this.body = body;           //sets the instance variables
        this.createdAt = LocalDateTime.now(); //sets the local time to now!
        this.status = "online, default";

    }


}
