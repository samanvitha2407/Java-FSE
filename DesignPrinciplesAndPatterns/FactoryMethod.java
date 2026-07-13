package DesignPrinciplesAndPatterns;


interface Notification {
    void send(String message);
}


class EmailNotification implements Notification {
    public void send(String message) {
        System.out.println("Sending Email: " + message);
    }
}

class SmsNotification implements Notification {
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}


abstract class NotificationFactory {

    public abstract Notification createNotification();

    public void deliverNotification(String message) {
        Notification notification = createNotification();
        notification.send(message);
    }
}


class EmailNotificationFactory extends NotificationFactory {
    public Notification createNotification() {
        return new EmailNotification();
    }
}

class SmsNotificationFactory extends NotificationFactory {
    public Notification createNotification() {
        return new SmsNotification();
    }
}


public class FactoryMethod {
    public static void main(String[] args) {

        NotificationFactory emailFactory = new EmailNotificationFactory();
        emailFactory.deliverNotification("Hello! Your order has been shipped.");

        System.out.println("----------------------------------------");


        NotificationFactory smsFactory = new SmsNotificationFactory();
        smsFactory.deliverNotification("Alert: Your OTP is 123456.");
    }
}
