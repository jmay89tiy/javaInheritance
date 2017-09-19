package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here


        TextNotification textOne = new TextNotification("dogs", "the dog is out", "mom", "Verizon");

        EmailNotification emailOne = new EmailNotification("cats", "the cat does not get along with dog", "dad", "Tmobile");

        Object emailNotificationClone = emailOne.clone();


        textOne.transport();
        emailOne.transport();
        textOne.showStatus();
        emailOne.showStatus();
        textOne.showWords();

        System.out.println("Are they equal: " + emailOne.equals(emailNotificationClone));

    }

}
