package designpattern.factory;

//Create an interface Notification with a method notifyUser().
//
//Create three classes SMSNotification, EmailNotification, and PushNotification implementing Notification.
//
//Create a NotificationFactory with a method createNotification(String type).
//
//Write a test to show how to get different notifications and call notifyUser()

interface  Notification{
    void notifyUser();
}

class SMSNotification implements Notification{

    @Override
    public void notifyUser() {
        System.out.println("SMSNotification : ");
    }
}

class EmailNotification implements Notification{

    @Override
    public void notifyUser() {
        System.out.println("EmailNotification : ");
    }
}


class PushNotification implements Notification{

    @Override
    public void notifyUser() {
        System.out.println("PushNotification : ");
    }
}

class NotificationFactory {
   public Notification createNotification(String type){
       if(type==null){
           return null;
       }

       switch(type){
           case "SMSNotification" :
               return new SMSNotification();
           case "EmailNotification" :
               return new EmailNotification();
           case "PushNotification" :
               return new PushNotification();
           default :
               return null;
       }
   }
}

public class NotificationMain {

    public static void main(String[] args) {

        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification("PushNotification");
        notification.notifyUser();
    }
}
